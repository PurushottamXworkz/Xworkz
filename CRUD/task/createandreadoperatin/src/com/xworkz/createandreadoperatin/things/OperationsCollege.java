package com.xworkz.createandreadoperatin.things;

public class OperationsCollege {
	CollegeDetails[] collegeDetails=new CollegeDetails[5];
	int index=0;
	
	public String saveDetails(CollegeDetails college) {
		if(college!=null) {
			if(index< collegeDetails.length) {
				collegeDetails[index]=college;
				index++;
				return "Data saved successfully";
			}else {
				return "Data can't be saved. Array is full";
			}
		}
		
		return "Data is not saved";
	}
	
	public void readDetails() {
		for(int i=0;i<collegeDetails.length;i++) {
			System.out.println(collegeDetails[i]);
		}
	}
}
