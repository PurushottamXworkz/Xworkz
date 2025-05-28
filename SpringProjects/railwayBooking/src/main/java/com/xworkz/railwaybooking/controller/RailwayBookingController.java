package com.xworkz.railwaybooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RailwayBookingController {
    @GetMapping("redirectToRegister")
    public String getRegister(){
        return "register.jsp";
    }

    @PostMapping("saveData")
    public String getData(String name, String email, String password, String phoneNumber, Model model){
        System.out.println(" User Name : " + name +" Email :"+email+" Password :"+password+" Phone Number :"+phoneNumber);
        model.addAttribute("Name",name);
        model.addAttribute("email",email);
        model.addAttribute("password",password);
        model.addAttribute("phoneNumber",phoneNumber);
        return "success.jsp";
    }
}
