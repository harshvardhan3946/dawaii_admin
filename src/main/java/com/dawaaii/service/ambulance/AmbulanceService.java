package com.dawaaii.service.ambulance;

import com.dawaaii.model.ambulance.Ambulance;

import java.util.List;

/**
 * Created by rohit on 3/11/15.
 */
public interface AmbulanceService {

    Ambulance save(Ambulance ambulance);

    Ambulance getById(String ambulanceId);

    List<Ambulance> getAll();

    Long getCount();

}
