package com.xworkz.passportseva.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name="passport_info")
public class passportseva {
    private int id;
    private String passportOffice;
    private String firstName;
    private String lastName;
    private LocalDate date;


}
