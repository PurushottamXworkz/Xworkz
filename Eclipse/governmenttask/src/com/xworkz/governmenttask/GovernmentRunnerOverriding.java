package com.xworkz.governmenttask;

public class GovernmentRunnerOverriding {
		public static void main(String[] args) {
			CentralGovernment centralGovernment=new CentralGovernment();
			System.out.println("Central governement Budget :"+centralGovernment.budgetCalculation());
			
			System.out.println("Central governement Tax :"+centralGovernment.calculateTax());
			
			StateGovernment stateGovernment = new StateGovernment();
			System.out.println("State governement Tax :"+stateGovernment.calculateTax());
			
			System.out.println("State government Budget :"+stateGovernment.budgetCalculation());
		}
}
