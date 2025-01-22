package com.xworkz.application.runner;

import com.xworkz.application.things.PensionForm;

public class ApplicationRunner {
	public static void main(String[] args) {
		
		PensionForm.details();
		PensionForm.info();
		PensionForm.message();
		PensionForm.operations();
	
		System.out.println("=========================================");
		PensionForm  applicationProcess=new PensionForm("Pension", 10, "Rajat K", 8574963625l,636343442985l);
		
		applicationProcess.online();
		applicationProcess.offline();
		applicationProcess.inPerson();
		applicationProcess.someOtherPerson();
		System.out.println("========================================");
		applicationProcess.viewForm();
		applicationProcess.fillUpForm();
		applicationProcess.deleteForm();
		applicationProcess.updateForm();
		
	}
}
