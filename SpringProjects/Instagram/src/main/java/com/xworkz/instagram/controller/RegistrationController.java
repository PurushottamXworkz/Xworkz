package com.xworkz.instagram.controller;

import com.xworkz.instagram.Dto.InstagramDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RegistrationController {
    @PostMapping("/saving")
    public String saveMethod(@ModelAttribute InstagramDto dto){
        System.out.println("This is save operation"+dto);
        return "somepage.jsp";
    }
}
