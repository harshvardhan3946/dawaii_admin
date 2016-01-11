package com.dawaaii.service.email;

/**
 * Created by rohit on 10/1/16.
 */
public interface EmailNotificationService {

    String sendEmail(String toRecipients, String bccRecipients, String ccRecipients, String subject, String bodyText);

}
