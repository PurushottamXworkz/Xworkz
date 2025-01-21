package com.xworkz.electronics.things;

public class OperationsOfElectronics {
		ElectronicsDetails[] electronicsDetails=new ElectronicsDetails[5];
		int index=0;
		
		public String saveDetails(ElectronicsDetails eleDetails) {
			if(eleDetails!=null) {
				if(index < electronicsDetails.length) {
					electronicsDetails[index]=eleDetails;
					index++;
					return "Data saved successfully";
				}
				else {
					return "Data can not saved . Array is full";
				}
			}
			return "Data is not saved";	
		}
		
		public void readDetails() {
			for(int i=0;i<electronicsDetails.length;i++) {
				System.out.println(electronicsDetails[i]);
			}
		}
		
		public void deleteDetails(int noOfItems) {
			System.out.println("Delete Opration invoking");
			if(noOfItems>0) {
				for(int i=0;i< electronicsDetails.length;i++) {
				if(electronicsDetails[i]!=null
						&& electronicsDetails[i].getNoOfItems()==noOfItems) {			
					electronicsDetails[i]=null;
					System.out.println("Data is Deleted");
					}else {
						System.out.println("Data not matched");
						}
					}
				}
			}
		
		public void updateByNoOfItems(ElectronicsDetails updatedDetails) {
			if(updatedDetails!=null) {
				for(int i=0;i< electronicsDetails.length;i++) {
				if(electronicsDetails[i]!=null
						&& electronicsDetails[i].getNoOfItems()==updatedDetails.getNoOfItems()) {			
					System.out.println("Data is Updated");
					electronicsDetails[i]=updatedDetails;
					}else {
						System.out.println("Data is not updated");
						}
					}
			}
		}
		
		public void searchByBrandName(String brandName) {
			System.out.println("Search Opration invoking");
			if(brandName!=null) {
				for(int i=0;i< electronicsDetails.length;i++) {
				if(electronicsDetails[i]!=null
						&& electronicsDetails[i].getBrandName().equals(brandName)) {			
					System.out.println("Data is matched");
					System.out.println(electronicsDetails[i]);
					}else {
						System.out.println("Data not matched");
						}
					}
				}
		}
		
		
}
