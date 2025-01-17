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
}
