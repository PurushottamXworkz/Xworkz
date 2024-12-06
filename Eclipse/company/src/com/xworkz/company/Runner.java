package com.xworkz.company;

import com.xworkz.company.example.Address;
import com.xworkz.company.example.CEO;
import com.xworkz.company.example.Employee;
import com.xworkz.company.example.Manager;
import com.xworkz.company.example.Organization;
import com.xworkz.company.example.Salary;

public class Runner{

	public static void main(String[] args) {
		
		Address address1 = new Address("RR nagar","Karnataka",580123l);
		Salary salary=new Salary(124512, 10000);
		CEO ceo = new CEO("Salil Paresh",8545741202l, salary,address1);
		Address address2= new Address("Ram Moorthy Nagar","Karnataka",580123);
		
		Salary salary2 =new Salary(212141, 10000);
		Manager manager= new Manager("Jayesh Sanghrajka", 5497854210l,salary2 ,address2);
		Address address3=new Address("KR Puram","Karnataka",580123);
		Salary salary3=new Salary(6524123, 10000);
		Employee employee = new Employee("Jay Shah", 987456124l, 124564,salary3,address3);
		Organization infosys = new Organization(ceo, manager, employee);
		System.out.println("-----------------Infosys Info-----------------------");
		infosys.printDetails();
		
		Address address4=new Address("Madihal","Karnataka",580123);
		Salary salary4=new Salary(6524123, 10000);
		CEO ceo1 = new CEO("S Paresh",8545741208l,salary4,address4);
		Address address5=new Address ("HSR layout","Karnataka",580123);
		Salary salary5=new Salary(212141, 10000);
		Manager manager1= new Manager("Jayesh", 5499854210l,salary5 ,address5);
		Address address6=new Address("Kaveri Nagar","Karnataka",580123);
		Salary salary6=new Salary(124512, 10000);
		Employee employee1 = new Employee("Shah", 989456124l, 12456,salary6,address6);
		Organization tcs = new Organization(ceo1, manager1, employee1);
		System.out.println("-----------------TCS Info-----------------------");
		tcs.printDetails();
	}

}
