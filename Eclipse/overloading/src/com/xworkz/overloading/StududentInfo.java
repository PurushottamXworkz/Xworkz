package com.xworkz.overloading;

public class StududentInfo {
	String nameOfStudent;
	int studentId;
	String location;
	
	public static void info(String nameOfStudent) {
		System.out.println("Student name : "+nameOfStudent);
	}
	
	public static void info(String nameOfStudent, int studentId) {
		System.out.println("Student name : "+nameOfStudent);
		System.out.println("Student Id: "+studentId);
	}
	
	public static void info(String nameOfStudent, int studentId,String location) {
		System.out.println("Student name : "+nameOfStudent);
		System.out.println("Student Id: "+studentId);
		System.out.println("Student location: "+location);
	}
	
	public static void main(String[] args) {
		info("Aradya");
		System.out.println("-------------------------------");
		info("Aradya",123);
		System.out.println("-------------------------------");
		info("Aradya",123,"Hubli");
	}
}
