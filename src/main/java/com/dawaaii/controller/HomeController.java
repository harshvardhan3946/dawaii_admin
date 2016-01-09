package com.dawaaii.controller;

import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.service.vendor.VendorService;
import com.dawaaii.util.CommonConstants;
import com.dawaaii.util.FileUtil;
import com.dawaaii.viewmodel.vendor.VendorViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

/**
 * Created by rohit on 27/11/15.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private VendorService vendorService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout,
            @RequestParam(value = "msg", required = false) String message) {

        ModelAndView model = new ModelAndView("index");
        model.addObject("msg", message);
        if (error != null) {
            model.addObject("error", "Either UserId or Password is incorrect, Try Again");
        }
        if (logout != null) {
            model.addObject("msg", "You have been logged out successfully.");
        }
        return model;
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register() {
        return "vendor/register";
    }

    @RequestMapping(value = "vendorRegister", method = RequestMethod.POST)
    public ModelAndView vendorRegister(VendorViewModel vendorViewModel){
        if(vendorService.getByUserName(vendorViewModel.getUserName()) != null){
            return new ModelAndView("vendor/register", "error", "user id already taken");
        }
        String filePath = CommonConstants.BASE_PATH + vendorViewModel.getUserName()+"/"+vendorViewModel.getFile().getOriginalFilename();
        FileUtil.saveFile(filePath,vendorViewModel.getFile().getBytes());
        vendorViewModel.setProfilePicPath(filePath);
        Vendor vendor = vendorViewModel.getVendorFromViewModel();
        vendorService.saveVendor(vendor);

        return new ModelAndView("index","msg","Registration successful!!");
    }

    @RequestMapping(value = "")
    public String index(){ return "index"; }
}