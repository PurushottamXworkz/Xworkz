package com.xworkz.complete_crud_operation.things;

public class HotelOperations {
		HotelDetails[] details=new HotelDetails[5];
		int index=0;
		
		public String saveDetails(HotelDetails hotel) {
			if(hotel!=null) {
				if(index<details.length) {
					details[index]=hotel;
					index++;
					return "Data added Successfully";
				}else {
					return "Data is not saved. Array is full";
				}
			}
			return "Data is null";
		}
		
		public void readDetails() {
			for(int i=0;i<details.length;i++) {
				System.out.println(details[i]);
			}
		}
		
		public void delteByNameOfHotel(String nameOfHotel) {
			if(nameOfHotel!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getNameOfHotel()==nameOfHotel) {
						details[i]=null;
						System.out.println("Data deleted");
					}else {
						System.out.println("Data is not deleted");
					}
				}
			}
		}
		
		
		public void updateDetailsByHotelName(HotelDetails updatedDetails) {
			if(updatedDetails!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getNameOfHotel()==updatedDetails.getNameOfHotel()) {
						details[i]=updatedDetails;
						System.out.println("Data is update by name of hotel");
					}else {
						System.out.println("Data is not updated ");
					}
				}
			}
		}
		
		public void searchDetailsByHotelName(String nameOfHotel) {
			if(nameOfHotel!=null) {
				for(int i=0;i<details.length;i++) {
					if(nameOfHotel!=null
							&& details[i].getNameOfHotel().equals(nameOfHotel)) {
						System.out.println("Data is present");
					}else {
						System.out.println("Data is not present");
					}
				}
			}
		}
		
		
}
