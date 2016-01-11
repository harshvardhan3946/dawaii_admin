package com.dawaaii.service.sms;

import com.dawaaii.model.sms.SendSms;

/**
 * Created by rohit on 11/1/16.
 */
public interface SMSNotificationService {
    void sendSMS(SendSms sendSMS);
}
