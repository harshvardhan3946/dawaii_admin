package com.dawaaii.auth;

import com.dawaaii.model.vendor.Vendor;
import com.dawaaii.service.vendor.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rohit on 10/12/15.
 */

public class UserDetailServiceImpl implements UserDetailsService{

    @Autowired
    private VendorService vendorService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Vendor vendor = vendorService.getByUserName(username);
        if(vendor == null || !vendor.isActive()) {
            throw new UsernameNotFoundException("Name not found!");
        }
        else{
            List<SimpleGrantedAuthority> simpleGrantedAuthorities = Arrays.asList(new SimpleGrantedAuthority(vendor.getRole()));
            return  new User(vendor.getUserName(),vendor.getPassword(),simpleGrantedAuthorities);
        }
    }
}