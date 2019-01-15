package com.example.redisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @RequestMapping("/toMenu")
    public String toMenu(){
        return "menu";
    }

    @RequestMapping("/toOrderList")
    public String toOrderList(){
        return "orderList";
    }
}
