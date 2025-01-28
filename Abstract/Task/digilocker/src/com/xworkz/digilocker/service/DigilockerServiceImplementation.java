package com.xworkz.digilocker.service;

import com.xworkz.digilocker.dto.DigilockerDto;

public class DigilockerServiceImplementation extends DigilockerService {
	
	
	@Override
	public String validateAndSave(DigilockerDto dto) {
		if (dto != null) {
			if (dto.getAddress() != null && dto.getAddress().length() > 3) {
				System.out.println("Address Validated data Saved");
			} else {
				System.err.println("Not validated data");
			}
			if (dto.getDateOfBirth() != null && dto.getDateOfBirth().length() == 8) {
				System.out.println("DOB Validated data Saved");
			} else {
				System.err.println("Not validated data");
			}
			if (dto.getNameOfPerson() != null && dto.getNameOfPerson().length() > 3) {
				System.out.println("Name Of Person Validated data Saved");
			} else {
				System.err.println("Not validated data");
			}
			if (dto.getPassword() != null && dto.getPassword().length() > 6) {
				System.out.println("Password Validated data Saved");
			} else {
				System.err.println("Not validated data");
			}
			if (dto.getPlaceOfBirth() != null && dto.getPlaceOfBirth().length() > 3) {
				System.out.println("Place Of Birth Validated data Saved");
			} else {
				System.err.println("Not validated data");
			}
		}
		return "Data is Null";
	}
}
