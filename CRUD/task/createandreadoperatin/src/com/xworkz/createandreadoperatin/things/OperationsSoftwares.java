package com.xworkz.createandreadoperatin.things;

public class OperationsSoftwares {
		SoftwaresDetails[] details=new SoftwaresDetails[5];
		int index=0;
		
		public String saveDetails(SoftwaresDetails soft) {
			if(soft!=null) {
			if(index < details.length) {
				details[index]=soft;
				index++;
				return "Data saved succesfully";
			}
			else {
				return "Data can not be saved . Array is full";
				}
			}
			return "Data is not saved";
		}
		public void display() {
			for(int i=0;i<details.length;i++) {
				System.out.println(details[i]);
			}
		}
}
