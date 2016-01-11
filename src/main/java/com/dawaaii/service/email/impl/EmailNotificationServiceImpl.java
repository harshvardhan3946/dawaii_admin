package com.dawaaii.service.email.impl;

import com.dawaaii.service.email.EmailNotificationService;
import com.dawaaii.util.ReadPropertyFileUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

/**
 * Created by rohit on 10/1/16.
 */
@Service
public class EmailNotificationServiceImpl implements EmailNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailNotificationServiceImpl.class);
    private static final String TEMPLATE_NAME = "smtpConfigurationTemplate";

    @Async
    @Override
    public String sendEmail(String toRecipients, String bccRecipients, String ccRecipients, String subject, String bodyText) {
        LOGGER.info("Sending email to " + toRecipients);
        String emailSendingStatus = "N";
        try {
            boolean emailEnabled = Boolean.parseBoolean(ReadPropertyFileUtility.readPropertyFromFile("mail.smtp.isEnabled", TEMPLATE_NAME));
            if (emailEnabled == true) {
                LOGGER.debug("SMPT Server is allowed to send emails !");
                final String userName = ReadPropertyFileUtility.readPropertyFromFile("mail.userName", TEMPLATE_NAME);
                final String passWord = ReadPropertyFileUtility.readPropertyFromFile("mail.password", TEMPLATE_NAME);

                Properties props = new Properties();
                props.put("mail.smtp.auth", ReadPropertyFileUtility.readPropertyFromFile("mail.smtp.auth", TEMPLATE_NAME));
                props.put("mail.smtp.starttls.enable", ReadPropertyFileUtility.readPropertyFromFile("mail.smtp.starttls.enable", TEMPLATE_NAME));
                props.put("mail.smtp.host", ReadPropertyFileUtility.readPropertyFromFile("mail.smtp.host", TEMPLATE_NAME));
                props.put("mail.smtp.port", ReadPropertyFileUtility.readPropertyFromFile("mail.smtp.port", TEMPLATE_NAME));

                Session session = Session.getInstance(props,
                        new Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(userName, passWord);
                            }
                        }
                );
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(ReadPropertyFileUtility.readPropertyFromFile("mail.from",TEMPLATE_NAME)));
                message.setSubject(subject);
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(bodyText, "text/html");
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
                message.setContent(multipart);
                if (!toRecipients.equals("")) {
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toRecipients));
                }

                if (bccRecipients!=null && bccRecipients.length()>0) {
                    message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccRecipients));
                }

                if (ccRecipients!=null && ccRecipients.length()>0) {
                    message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccRecipients));
                }
                message.setSubject(subject);
                Transport.send(message);
                emailSendingStatus = "Y";

            }
        } catch (Exception ex) {
            LOGGER.error("Exception in sending email " , ex);
            emailSendingStatus = "N";
        }
        LOGGER.info("Email sent");
        return emailSendingStatus;
    }
}