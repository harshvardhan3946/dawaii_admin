package com.dawaaii.service.ambulance.impl;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.repository.mongo.ambulance.AmbulanceRepository;
import com.dawaaii.service.ambulance.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rohit on 10/12/15.
 */
@Service
public class AmbulanceServiceImpl implements AmbulanceService {

    private AmbulanceRepository ambulanceRepository;

    @Autowired
    public AmbulanceServiceImpl(AmbulanceRepository ambulanceRepository){
        this.ambulanceRepository = ambulanceRepository;
    }
    @Override
    public Ambulance save(Ambulance ambulance) {
        return ambulanceRepository.save(ambulance);
    }

    @Override
    public Ambulance getById(String id) {
        return ambulanceRepository.findOne(id);
    }

    @Override
    public List<Ambulance> getAll() {
        return ambulanceRepository.findAll();
    }

    @Override
    public List<Ambulance> getByVendor(Vendor vendor) {
        return ambulanceRepository.findByVendor(vendor);
    }

    @Override
    public Long getCount() {
        return ambulanceRepository.count();
    }
}