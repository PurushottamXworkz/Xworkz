package com.xworkz.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeController {
    @GetMapping("redirectToRegister")
    public String getRegister(){
        return "register.jsp";
    }

    @PostMapping("saveData")
    public String getData(String userName, String email, String phoneNumber, Model model){
        System.out.println("User Name " + userName + "email" +email+"phone number"+phoneNumber);
        model.addAttribute("name",userName);
        model.addAttribute("email",email);
        model.addAttribute("phoneNumber",phoneNumber);

        return "success.jsp";
    }
}
