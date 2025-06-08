package com.xworkz.railwaybooking.controller;

import com.xworkz.railwaybooking.dto.RailwayBookingDto;
import com.xworkz.railwaybooking.service.RailwayBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RailwayBookingController {
    @Autowired
    RailwayBookingService service;
    @GetMapping("redirectToRegister")
    public String getRegister(){
        return "register";
    }

//    @GetMapping("redirectToRegister")
//    public String getPassengerInfo(){
//        return "passengerInfo.jsp";
//    }

    @PostMapping("saveData")
    public String getData(RailwayBookingDto dto, Model model){
        System.out.println(" Name : " + dto.getUserName() +" Email :"+dto.getEmail()+" Password :"+dto.getPassword()+" Phone Number :"+dto.getPhoneNumber());
        model.addAttribute("userName",dto.getUserName());
        model.addAttribute("email",dto.getEmail());
        model.addAttribute("password",dto.getPassword());
        model.addAttribute("phoneNumber",dto.getPhoneNumber());
        String details = service.saveData(dto);
        return "success";
    }



}
