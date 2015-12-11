package com.dawaaii.viewmodel.vendor;

import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.util.HashGenerator;

/**
 * Created by rohit on 10/12/15.
 */
public class VendorViewModel {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String serviceProviderName;
    private String password;

    public Vendor getVendorFromViewModel(){
        Vendor vendor = new Vendor();
        vendor.setName(this.name);
        vendor.setEmail(this.email);
        vendor.setAddress(this.address);
        vendor.setPhoneNumber(this.phoneNumber);
        vendor.setServiceProviderName(this.serviceProviderName);
        vendor.setPassword(HashGenerator.getHash(this.password));
        vendor.setRole("ROLE_USER");
        vendor.setActive(true);
        return vendor;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
