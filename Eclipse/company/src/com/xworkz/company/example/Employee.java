package com.xworkz.company.example;

public class Employee {
	String nameOfEmp;
	long empContact;
	int empId;
	Salary salaryOfEmp;
	
	public Employee(String nameOfEmp,long empContact,int empId,Salary salaryOfEmp) {
		this.nameOfEmp=nameOfEmp;
		this.empContact=empContact;
		this.empId=empId;
		this.salaryOfEmp=salaryOfEmp;
	}
}
