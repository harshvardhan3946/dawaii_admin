package com.dawaaii.service.ambulancebooking.impl;

import com.dawaaii.model.ambulancebooking.AmbulanceBooking;
import com.dawaaii.repository.mongo.ambulance.AmbulanceRepository;
import com.dawaaii.repository.mongo.ambulancebooking.AmbulanceBookingRepository;
import com.dawaaii.service.ambulancebooking.AmbulanceBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rohit on 1/1/16.
 */
@Service
public class AmbulanceBookingServiceImpl implements AmbulanceBookingService {

    @Autowired
    private AmbulanceBookingRepository ambulanceBookingRepository;

    @Override
    public List<AmbulanceBooking> getByAmbulanceId(String id) {
        return ambulanceBookingRepository.findByAmbulanceId(id);
    }
}
