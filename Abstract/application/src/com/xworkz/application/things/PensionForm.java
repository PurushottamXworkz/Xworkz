package com.xworkz.application.things;

public class PensionForm extends ApplicationProcess{
	
	public PensionForm(String applicationFor, int noOfApplications, String nameOfApplicant, long contact, long uid) {
		super(applicationFor, noOfApplications, nameOfApplicant, contact, uid);
		
	}
	
	@Override
	public void fillUpForm() {
		String pensionNumber="Pension234";
		System.out.println("This is apllication of Pension : "+pensionNumber);
	}
	
	@Override
	public void updateForm() {
		String updatePensionNumber="Pension345";
		System.out.println("The Updated pension Number is : "+updatePensionNumber);
	}
	@Override
	public void deleteForm() {
		String deletePensionNumber="Pension123";
		System.out.println("Delete the Pension Number :"+deletePensionNumber);
	}
	@Override
	public void viewForm() {
		String viewPensionNumber="Pension234";
		System.out.println("View Pension Number :"+viewPensionNumber);
	}
}
