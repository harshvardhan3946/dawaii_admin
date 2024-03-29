package com.dawaaii.controller;

import com.dawaaii.model.ambulance.Ambulance;
import com.dawaaii.model.ambulancebooking.AmbulanceBooking;
import com.dawaaii.model.sms.SendSms;
import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.service.ambulance.AmbulanceService;
import com.dawaaii.service.ambulancebooking.AmbulanceBookingService;
import com.dawaaii.service.email.EmailNotificationService;
import com.dawaaii.service.sms.SMSNotificationService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

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
    @Autowired
    private EmailNotificationService emailNotificationService;
    @Autowired
    private SMSNotificationService smsNotificationService;

    @RequestMapping("/registerPage")
    public ModelAndView registerAmbulancePage( @RequestParam(value = "error", required = false) String error,
                                         @RequestParam(value = "msg", required = false) String message){
            ModelAndView modelAndView = new ModelAndView("vendor/register");
            modelAndView.addObject("msg",message);
            modelAndView.addObject("error",error);
            return modelAndView;
    }


    @RequestMapping(value = "/register", method = POST)
    public ModelAndView registerAmbulance(AmbulanceViewModel ambulanceViewModel,RedirectAttributes redirectAttributes){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            Vendor vendor = vendorService.getByUserName(userDetails.getUsername());
            String filePath = CommonConstants.BASE_PATH + ambulanceViewModel.getServiceProviderName()+"/"+ambulanceViewModel.getFile().getOriginalFilename();
            FileUtil.saveFile(filePath,ambulanceViewModel.getFile().getBytes());
            ambulanceViewModel.setImagePath(filePath);
            Ambulance ambulance = ambulanceViewModel.getAmbulanceFromViewModel(vendor);
            ambulanceService.save(ambulance);
            emailNotificationService.sendEmail(ambulance.getEmail(),null,null,"Ambulance Registered","Ambulance registration successful");
            SendSms sendSms = new SendSms("ambulance registration successful",ambulance.getMobileNumber());
            smsNotificationService.sendSMS(sendSms);
            redirectAttributes.addAttribute("msg","Registration successful");
            return new ModelAndView("redirect:/ambulance/registerPage");
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