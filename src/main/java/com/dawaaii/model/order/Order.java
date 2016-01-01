package com.dawaaii.model.order;

import com.dawaaii.model.BaseDocument;
import com.dawaaii.model.ambulance.Ambulance;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by rohit on 1/1/16.
 */
@SuppressWarnings("serial")
@Document(collection = "ambulance")
public class Order extends BaseDocument {
    private Ambulance ambulance;
    private Date bookingFrom;
    private String bookingId;

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public Date getBookingFrom() {
        return bookingFrom;
    }

    public void setBookingFrom(Date bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}