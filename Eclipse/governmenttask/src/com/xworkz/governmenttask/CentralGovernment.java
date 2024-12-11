package com.xworkz.governmenttask;

public class CentralGovernment extends GovernmentRunnerOverriding{
		
	public  float calculateTax() {
		int population=5290;
		float taxRate=0.6f;
		float tax=population*taxRate;
		return tax;
	}
	
	public  float budgetCalculation() {
		int population=10000;
		float revenue=0.3f;
		float budget=population*revenue;
		return budget;
	}
}
