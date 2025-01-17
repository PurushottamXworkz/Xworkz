package com.xworkz.createandreadoperatin.runner;

import com.xworkz.createandreadoperatin.things.HousesDetails;
import com.xworkz.createandreadoperatin.things.OperationsHouses;

public class HousesRunner {
	public static void main(String[] args) {
		
		HousesDetails details=new HousesDetails();
		details.setOwnedBy("Raghu");
		details.setNameOfHouse("Sherley Home");
		details.setContact(8041245741l);
		details.setAddress("Los Angels");
		
		OperationsHouses houses=new OperationsHouses();
		houses.saveDetails(details);
		houses.saveDetails(details);
		houses.saveDetails(details);
		houses.saveDetails(details);
		houses.saveDetails(details);
		houses.saveDetails(details);
		houses.saveDetails(details);
		houses.readDetails();
		
	}
}
