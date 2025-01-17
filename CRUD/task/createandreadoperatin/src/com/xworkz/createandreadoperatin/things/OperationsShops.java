package com.xworkz.createandreadoperatin.things;

public class OperationsShops {
	ShopsDetails[] details=new ShopsDetails[5];
	int index=0;
	
	public String saveDetails(ShopsDetails shops) {
		if(shops!=null) {
			if(index < details.length) {
				details[index]=shops;
				index++;
				return "Data saved succesfully";
			}else {
				return "Data can't be saved. Array is full";
			}
		}
		return "Data not saved";
	}
	
	public void displayDetails() {
		for(int i=0;i<details.length;i++) {
			System.out.println(details[i]);
		}
	}
}
