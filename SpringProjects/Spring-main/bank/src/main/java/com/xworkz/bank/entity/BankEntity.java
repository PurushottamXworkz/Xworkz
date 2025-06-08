package com.xworkz.bank.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Table(name="customer_info")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int customerId;

    @Column(name="customerName")
    private String customerName;

    @Column(name="email")
    private String email;

    @Column(name="phoneNumber")
    private long phoneNumber;
}
