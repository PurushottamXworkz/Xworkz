package com.xworkz.aggregations;

import com.xworkz.aggregations.example.Applications;
import com.xworkz.aggregations.example.Charger;
import com.xworkz.aggregations.example.Location;
import com.xworkz.aggregations.example.Manufacturer;
import com.xworkz.aggregations.example.Mobile;
import com.xworkz.aggregations.example.Version;

public class AggregationsRunner {

	public static void main(String[] args) {		
		Version version= new Version("Android 16","android",16);
		Manufacturer manufacturer = new Manufacturer("Nokia", 636379919, true);
		Charger charger = new Charger("Regular", 220);
		Applications applications=new Applications("Gemini", "0.0.0.128", "secured");		
		Mobile mobile=new Mobile(version, charger, new Location("China", "Chinli", "Capstone"), manufacturer, applications);
		mobile.printDetails();
	}
}
