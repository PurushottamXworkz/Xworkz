package com.xworkz.createandreadoperatin.runner;

import com.xworkz.createandreadoperatin.things.OperationsShops;
import com.xworkz.createandreadoperatin.things.ShopsDetails;

public class ShopsRunner {
	public static void main(String[] args) {
		ShopsDetails details=new ShopsDetails();
		details.setAddress("Mangalore");
		details.setContact(7895412141l);
		details.setOwnerName("Nidhi");
		details.setShopName("Provisional store");
		
		ShopsDetails details1=new ShopsDetails();
		details1.setAddress("Bangalore");
		details1.setContact(7895412851l);
		details1.setOwnerName("Prashant");
		details1.setShopName("Jewellary store");
		
		OperationsShops operationsShops= new OperationsShops();
		operationsShops.saveDetails(details);
		operationsShops.saveDetails(details1);
		operationsShops.displayDetails();
		
	}
}
