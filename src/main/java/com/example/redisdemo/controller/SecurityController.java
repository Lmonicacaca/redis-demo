package com.example.redisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SecurityController {

    @RequestMapping("/loginError")
    public String loginError(HttpServletRequest request){
        request.setAttribute("error","error");
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
