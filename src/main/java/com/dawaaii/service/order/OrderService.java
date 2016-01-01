package com.dawaaii.service.order;

import com.dawaaii.model.order.Order;
import com.dawaaii.model.vendor.Vendor;

import java.util.List;

/**
 * Created by rohit on 1/1/16.
 */
public interface OrderService {
    List<Order> getOrdersByVendor(Vendor vendor);
}
