package com.xworkz.createandreadoperatin.things;

public class OperationsGoogleApps {
	GoogleAppsDetails[] appsDetails=new GoogleAppsDetails[3];
	int index=0;
	
	public String saveDetails(GoogleAppsDetails apps) {
		if(apps!=null) {
			if(index < appsDetails.length) {
				appsDetails[index]=apps;
				index++;
				System.out.println("Data Saved successfully");
				return "Data Saved successfully";
			}else {
				System.out.println("Array is full");
				return "Data is not saved";
			}
		}
		return "Data is not saved";
	}
	
	public void readDetails() {
		for(int i=0;i< appsDetails.length;i++) {
			System.out.println(appsDetails[i]);
		}
	}
	
}
