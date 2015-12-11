package com.dawaaii.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by rohit on 8/12/15.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/", method = GET)
    public String test(){
        return "test";
    }
}
