package com.xworkz.company.example;

public class Organization {
	CEO ceo;
	Manager manager;
	Employee emp;
	
	public Organization(CEO ceo,Manager manager,Employee emp) {
		this.ceo=ceo;
		this.manager=manager;
		this.emp=emp;
	}
	
	public void printDetails(){
		System.out.println("Organization employee details");
		System.out.println("------------------------------------------------");
		System.out.println("CEO Of Organization :"+ceo.nameOfCEO);
		System.out.println("CEO contact :"+ceo.contact);
		System.out.println("CEO basic Salary :"+ceo.salary.basicSalary);
		System.out.println("CEO DRA Salary :"+ceo.salary.dra);
		
		
		System.out.println("Manager Of Organization :"+manager.nameOfManager);
		System.out.println("Manager contact :"+manager.contactOfMgr);
		System.out.println("Manager basic Salary :"+manager.salaryOfManager.basicSalary);
		System.out.println("Manager DRA Salary :"+manager.salaryOfManager.dra);
		
		System.out.println("Employee Of Organization :"+emp.nameOfEmp);
		System.out.println("Employee contact :"+emp.empContact);
		System.out.println("Employee ID :"+emp.empId);
		System.out.println("Employee basic Salary :"+emp.salaryOfEmp.basicSalary);
		System.out.println("Employee basic Salary :"+emp.salaryOfEmp.dra);

		
		System.out.println("------------------------------------------------");
		
	}
}
