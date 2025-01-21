package com.xworkz.complete_crud_operation.runner;

import com.xworkz.complete_crud_operation.things.LinkedInDetails;
import com.xworkz.complete_crud_operation.things.LinkedInOperations;

public class LinkedInRunner {
		public static void main(String[] args) {
			LinkedInDetails details=new LinkedInDetails();
			details.setAddress("Bangalore");
			details.setContact(784512452l);
			details.setName("Purushottam");
			details.setUserid("Prashant@123");
			
			LinkedInDetails details2=new LinkedInDetails();
			details2.setAddress("Bangalore");
			details2.setContact(784572852l);
			details2.setName("Ramesh");
			details2.setUserid("Ramesh@123");
			
			
			LinkedInDetails details3=new LinkedInDetails();
			details3.setAddress("Bangalore");
			details3.setContact(784512442l);
			details3.setName("Nishi");
			details3.setUserid("Nishi@123");
			
			
			LinkedInDetails details4=new LinkedInDetails();
			details4.setAddress("Bangalore");
			details4.setContact(784012452l);
			details4.setName("Nileesh");
			details4.setUserid("Nil@123");
			
			
			LinkedInDetails details5=new LinkedInDetails();
			details5.setAddress("Bangalore");
			details5.setContact(746512452l);
			details5.setName("Deepak");
			details5.setUserid("Deepak@123");
			
			LinkedInOperations inOperations=new LinkedInOperations();
			inOperations.saveDetails(details);
			inOperations.saveDetails(details2);
			inOperations.saveDetails(details3);
			inOperations.saveDetails(details4);
			inOperations.saveDetails(details5);
			System.out.println("======================READ============================");
			inOperations.readDetails();
			System.out.println("=====================Delete===========================");
			inOperations.deleteByUserId("Deepak@123");
			System.out.println("====================Search=============================");
			inOperations.searchByUserid("Ramesh@123");
			
			LinkedInDetails updateDetails= new LinkedInDetails();
			updateDetails.setAddress("Mysore");
			updateDetails.setContact(95135746l);
			updateDetails.setName("Mahendra");
			updateDetails.setUserid("Mahi@123");
			System.out.println("=====================After Update read===========================");
			inOperations.updateByUserId(updateDetails);
			inOperations.readDetails();			
		}
}
