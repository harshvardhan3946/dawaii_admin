package com.dawaaii.service.vendor;

import com.dawaaii.model.vendor.Vendor;

/**
 * Created by rohit on 10/12/15.
 */
public interface VendorService {

    Vendor saveVendor(Vendor vendor);

    Vendor getByUserName(String email);
}