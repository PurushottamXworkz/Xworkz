package com.xworkz.hospital.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="patient_details")
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="doctor_name")
    private String doctor_name;
    @Column(name="num_of_patients")
    private int num_of_patients;
    @Column(name="patient_name")
    private String patient_name;
}
