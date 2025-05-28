package com.xworkz.instagram.Dto;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class InstagramDto {

    private String userName;
    private String password;
    private int id;
    private long contact;
    private String email;
}
