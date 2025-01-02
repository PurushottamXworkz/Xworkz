package com.xworkz.manager;

import com.xworkz.manager.things.Manager;

public class ManagerRunner {
	public static void main(String[] args) {
		Manager manager= new Manager();
		
		manager.setfName("Arun");
		manager.setlName("Kumar");
		manager.setManagerId(123);
		manager.setContact(789654213l);
		manager.setCountry("India");
		manager.setState("Karnataka");
		manager.setDistrict("Dharwad");
		manager.setSalary(1234500);
		
		
		Manager manager2= new Manager();
		
		manager2.setfName("Kiran");
		manager2.setlName("Kumar");
		manager2.setManagerId(125);
		manager2.setContact(789655213l);
		manager2.setCountry("India");
		manager2.setState("Karnataka");
		manager2.setDistrict("Dharwad");
		manager2.setSalary(5641241);
		
		
		Manager manager3=new Manager();
		manager3.setfName("Sangamesh");
		manager3.setlName("Jogin");
		manager3.setManagerId(128);
		manager3.setContact(789659813l);
		manager3.setCountry("India");
		manager3.setState("Karnataka");
		manager3.setDistrict("Dharwad");
		manager3.setSalary(5641287);
		
		Manager manager4=manager;
		
		System.out.println("-----------------------------------");
		System.out.println(manager.toString());
		System.out.println("-----------------------------------");
		System.out.println(manager2.toString());
		System.out.println("-----------------------------------");
		System.out.println(manager3.toString());
		System.out.println("-----------------------------------");
		System.out.println(manager4.toString());
		System.out.println("-----------------------------------");
		System.out.println(manager.equals(manager2));
		System.out.println("-----------------------------------");
		System.out.println(manager2.equals(manager3));
		System.out.println("-----------------------------------");
		System.out.println(manager3.equals(manager4));
		System.out.println("-----------------------------------");
		System.out.println(manager4.equals(manager));
		System.out.println("-----------------------------------");
		System.out.println("Manager :"+manager.hashCode());
		System.out.println("-----------------------------------");
		System.out.println("Manager 2:"+manager2.hashCode());
		System.out.println("-----------------------------------");
		System.out.println("Manager 3:"+manager3.hashCode());
		System.out.println("-----------------------------------");
		System.out.println("Manager 4:"+manager4.hashCode());
		System.out.println("-----------------------------------");
		
		
	}
}
