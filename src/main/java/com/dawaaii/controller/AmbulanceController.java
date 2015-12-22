package com.dawaaii.controller;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.file.FileUpload;
import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.service.ambulance.AmbulanceService;
import com.dawaaii.service.vendor.VendorService;
import com.dawaaii.util.FileUtil;
import com.dawaaii.viewmodel.ambulance.AmbulanceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by rohit on 11/12/15.
 */
@Controller
@RequestMapping("ambulance")
public class AmbulanceController {

    @Autowired
    private AmbulanceService ambulanceService;
    @Autowired
    private VendorService vendorService;

    @RequestMapping("/registerPage")
    public String registerAmbulancePage(){
        return "ambulance/registerAmbulance";
    }


    @RequestMapping(value = "/register", method = POST)
    public String registerAmbulance(AmbulanceViewModel ambulanceViewModel){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            Vendor vendor = vendorService.getByEmail(userDetails.getUsername());
            String filePath = "/opt/dawaaii/upload/"+ambulanceViewModel.getServiceProviderName();
            FileUtil.createDirectoryIfNotExist(filePath);
            String savedFilePath = filePath+"/"+ambulanceViewModel.getFile().getOriginalFilename();
            File file = new File(savedFilePath);
            try {
                FileCopyUtils.copy(ambulanceViewModel.getFile().getBytes(), file);
                ambulanceViewModel.setImagePath(savedFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Ambulance ambulance = ambulanceViewModel.getAmbulanceFromViewModel(vendor);
            ambulanceService.save(ambulance);
            return "ambulance/registerAmbulanceSuccess";
        }
        return "error";
    }
}