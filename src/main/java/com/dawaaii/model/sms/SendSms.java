package com.dawaaii.model.sms;

/**
 * Created by rohit on 11/1/16.
 */
public class SendSms {
    String message;
    String number;

    public SendSms(String message, String number) {
        this.message = message;
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}