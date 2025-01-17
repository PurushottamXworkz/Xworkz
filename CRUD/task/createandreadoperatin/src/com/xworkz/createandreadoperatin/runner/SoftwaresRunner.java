package com.xworkz.createandreadoperatin.runner;

import com.xworkz.createandreadoperatin.things.OperationsSoftwares;
import com.xworkz.createandreadoperatin.things.SoftwaresDetails;

public class SoftwaresRunner {
		public static void main(String[] args) {
			SoftwaresDetails details =new SoftwaresDetails();
			details.setDevelopedBy("Shopify");
			details.setNameOfSoft("react");
			details.setProductCost(800000);
			details.setVersion("V7.1");
			
			SoftwaresDetails details2=new SoftwaresDetails();
			details2.setDevelopedBy("Google");
			details2.setNameOfSoft("flutter");
			details2.setProductCost(900000);
			details2.setVersion("V3.2");
			
			SoftwaresDetails details3=new SoftwaresDetails();
			details3.setDevelopedBy("Microsoft");
			details3.setNameOfSoft("MS Office");
			details3.setProductCost(45560);
			details3.setVersion("V120");
			SoftwaresDetails details4=details;
			OperationsSoftwares operationsSoftwares=new OperationsSoftwares();
			operationsSoftwares.saveDetails(null);
			operationsSoftwares.saveDetails(details2);
			operationsSoftwares.saveDetails(details3);
			operationsSoftwares.saveDetails(details4);
			operationsSoftwares.saveDetails(null);
			operationsSoftwares.saveDetails(null);
			operationsSoftwares.display();
		}
}
