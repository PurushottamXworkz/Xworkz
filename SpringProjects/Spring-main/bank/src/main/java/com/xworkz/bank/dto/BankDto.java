package com.xworkz.bank.dto;

import com.xworkz.bank.entity.BankEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class BankDto {
    private int id;
    private String customerName;
    private String email;
    private long phoneNumber;
}
