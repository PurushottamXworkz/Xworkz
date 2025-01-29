package com.xworkz.digilocker.service;

import com.xworkz.digilocker.dto.DigilockerDto;

public class DigilockerServiceImplementation extends DigilockerService {
	DigilockerDto digilockerDtos[]=new DigilockerDto[3];  
	int index=0;
	
	@Override
	public String validateAndSave(DigilockerDto dto) {
		System.out.println("Validate and save method invoke dto:"+dto);
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
			System.out.println("We can save");
			boolean saveResult=this.onSave(dto);
			if(saveResult==true) {
				System.out.println("Saved Successfully");
				return "Data Saved";
			}else {
				System.out.println("not Saved");
			}
		}
		return "Data is Null";
	}
	
	
	public boolean onSave(DigilockerDto dto) {
		System.out.println("Save method invoke");
		if(this.index<this.digilockerDtos.length) {
			digilockerDtos[this.index]=dto;
			this.index++;
			return true;
		}
		return false;
	}
	
	
}
