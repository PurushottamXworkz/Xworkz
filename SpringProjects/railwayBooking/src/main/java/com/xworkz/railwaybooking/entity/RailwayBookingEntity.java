package com.xworkz.railwaybooking.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="railway_booking")
public class RailwayBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int regi_id;

    @Column(name="userName")
    private String userName;

    @Column(name="email")
    private String email;

    @Column(name="phoneNumber")
    private String phoneNumber;

    @Column(name="password")
    private String password;



}
