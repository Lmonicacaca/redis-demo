package com.example.redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
    @Autowired
    private FilterInvocationSecurityMetadataSource filterInvocationSecurityMetadataSource;



    @RequestMapping("/toMenu")
    public String toMenu(){
        return "menu";
    }

    @RequestMapping("/toOrderList")
    public String toOrderList(){
        return "orderList";
    }
}
