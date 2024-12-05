package com.xworkz.company;

import com.xworkz.company.example.CEO;
import com.xworkz.company.example.Employee;
import com.xworkz.company.example.Manager;
import com.xworkz.company.example.Organization;
import com.xworkz.company.example.Salary;

public class Runner {

	public static void main(String[] args) {
		CEO ceo = new CEO("Salil Paresh",8545741202l,new Salary(124512, 10000));
		Manager manager= new Manager("Jayesh Sanghrajka", 5497854210l, new Salary(212141, 10000));
		Employee employee = new Employee("Jay Shah", 987456124l, 124564,new Salary(6524123, 10000));
		Organization infosys = new Organization(ceo, manager, employee);
		System.out.println("-----------------Infosys Info-----------------------");
		infosys.printDetails();
		
		
		CEO ceo1 = new CEO("S Paresh",8545741208l,new Salary(6524123, 10000));
		Manager manager1= new Manager("Jayesh", 5499854210l, new Salary(212141, 10000));
		Employee employee1 = new Employee("Shah", 989456124l, 12456,new Salary(124512, 10000));
		Organization tcs = new Organization(ceo1, manager1, employee1);
		System.out.println("-----------------TCS Info-----------------------");
		tcs.printDetails();
	}

}
