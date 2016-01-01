package com.dawaaii.repository.mongo.ambulancebooking;

import com.dawaaii.model.ambulancebooking.AmbulanceBooking;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by rohit on 1/1/16.
 */
public interface AmbulanceBookingRepository extends MongoRepository<AmbulanceBooking, String> {
    List<AmbulanceBooking> findByAmbulanceId(String ambulanceId);
}
