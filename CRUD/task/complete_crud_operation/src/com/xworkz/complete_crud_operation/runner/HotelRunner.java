package com.xworkz.complete_crud_operation.runner;

import com.xworkz.complete_crud_operation.things.HotelDetails;
import com.xworkz.complete_crud_operation.things.HotelOperations;

public class HotelRunner {
	public static void main(String[] args) {
		HotelDetails details=new HotelDetails();
		details.setNameOfCustomer("Nidhi");
		details.setIdProof("Adhar");
		details.setNameOfHotel("French Hotel");
		details.setNoOfRooms(2000);
		
		HotelDetails details2=new HotelDetails();
		details2.setNameOfCustomer("Nagesh");
		details2.setNameOfHotel("Five *****");
		details2.setNoOfRooms(1500);
		details2.setIdProof("Voter ID");
		
		HotelOperations hotelOperations = new HotelOperations();
		hotelOperations.saveDetails(details);
		hotelOperations.saveDetails(details2);
		System.out.println("===============SAVE DETAILS=======================");
		hotelOperations.readDetails();
		
		HotelDetails updateDetails=new HotelDetails();
		updateDetails.setIdProof("Adhar");
		updateDetails.setNameOfCustomer("Noor Jahaan");
		updateDetails.setNameOfHotel("French Hotel");
		updateDetails.setNoOfRooms(2000);
		hotelOperations.updateDetailsByHotelName(updateDetails);
		System.out.println("==============UPDATED DATA=========================");
		hotelOperations.readDetails();
		System.out.println("==============DELETED DATA=========================");
		hotelOperations.delteByNameOfHotel("Five *****");
		hotelOperations.readDetails();
		System.out.println("==============SEARCH DATA=========================");
		hotelOperations.searchDetailsByHotelName("French Hotel");
		hotelOperations.saveDetails(details);
		hotelOperations.readDetails();
	}
}
