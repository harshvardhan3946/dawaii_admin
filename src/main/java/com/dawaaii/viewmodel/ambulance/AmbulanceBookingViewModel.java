package com.dawaaii.viewmodel.ambulance;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.ambulancebooking.AmbulanceBooking;

import java.util.Date;

/**
 * Created by rohit on 9/1/16.
 */
public class AmbulanceBookingViewModel {
    private String name;
    private String email;
    private String number;
    private String vehicleNumber;
    private Date date;
    private Double price;

    public AmbulanceBookingViewModel(AmbulanceBooking ambulanceBooking, Ambulance ambulance) {
        this.name = ambulanceBooking.getName();
        this.email = ambulanceBooking.getEmail();
        this.number = ambulanceBooking.getNumber();
        this.vehicleNumber = ambulance.getVehicleNumber();
        this.date = ambulanceBooking.getCreatedOn();
        this.price = ambulance.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}