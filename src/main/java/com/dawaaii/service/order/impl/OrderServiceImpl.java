package com.dawaaii.service.order.impl;

import com.dawaaii.model.order.Order;
import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.repository.mongo.order.OrderRepository;
import com.dawaaii.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rohit on 1/1/16.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrdersByVendor(Vendor vendor) {
        return orderRepository.findByAmbulanceVendor(vendor);
    }
}
