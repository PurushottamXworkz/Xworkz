package com.xworkz.complete_crud_operation.things;

public class LinkedInOperations {
		LinkedInDetails[] details=new LinkedInDetails[5];
		int index=0;
		
		public String saveDetails(LinkedInDetails link) {
			if(link!=null) {
				if(index < details.length) {
					details[index]=link;
					index++;
					return "Data is saved Successfully";
				}
			}else {
			return "Data is not saved. Arry is full";	
			}return "Data is null";
		}
		
		
		public void readDetails() {
			for(int i=0;i<details.length;i++) {
				System.out.println(details[i]);
			}
		}
		
		public void deleteByUserId(String userId) {
			if(userId!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getUserid()==userId) {
						details[i]=null;
						System.out.println("Data deleted successfully");
					}else {
						System.out.println("Data is not deleted");
					}
				}
			}
		}
		
		public void updateByUserId(LinkedInDetails updatedetails) {
			if(updatedetails!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getUserid()==updatedetails.getUserid()) {
						details[i]=updatedetails;
						System.out.println("Data updated Successfully");
					}else {
						System.out.println("data is not updated");
					}
				}
			}
		}
		
		public void searchByUserid(String userId) {
			if(userId!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getUserid().equals(userId)) {
						System.out.println("data is matched");
						System.out.println(details[i]);
					}else {
						System.out.println("data is not matched");
					}
				}
			}
		}
		
		
		
}
