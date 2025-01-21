package com.xworkz.electronics.runner;

import com.xworkz.electronics.things.ElectronicsDetails;
import com.xworkz.electronics.things.OperationsOfElectronics;

public class ElectronicRunner {
	public static void main(String[] args) {
		ElectronicsDetails details=new ElectronicsDetails();
		details.setBrandName("Nokia");
		details.setDistributionName("Ravi Electronics");
		details.setNameOfElectronic("Android TV");
		details.setNoOfItems(12);
		
		ElectronicsDetails details2=new ElectronicsDetails();
		details2.setBrandName("Samsang");
		details2.setDistributionName("Gokul Electronics");
		details2.setNameOfElectronic("Lamps");
		details2.setNoOfItems(50);
		
		
		OperationsOfElectronics electronics=new OperationsOfElectronics();
		electronics.saveDetails(details);
		electronics.saveDetails(details2);
		electronics.readDetails();
//		electronics.deleteDetails(1);
		electronics.readDetails();
//		electronics.deleteDetails(12);
		electronics.readDetails();
		
		ElectronicsDetails updatedDetails=new ElectronicsDetails();
		updatedDetails.setBrandName("Dell");
		updatedDetails.setDistributionName("Ravi Electronics");
		updatedDetails.setNameOfElectronic("Smart phone");
		updatedDetails.setNoOfItems(12);
		
		electronics.updateByNoOfItems(updatedDetails);
		electronics.readDetails();
		System.out.println("=====================================================");
		electronics.searchByBrandName("Dell");
		
		
		
	}
}
