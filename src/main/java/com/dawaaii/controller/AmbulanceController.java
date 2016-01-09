package com.dawaaii.controller;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.ambulancebooking.AmbulanceBooking;
import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.service.ambulance.AmbulanceService;
import com.dawaaii.service.ambulancebooking.AmbulanceBookingService;
import com.dawaaii.service.vendor.VendorService;
import com.dawaaii.util.CommonConstants;
import com.dawaaii.util.FileUtil;
import com.dawaaii.viewmodel.ambulance.AmbulanceBookingViewModel;
import com.dawaaii.viewmodel.ambulance.AmbulanceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by rohit on 11/12/15.
 */
@Controller
@RequestMapping("/ambulance")
public class AmbulanceController {

    @Autowired
    private AmbulanceService ambulanceService;
    @Autowired
    private VendorService vendorService;
    @Autowired
    private AmbulanceBookingService ambulanceBookingService;

    @RequestMapping("/registerPage")
    public String registerAmbulancePage(){
            return "vendor/register";
    }


    @RequestMapping(value = "/register", method = POST)
    public ModelAndView registerAmbulance(AmbulanceViewModel ambulanceViewModel){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            Vendor vendor = vendorService.getByUserName(userDetails.getUsername());
            String filePath = CommonConstants.BASE_PATH + ambulanceViewModel.getServiceProviderName()+"/"+ambulanceViewModel.getFile().getOriginalFilename();
            FileUtil.saveFile(filePath,ambulanceViewModel.getFile().getBytes());
            ambulanceViewModel.setImagePath(filePath);
            Ambulance ambulance = ambulanceViewModel.getAmbulanceFromViewModel(vendor);
            ambulanceService.save(ambulance);
            return new ModelAndView("redirect:vendor/register","success","Registration successful");
        }
        return new ModelAndView("error");
    }

    @RequestMapping(value = "/viewAmbulances")
    public ModelAndView viewAmbulances(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            Vendor vendor = vendorService.getByUserName(userDetails.getUsername());
            List<Ambulance> ambulanceList = ambulanceService.getByVendor(vendor);
            List<AmbulanceViewModel> ambulanceViewModelList = new ArrayList<AmbulanceViewModel>();
            for(Ambulance ambulance:ambulanceList){
                ambulanceViewModelList.add(new AmbulanceViewModel(ambulance));
            }
            return new ModelAndView("vendor/loginSuccess", "ambulanceList", ambulanceViewModelList);
        }
        return new ModelAndView("error");
    }

    @RequestMapping(value = "/viewOrders")
    public ModelAndView viewOrders(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            Vendor vendor = vendorService.getByUserName(userDetails.getUsername());
            List<AmbulanceBooking> ambulanceBookings = ambulanceBookingService.getByVendor(vendor);
            List<AmbulanceBookingViewModel> ambulanceViewModels = new ArrayList<AmbulanceBookingViewModel>();
            for(AmbulanceBooking ambulanceBooking:ambulanceBookings){
                ambulanceViewModels.add(new AmbulanceBookingViewModel(ambulanceBooking,ambulanceService.getById(ambulanceBooking.getAmbulanceId())));
            }
            return new ModelAndView("vendor/orders", "ambulanceBookings", ambulanceViewModels);
        }
        return new ModelAndView("error");
    }
}