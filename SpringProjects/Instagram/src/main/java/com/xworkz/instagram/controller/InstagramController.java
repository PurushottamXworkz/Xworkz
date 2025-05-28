package com.xworkz.instagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InstagramController {
    @RequestMapping("/post")
    public String method1(){
        System.out.println("Hello welcome to Spring");
        return "index.jsp";
    }
}
