package com.dawaaii.service.vendor.impl;

import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.repository.mongo.vendor.VendorRepository;
import com.dawaaii.service.vendor.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rohit on 10/12/15.
 */
@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Transactional
    @Override
    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor getByUserName(String email) {
        return vendorRepository.findByUserName(email);
    }
}
