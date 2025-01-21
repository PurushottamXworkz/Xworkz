package com.xworkz.complete_crud_operation.things;

public class PersonDetailsOperation {
		PersonDetails[] details=new PersonDetails[5];
		int index=0;
		
		public String saveDetails(PersonDetails persondetails) {
			if(persondetails!=null) {
				if(index < details.length) {
					details[index]=persondetails;
					index++;
					return "Data is Saved Successfully";
				}else {
					return "Data is not Saved. Arry is full";
				}
			}
			return "Data is not saved";
		}
		
		public void readDetails() {
			for(int i=0;i<details.length;i++) {
				System.out.println(details[i]);
			}
		}
		
		
		public void updateDetailsByPersonName(PersonDetails updatedetails) {
			if(updatedetails!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getPersonName()==updatedetails.getPersonName()) {
						System.out.println("Data present updation is happening");
						details[i]=updatedetails;
					}else {
						System.out.println("Data is not present to update");
					}
				}
			}
		}
		
		public void deleteByPersonName(String personName) {
			System.out.println("Delete Operation is invoking");
			for(int i=0;i<details.length;i++) {
				if(details[i]!=null
						&& details[i].getPersonName()==personName) {
					details[i]=null;
					System.err.println("The data is deleted");
				}else {
					System.err.println("The data is not deleted");
				}
			}
		}
		
		public void searchByPersonName(String personName) {
			System.out.println("The search operation invoking");
			if(personName!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getPersonName().equals(personName)) {
						System.out.println(details[i]);
						System.err.println("Data is matched");
					}else {
						System.out.println("Data is not matching");
					}
				}
			}
		}
		
		
		
		
}
