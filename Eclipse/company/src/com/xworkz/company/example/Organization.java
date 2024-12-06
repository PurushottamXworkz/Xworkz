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
		
		System.out.println("CEO Area :"+ceo.addressOfCeo.area);
		System.out.println("CEO state :"+ceo.addressOfCeo.state);
		System.out.println("CEO address piccode :"+ceo.addressOfCeo.pincode);
		
		
		
		System.out.println("Manager Of Organization :"+manager.nameOfManager);
		System.out.println("Manager contact :"+manager.contactOfMgr);
		System.out.println("Manager basic Salary :"+manager.salaryOfManager.basicSalary);
		System.out.println("Manager DRA Salary :"+manager.salaryOfManager.dra);
		
		System.out.println("Manager Area :"+manager.addressOfMgr.area);
		System.out.println("Manager state :"+manager.addressOfMgr.state);
		System.out.println("Manager address piccode :"+manager.addressOfMgr.pincode);
		
		
		System.out.println("Employee Of Organization :"+emp.nameOfEmp);
		System.out.println("Employee contact :"+emp.empContact);
		System.out.println("Employee ID :"+emp.empId);
		System.out.println("Employee basic Salary :"+emp.salaryOfEmp.basicSalary);
		System.out.println("Employee basic Salary :"+emp.salaryOfEmp.dra);
		
		System.out.println("Employee Area :"+emp.addressOfEmp.area);
		System.out.println("Employee state :"+emp.addressOfEmp.state);
		System.out.println("Employee address piccode :"+emp.addressOfEmp.pincode);
		

		
		System.out.println("------------------------------------------------");
		
	}
}
