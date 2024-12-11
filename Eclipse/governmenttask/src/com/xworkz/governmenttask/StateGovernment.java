package com.xworkz.governmenttask;

public class StateGovernment extends GovernmentRunnerOverriding {
		
	public  float calculateTax() {
		int population=1290;
		float taxRate=0.7f;
		float tax=population*taxRate;
		return tax;
		
	}
	
	public  float budgetCalculation() {
			int population=8290;
			float revenue=0.5f;
			float budget=population*revenue;
			return budget;
		}
	}
	
