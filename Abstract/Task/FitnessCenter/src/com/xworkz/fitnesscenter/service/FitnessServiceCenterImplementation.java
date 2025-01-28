package com.xworkz.fitnesscenter.service;

import com.xworkz.fitnesscenter.dto.FitnessCenterDto;

public class FitnessServiceCenterImplementation extends FitnessCenterService {
	
	FitnessCenterDto[] dtos=new FitnessCenterDto[2];
	int index=0;
	
	public String validateAndSave(FitnessCenterDto dto) {
		System.out.println("Validate and Save method invoke :"+dto);
		if (dto != null) {
//			if (dto.getNameOfFitnessCenter() != null) {
//				System.out.println("Validated and save Fitness center name");
//			} else {
//				System.err.println("Invalid data to save");
//			}
//			if (dto.getNameOfTrainee() != null && dto.getNameOfTrainee().length() > 3) {
//				System.out.println("Validated and save Fitness Trainee name");
//			} else {
//				System.err.println("Invalid data to save");
//			}
//			if (dto.getNameOfTrainer() != null && dto.getNameOfTrainer().length() > 3) {
//				System.out.println("Validated and save Fitness Trainer name");
//			} else {
//				System.err.println("Invalid data to save");
//			}
//			if (dto.getAddress() != null && dto.getAddress().length() > 3) {
//				System.out.println("Validated and save Fitness address");
//			} else {
//				System.err.println("Invalid data to save");
//			}
//			if (dto.getReasonToJoin() != null) {
//				System.out.println("Validated and save Fitness Reason");
//			} else {
//				System.err.println("Invalid data to save");
//			}
			boolean result=this.onSave(dto);
			if(result==true) {
				System.out.println("Saved successfully Fitness center");
			}else {
				System.out.println("Not Saved Fitness center");
			}
		}
		return "Data is Not Valid";
	}
	
	public boolean onSave(FitnessCenterDto dto) {
		System.out.println("Save mathod invoke");
		if(this.index<dtos.length) {
			dtos[this.index]=dto;
			return true; 
		}
		return false;
	}
	
}
