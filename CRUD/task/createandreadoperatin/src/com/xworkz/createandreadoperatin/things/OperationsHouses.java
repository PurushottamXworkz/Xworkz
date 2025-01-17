package com.xworkz.createandreadoperatin.things;

public class OperationsHouses {
		HousesDetails[] details=new HousesDetails[5];
		int index=0;
		
		public String saveDetails(HousesDetails house) {
			if(house!=null) {
				if(index < details.length) {
					details[index]=house;
					index++;
					return "Data saved successfully";
				}else
					return "Data is not saves . Array is Full";
			}
			return "Data can't be saved";
		}
		
		public void readDetails() {
			for(int i=0;i<details.length;i++) {
				System.out.println(details[i]);
			}
		}
}
