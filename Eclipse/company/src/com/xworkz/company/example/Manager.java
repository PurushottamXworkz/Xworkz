package com.xworkz.company.example;

public class Manager {
	String nameOfManager;
	long contactOfMgr;
	Salary salaryOfManager;
	Address addressOfMgr;
	
	public Manager(String nameOfManager,long contactOfMgr,Salary salaryOfManager,Address addressOfMgr) {
		this.nameOfManager=nameOfManager;
		this.contactOfMgr=contactOfMgr;
		this.salaryOfManager=salaryOfManager;
		this.addressOfMgr=addressOfMgr;
	}
}
