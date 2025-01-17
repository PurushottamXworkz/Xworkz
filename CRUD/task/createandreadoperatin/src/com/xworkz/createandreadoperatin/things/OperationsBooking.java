package com.xworkz.createandreadoperatin.things;

public class OperationsBooking {
	BookingApplicationDetails[] details=new BookingApplicationDetails[3];
	int index=0;
	
	public String saveDetails(BookingApplicationDetails book) {
		if(book!=null) {
			if(index < details.length) {
				details[index]=book;
				index++;
				return "Data Saved Successfully";
			}else 
				return "Data is not saved successfully";
		}
		return "Data is not saved";
	}
	
	public void readBookdetails() {
		for(int i=0;i<details.length;i++) {
			System.out.println(details[i]);
		}
	}
}
