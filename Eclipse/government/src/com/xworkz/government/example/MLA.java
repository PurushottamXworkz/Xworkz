package com.xworkz.government.example;

public class MLA extends Minister{
	String nameOfDistrict;

	public MLA(String firstName, String lastName, String deptOfMinister, String constituency, boolean isAvailable,
			String nameOfDistrict) {
		super(firstName, lastName, deptOfMinister, constituency, isAvailable);
		this.nameOfDistrict = nameOfDistrict;
	}
	
	public void printMlaDetails() {
		System.out.println("Name Of MLA : "+firstName+" "+lastName);
		System.out.println("Department of Minister : "+deptOfMinister);
		System.out.println("Constituency of Minister : "+constituency);
		System.out.println("Available : "+isAvailable);
	}
	
	
}
