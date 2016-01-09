package com.dawaaii.viewmodel.vendor;

import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.model.vendor.VendorType;
import com.dawaaii.util.HashGenerator;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by rohit on 10/12/15.
 */
public class VendorViewModel {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String userName;
    private String profilePicPath;
    private String password;
    private String role;
    private boolean active;
    private String vendorType;
    private CommonsMultipartFile file;

    public VendorViewModel(){}

    public Vendor getVendorFromViewModel(){
        Vendor vendor = new Vendor();
        vendor.setFirstName(this.firstName);
        vendor.setLastName(this.lastName);
        vendor.setEmail(this.email);
        vendor.setPhoneNumber(this.phoneNumber);
        vendor.setAddress(this.address);
        vendor.setCity(this.city);
        vendor.setUserName(this.userName);
        vendor.setProfilePicPath(this.profilePicPath);
        vendor.setPassword(HashGenerator.getHash(this.password));
        vendor.setVendorType(VendorType.valueOf(this.vendorType));
        vendor.setRole("ROLE_USER");
        vendor.setActive(true);
        return vendor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePicPath() {
        return profilePicPath;
    }

    public void setProfilePicPath(String profilePicPath) {
        this.profilePicPath = profilePicPath;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public CommonsMultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }
}
