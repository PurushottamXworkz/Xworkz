package com.xworkz.company.example;

public class Employee {
	String nameOfEmp;
	long empContact;
	int empId;
	Salary salaryOfEmp;
	Address addressOfEmp;
	
	public Employee(String nameOfEmp,long empContact,int empId,Salary salaryOfEmp,Address addressOfEmp) {
		this.nameOfEmp=nameOfEmp;
		this.empContact=empContact;
		this.empId=empId;
		this.salaryOfEmp=salaryOfEmp;
		this.addressOfEmp=addressOfEmp;
	}
}
