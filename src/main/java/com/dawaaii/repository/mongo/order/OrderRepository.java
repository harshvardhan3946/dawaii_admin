package com.dawaaii.repository.mongo.order;

import com.dawaaii.model.order.Order;
import com.dawaaii.model.vendor.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by rohit on 1/1/16.
 */
public interface OrderRepository extends MongoRepository<Order, String>{
    List<Order> findByAmbulanceVendor(Vendor vendor);
}
