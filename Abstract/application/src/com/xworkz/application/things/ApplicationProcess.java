package com.xworkz.application.things;

public abstract class ApplicationProcess {
	String applicationFor;
	int noOfApplications;
	String nameOfApplicant;
	long contact;
	long Uid;
	
	public ApplicationProcess(String applicationFor, int noOfApplications, String nameOfApplicant, long contact,
			long uid) {
		super();
		this.applicationFor = applicationFor;
		this.noOfApplications = noOfApplications;
		this.nameOfApplicant = nameOfApplicant;
		this.contact = contact;
		Uid = uid;
	}

	public static void message() {
		System.out.println("This is abstract class static MESSAGE method");
	}
	
	public static void info() {
		System.out.println("This is abstract class static INFO method");
	}
	
	public static void details() {
		System.out.println("This is abstract class static DETAILS method");
	}
	
	public static void operations() {
		System.out.println("This is abstarct class static OPERATIONS method");
	}
	
	public void online() {
		System.out.println("This is online application INSTANCE Method");
	}
	
	public void offline() {
		System.out.println("This is offline application INSTANCE Method");
	}
	
	public void inPerson() {
		System.out.println("This is inperson application INSTANCE Method");
	}
	
	public void someOtherPerson() {
		System.out.println("This is by some other person application INSTANCE Method");
	}
	
	public abstract void fillUpForm();

	public abstract void updateForm();
	
	public abstract void deleteForm();
	
	public abstract void viewForm();
	
	
}
