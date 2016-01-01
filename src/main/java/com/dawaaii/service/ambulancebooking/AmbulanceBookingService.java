package com.dawaaii.service.ambulancebooking;

import com.dawaaii.model.ambulancebooking.AmbulanceBooking;

import java.util.List;

/**
 * Created by rohit on 1/1/16.
 */
public interface AmbulanceBookingService {

    List<AmbulanceBooking> getByAmbulanceId(String id);
}
