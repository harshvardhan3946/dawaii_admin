package com.dawaaii.service.ambulancebooking.impl;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.ambulancebooking.AmbulanceBooking;
import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.repository.mongo.ambulance.AmbulanceRepository;
import com.dawaaii.repository.mongo.ambulancebooking.AmbulanceBookingRepository;
import com.dawaaii.service.ambulance.AmbulanceService;
import com.dawaaii.service.ambulancebooking.AmbulanceBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohit on 1/1/16.
 */
@Service
public class AmbulanceBookingServiceImpl implements AmbulanceBookingService {

    @Autowired
    private AmbulanceBookingRepository ambulanceBookingRepository;
    @Autowired
    private AmbulanceService ambulanceService;

    @Override
    public List<AmbulanceBooking> getByAmbulanceId(String id) {
        return ambulanceBookingRepository.findByAmbulanceId(id);
    }

    @Override
    public List<AmbulanceBooking> getByVendor(Vendor vendor) {
        List<Ambulance> ambulances = ambulanceService.getByVendor(vendor);
        List<AmbulanceBooking> ambulanceBookings = new ArrayList<AmbulanceBooking>();
        for(Ambulance ambulance : ambulances){
            ambulanceBookings.addAll(getByAmbulanceId(ambulance.getId()));
        }
        return ambulanceBookings;
    }
}
