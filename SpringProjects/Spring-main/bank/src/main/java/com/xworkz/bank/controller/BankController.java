package com.xworkz.bank.controller;

import com.xworkz.bank.dto.BankDto;
import com.xworkz.bank.repo.BankRepoImpl;
import com.xworkz.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankController {
    @Autowired
    BankService service;
    @GetMapping("redirectToRegister")
    public String getRegisterPage(){
        return "register";
    }


    @PostMapping("saveData")
    public String getdata(BankDto dto, Model model){
        System.out.println("customerName: "+dto.getCustomerName()+"email: "+dto.getEmail()+"PhoneNumber: "+dto.getPhoneNumber());
        model.addAttribute("customerName "+dto.getCustomerName());
        model.addAttribute("email"+dto.getEmail());
        model.addAttribute("phoneNumber"+dto.getPhoneNumber());
        String details = service.saveData(dto);
        return "successfulReg";
    }

}
