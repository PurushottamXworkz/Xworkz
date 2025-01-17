package com.xworkz.createandreadoperatin.runner;

import com.xworkz.createandreadoperatin.things.GoogleAppsDetails;
import com.xworkz.createandreadoperatin.things.OperationsGoogleApps;

public class GoogleAppsRunner {
	public static void main(String[] args) {
		GoogleAppsDetails appsDetails=new GoogleAppsDetails();
		appsDetails.setNameOfApp("Flutter");
		appsDetails.setVersionOfApp("V3.43");
		appsDetails.setDevelopedBy("Google");
		appsDetails.setContact(8745965214l);
		
		OperationsGoogleApps apps=new OperationsGoogleApps();
		apps.saveDetails(appsDetails);
		apps.saveDetails(appsDetails);
		apps.saveDetails(appsDetails);
		apps.saveDetails(appsDetails);
		apps.readDetails();
	}
}
