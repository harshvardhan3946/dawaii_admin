package com.dawaaii.viewmodel.ambulance;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.vendor.Vendor;
import org.springframework.data.geo.Point;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by rohit on 10/12/15.
 */
public class AmbulanceViewModel {

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
    private CommonsMultipartFile file;

    private String vehicleName;
    private String vehicleModel;
    private String driverName;
    private String vehicleNumber;

    public AmbulanceViewModel(Ambulance ambulance){
        this.serviceProviderName = ambulance.getServiceProviderName();
        this.description = ambulance.getDescription();
        this.city = ambulance.getCity();
        this.state = ambulance.getState();
        this.area = ambulance.getArea();
        this.address = ambulance.getAddress();
        this.contactNumber = ambulance.getContactNumber();
        this.mobileNumber = ambulance.getMobileNumber();
        this.email = ambulance.getEmail();
        this.point = ambulance.getPoint();
        this.vendor = ambulance.getVendor();
        this.imagePath = ambulance.getImagePath();
        //todo get this file from the file system
        this.file = null;
        this.vehicleName=ambulance.getVehicleName();
        this.vehicleModel = ambulance.getVehicleModel();
        this.driverName = ambulance.getDriverName();
        this.vehicleNumber = ambulance.getVehicleNumber();
    }

    public Ambulance getAmbulanceFromViewModel(Vendor vendor){
        Ambulance ambulance = new Ambulance();
        ambulance.setServiceProviderName(this.serviceProviderName);
        ambulance.setDescription(this.description);
        ambulance.setCity(this.city);
        ambulance.setState(this.state);
        ambulance.setArea(this.area);
        ambulance.setAddress(this.address);
        ambulance.setContactNumber(this.contactNumber);
        ambulance.setMobileNumber(this.mobileNumber);
        ambulance.setEmail(this.email);
        ambulance.setPoint(new Point(0,0));
        ambulance.setVendor(vendor);
        ambulance.setImagePath(this.imagePath);
        ambulance.setVehicleModel(this.vehicleModel);
        ambulance.setVehicleName(this.vehicleName);
        ambulance.setDriverName(this.driverName);
        return ambulance;
    }

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

    public CommonsMultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
