package com.xworkz.government.example;

public class Scheme {
		String nameOfScheme;
		String nameOfDept;
		String headOfDept;
		
		public Scheme(String nameOfScheme, String nameOfDept, String headOfDept) {
			super();
			this.nameOfScheme = nameOfScheme;
			this.nameOfDept = nameOfDept;
			this.headOfDept = headOfDept;
		}
		
		public void printDetailsOfSchemes() {
			System.out.println("Name Of Scheme :"+nameOfScheme);
			System.out.println("Name Of Department :"+nameOfDept);
			System.out.println("Head of Department :"+headOfDept);			
		}
}
