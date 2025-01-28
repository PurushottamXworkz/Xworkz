package com.xworkz.fitnesscenter.runner;

import com.xworkz.fitnesscenter.dto.FitnessCenterDto;
import com.xworkz.fitnesscenter.service.FitnessCenterService;
import com.xworkz.fitnesscenter.service.FitnessServiceCenterImplementation;

public class FitnessCenterRunner {
	public static void main(String[] args) {
		System.out.println("This is Main method");
		
		FitnessCenterDto centerDto=new FitnessCenterDto();
		centerDto.setNameOfTrainee("Prashant");
		centerDto.setNameOfTrainer("Bablu");
		centerDto.setNameOfFitnessCenter("Bubli Gym Center");
		centerDto.setReasonToJoin("Muscle gain");
		centerDto.setAddress("M R Nagar");
		System.out.println("Fitness Center Details:"+centerDto);
		
		FitnessCenterService centerService=new FitnessServiceCenterImplementation();
		centerService.validateAndSave(centerDto);
		
		FitnessCenterDto centerDto2=new FitnessCenterDto();
		centerDto2.setNameOfFitnessCenter("Bhim Gym Center");
		centerDto2.setNameOfTrainee(null);
		centerDto2.setNameOfTrainer("Bhimu");
		centerDto2.setReasonToJoin("Loose weight");
		centerDto2.setAddress("Old DSP Office");
		System.out.println("Fitness Center Details:"+centerDto2);
		
		FitnessCenterService centerService2=new FitnessServiceCenterImplementation();
		centerService2.validateAndSave(centerDto2);
		
		FitnessCenterService centerService3=new FitnessServiceCenterImplementation();
		centerService3.validateAndSave(null);
	}
}
