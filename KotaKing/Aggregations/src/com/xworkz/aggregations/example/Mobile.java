package com.xworkz.aggregations.example;

public class Mobile {
	
	Version version;
	Charger charger;
	Location location;
	Manufacturer manufacturer;
	Applications apps;
	
	public Mobile(Version version,Charger charger,Location location,Manufacturer manufacturer,
	Applications apps){
		this.version=version;
		this.charger=charger;
		this.location=location;
		this.manufacturer=manufacturer;
		this.apps=apps;
	}
	
	public void printDetails() {
		System.out.println("Version of Mobile : "+version.androidVersion);
		System.out.println("Version of processor : "+version.processor);
		System.out.println("Version of storage : "+version.storage);
		
		System.out.println("Charger type : "+charger.chargerType);
		System.out.println("Charger voltage : "+charger.voltage);
		
		System.out.println("Location country : "+location.country);
		System.out.println("Location state : "+location.state);
		System.out.println("Location district : "+location.district);
		
		System.out.println("Manufacturer Mobile Number: "+manufacturer.mobileNumber);
		System.out.println("Name of Manufacturer : "+manufacturer.nameOfManufacturer);
		System.out.println("Manufacturer having lisence: "+manufacturer.isLisensed);
		
		System.out.println("Applications of data security : "+apps.dataSecurity);
		System.out.println("Application IP Address : "+apps.ipAddress);
		System.out.println("Builtin Application: "+apps.nameOfBuiltInApplications);
		
		
	}
	
}
