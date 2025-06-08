package com.xworkz.hospital.dto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class HospitalDto {

    private int id;
    private String doctor_name;
    private int num_of_patients;
    private String patient_name;
}
