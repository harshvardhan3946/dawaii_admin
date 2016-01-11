package com.dawaaii.service.sms.impl;

import com.dawaaii.model.sms.SendSms;
import com.dawaaii.service.sms.SMSNotificationService;
import com.dawaaii.util.ReadPropertyFileUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpStatus.OK;

/**
 * Created by rohit on 11/1/16.
 */
@Service
public class SMSNotificationServiceImpl implements SMSNotificationService {

    private static final String TEMPLATE_NAME = "smsConfigurationTemplate";
    private static final Logger LOGGER = LoggerFactory.getLogger(SMSNotificationServiceImpl.class);

    @Override
    public void sendSMS(SendSms sendSMS) {
        RestTemplate restTemplate = new RestTemplate();
        StringBuilder request = new StringBuilder();
        request.append(ReadPropertyFileUtility.readPropertyFromFile("sms.base.url", TEMPLATE_NAME))
                .append("username=")
                .append(ReadPropertyFileUtility.readPropertyFromFile("sms.username", TEMPLATE_NAME))
                .append("&password=")
                .append(ReadPropertyFileUtility.readPropertyFromFile("sms.password", TEMPLATE_NAME))
                .append("&type=0&dlr=1&destination=")
                .append(sendSMS.getNumber())
                .append("&source=TSTSMS&message=")
                .append(sendSMS.getMessage());
        ResponseEntity<String> stringResponseEntity = restTemplate.getForEntity(request.toString(), String.class);
        if (OK == stringResponseEntity.getStatusCode()) {
            LOGGER.debug(stringResponseEntity.toString());
        } else {
            LOGGER.debug("Error sending sms for request", request);
        }
    }
}