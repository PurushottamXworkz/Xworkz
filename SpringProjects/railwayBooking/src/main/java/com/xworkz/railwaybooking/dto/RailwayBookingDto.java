package com.xworkz.railwaybooking.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class RailwayBookingDto {
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
}
