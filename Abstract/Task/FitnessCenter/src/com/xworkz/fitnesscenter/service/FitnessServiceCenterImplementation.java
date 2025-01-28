package com.xworkz.fitnesscenter.service;

import com.xworkz.fitnesscenter.dto.FitnessCenterDto;

public class FitnessServiceCenterImplementation extends FitnessCenterService {

	public String validateAndSave(FitnessCenterDto dto) {
		if (dto != null) {
			if (dto.getNameOfFitnessCenter() != null) {
				System.out.println("Validated and save Fitness center name");
			} else {
				System.err.println("Invalid data to save");
			}
			if (dto.getNameOfTrainee() != null && dto.getNameOfTrainee().length() > 3) {
				System.out.println("Validated and save Fitness Trainee name");
			} else {
				System.err.println("Invalid data to save");
			}
			if (dto.getNameOfTrainer() != null && dto.getNameOfTrainer().length() > 3) {
				System.out.println("Validated and save Fitness Trainer name");
			} else {
				System.err.println("Invalid data to save");
			}
			if (dto.getAddress() != null && dto.getAddress().length() > 3) {
				System.out.println("Validated and save Fitness address");
			} else {
				System.err.println("Invalid data to save");
			}
			if (dto.getReasonToJoin() != null) {
				System.out.println("Validated and save Fitness Reason");
			} else {
				System.err.println("Invalid data to save");
			}
		}
		return "Data is Not Valid";
	}
	
	
	
}
