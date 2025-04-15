package com.xworkz.restaurant.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="restinfo")
@Setter
@Getter
@ToString

public class RestEntity {
    @Id
    @Column(name="restaurant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurant_id;
    @Column(name="restaurant_name")
    private String restaurant_name;
    @Column(name="restaurant_address")
    private String restaurant_address;
    @Column(name="restaurant_owner")
    private String restaurant_owner;
    @Column(name="contact")
    private long contact;
    @Column(name="famous_for")
    private String famous_for;
}
