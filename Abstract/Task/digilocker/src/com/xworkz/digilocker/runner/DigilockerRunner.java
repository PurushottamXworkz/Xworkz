package com.xworkz.digilocker.runner;

import com.xworkz.digilocker.dto.DigilockerDto;
import com.xworkz.digilocker.service.DigilockerService;
import com.xworkz.digilocker.service.DigilockerServiceImplementation;

public class DigilockerRunner {
	public static void main(String[] args) {
		DigilockerDto dto =new DigilockerDto();
		dto.setNameOfPerson("Pichai");
		dto.setAddress("Chennai");
		dto.setDateOfBirth("01021987");
		dto.setPassword("Paasword123");
		dto.setPlaceOfBirth("Chennai");
		
		DigilockerService service=new DigilockerServiceImplementation();
		service.validateAndSave(dto);
		
	}	
}
