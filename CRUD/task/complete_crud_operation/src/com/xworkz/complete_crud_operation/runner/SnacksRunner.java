package com.xworkz.complete_crud_operation.runner;

import com.xworkz.complete_crud_operation.things.SnacksDetails;
import com.xworkz.complete_crud_operation.things.SnacksOperations;

public class SnacksRunner {
	public static void main(String[] args) {
		SnacksDetails details=new SnacksDetails();
		details.setContact(8745124125l);
		details.setNameOfShop("Ravi Snacks");
		details.setNameOfSnack("Kachori");
		details.setNoOfScacks(15);
		
		SnacksDetails details2=new SnacksDetails();
		details2.setContact(7845963514l);
		details2.setNameOfShop("Baba TShop");
		details2.setNameOfSnack("Paddu");
		details2.setNoOfScacks(12);
		
		SnacksDetails details3=new SnacksDetails();
		details3.setContact(52412578945l);
		details3.setNameOfShop("Amba Snacks");
		details3.setNameOfSnack("Pani Puri");
		details3.setNoOfScacks(6);
		
		SnacksOperations operations=new SnacksOperations();
		operations.savedetails(details);
		operations.savedetails(details2);
		operations.savedetails(details3);
		System.out.println("=====================READ OPERATION======================");
		operations.readDetails();
		System.out.println("=====================SEARCH OPERATION=========================");
		operations.searchByNameOfShop("Amba Snacks");
		operations.readDetails();
		System.out.println("==============Delete Opeartion===============================");
		operations.deleteDetailsByNoofSnacks(12);
		System.out.println("=====================UPDATE OPERATION==============================");
		
		SnacksDetails updateDetails=new SnacksDetails();
		updateDetails.setContact(365695457l);
		updateDetails.setNameOfShop("Ravi Snacks");
		updateDetails.setNameOfSnack("Bel Puri");
		updateDetails.setNoOfScacks(6);
		operations.updateDetailsByNoOfSnacks(updateDetails);
		System.out.println("=======================READ Operation after update==========================");
		operations.readDetails();
	}
}
