package com.xworkz.application.things;

public class JobForm extends ApplicationProcess{

	public static void fillUpForm() {
		int jobApplicationNumber=1234;
		System.out.println("The job application Number is : "+jobApplicationNumber);
	}
	
	public static void updateForm() {
		int updateApplicationForm=890;
		System.out.println("Update job application : "+updateApplicationForm);
	}
	
	public static void deleteForm() {
		int deleteFormNumber=7654;
		System.out.println("Delete job application : "+deleteFormNumber);
	}
	
	public static void viewForm() {
		int viewJobApplicationNumber=234;
		System.out.println("View Job application number : "+viewJobApplicationNumber);
	}

}
