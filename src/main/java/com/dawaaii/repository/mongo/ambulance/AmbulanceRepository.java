package com.dawaaii.repository.mongo.ambulance;

import com.dawaaii.model.ambulance.Ambulance;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rohit on 10/12/15.
 */
public interface AmbulanceRepository extends MongoRepository<Ambulance,String> {
}
