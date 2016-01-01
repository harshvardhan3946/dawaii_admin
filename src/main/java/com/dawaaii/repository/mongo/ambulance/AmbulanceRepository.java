package com.dawaaii.repository.mongo.ambulance;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.vendor.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by rohit on 10/12/15.
 */
public interface AmbulanceRepository extends MongoRepository<Ambulance,String> {
    List<Ambulance> findByVendor(Vendor vendor);
}
