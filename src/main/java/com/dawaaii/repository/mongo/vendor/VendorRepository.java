package com.dawaaii.repository.mongo.vendor;

import com.dawaaii.model.vendor.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rohit on 10/12/15.
 */
public interface VendorRepository extends MongoRepository<Vendor,String> {
    Vendor findByEmail(String email);
}
