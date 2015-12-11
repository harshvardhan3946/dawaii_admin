package com.dawaaii.model.ambulance;

import com.dawaaii.model.BaseDocument;
import com.dawaaii.model.vendor.Vendor;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rohit on 3/11/15.
 */
@SuppressWarnings("serial")
@Document(collection = "ambulance")
public class Ambulance extends BaseDocument {

    private String serviceProviderName;
    private String description;
    private String city;
    private String state;
    private String area;
    private String address;
    private String contactNumber;
    private String mobileNumber;
    private String email;
    private Point point;
    private Vendor vendor;
    private String imagePath;

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "serviceProviderName='" + serviceProviderName + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
