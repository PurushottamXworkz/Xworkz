package com.xworkz.complete_crud_operation.runner;

import com.xworkz.complete_crud_operation.things.PersonDetails;
import com.xworkz.complete_crud_operation.things.PersonDetailsOperation;

public class PersonDetailsRunner {
	
	public static void main(String[] args) {
		
		PersonDetails details=new PersonDetails();
		details.setPersonName("Raghav");
		details.setAddress("Gadag");
		details.setState("Karnataka");
		details.setCountry("India");
		
		PersonDetails details2=new PersonDetails();
		details2.setPersonName("Radhe");
		details2.setAddress("Nagpur");
		details2.setState("Gujarat");
		details2.setCountry("India");
		
		PersonDetails details3=new PersonDetails();
		details3.setPersonName("Yukti");
		details3.setState("Berlin");
		details3.setAddress("Cartner region");
		details3.setCountry("Germany");
		
		PersonDetailsOperation detailsOperation=new PersonDetailsOperation();
		detailsOperation.saveDetails(details);
		detailsOperation.saveDetails(details2);
		detailsOperation.saveDetails(details3);
		detailsOperation.saveDetails(details);
		detailsOperation.saveDetails(details2);
		detailsOperation.saveDetails(details);
		detailsOperation.saveDetails(details2);
		System.out.println("=======================READ===============================");
		detailsOperation.readDetails();
		System.out.println("=======================UPDATE==================================");
		PersonDetails update=new PersonDetails();
		update.setPersonName("Yukti");
		update.setAddress("Dharwad");
		update.setState("Karnataka");
		update.setCountry("India");
		
		detailsOperation.updateDetailsByPersonName(update);
		System.out.println("========================Read======================================");
		detailsOperation.readDetails();
		
		
	}
}
