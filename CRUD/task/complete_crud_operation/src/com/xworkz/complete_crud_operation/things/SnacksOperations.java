package com.xworkz.complete_crud_operation.things;

public class SnacksOperations {
	SnacksDetails[] details=new SnacksDetails[5];
	int index=0;
	
	public String savedetails(SnacksDetails snacks) {
		if(snacks!=null) {
			if(index<details.length) {
				details[index]=snacks;
				index++;
				return "Data saved Successfully";
			}else {
				return "Data not saved. Due to array full";
			}
		}
		return "Data is null.";
	}
	
	public void readDetails() {
		for(int i=0;i<details.length;i++) {
			System.out.println(details[i]);
		}
	}
	
	public void updateDetailsByNoOfSnacks(SnacksDetails updatedDetails) {
		if(updatedDetails!=null) {
			for(int i=0;i<details.length;i++) {
				if(details[i]!=null
						&& details[i].getNoOfScacks()==updatedDetails.getNoOfScacks()) {
					details[i]=updatedDetails;
					System.out.println("Data updated successfully");
				}else {
					System.out.println("Data is not present so its not able to update");
				}
			}			
		}
	}
	
	public void deleteDetailsByNoofSnacks(int noOfSnacks) {
		if(noOfSnacks>0) {
			for(int i=0;i<details.length;i++) {			
			if(details[i]!=null
					&& details[i].getNoOfScacks()==noOfSnacks) {
				details[i]=null;
				System.out.println("Data is Delted");
				}else {
					System.out.println("Data is not deleted");
				}
			}
		}
	}
	
	public void searchByNameOfShop(String nameOfShop) {
		if(nameOfShop!=null) {
			for(int i=0;i<details.length;i++) {
				if(details[i]!=null
						&& details[i].getNameOfShop().equals(nameOfShop)) {
					System.out.println("Data is present SEARCH operation success");
				}else {
					System.out.println("Data is Not present SEARCH operation fail");
				}
			}
		}
	}
}
