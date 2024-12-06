package com.xworkz.government.example;

public class Minister extends Name{
		String deptOfMinister;
		String constituency;
		boolean isAvailable;
		public Minister(String firstName, String lastName, String deptOfMinister, String constituency,
				boolean isAvailable) {
			super(firstName, lastName);
			this.deptOfMinister = deptOfMinister;
			this.constituency = constituency;
			this.isAvailable = isAvailable;
		}
		
		public void printDetailsOfMinister(){
			System.out.println("Name Of Minister : "+firstName+" "+lastName);
			System.out.println("Department of Minister : "+deptOfMinister);
			System.out.println("Constituency Of Minister : "+constituency);
		}
		
		
		
}

	