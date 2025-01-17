package com.xworkz.createandreadoperatin.runner;

import com.xworkz.createandreadoperatin.things.BookingApplicationDetails;
import com.xworkz.createandreadoperatin.things.OperationsBooking;

public class BookingApplicationRunner {
	public static void main(String[] args) {
		BookingApplicationDetails details=new BookingApplicationDetails();
		details.setNameOfApp("BookMyShow");
		details.setNoOfTickets(5);
		details.setBookingFor("Movie");
		details.setBookedBy("Vikram");
		
		BookingApplicationDetails details2=new BookingApplicationDetails();
		details2.setNameOfApp("IRCTC");
		details2.setNoOfTickets(10);
		details2.setBookingFor("Travel");
		details2.setBookedBy("Hansika");
		
		BookingApplicationDetails details3=new BookingApplicationDetails(); 
		details3.setNameOfApp("MakeMyTrip");
		details3.setNoOfTickets(2);
		details3.setBookingFor("Hacking");
		details3.setBookedBy("Radhika");
		
		OperationsBooking applicationOperations=new OperationsBooking();
		applicationOperations.saveDetails(details);
		applicationOperations.saveDetails(details2);
		applicationOperations.saveDetails(null);
		applicationOperations.saveDetails(details3);
		applicationOperations.readBookdetails();
		
	}
}
