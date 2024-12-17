package com.xworkz.teacher;

import com.xworkz.teacher.things.Teacher;

public class TeacherRunner {
	public static void main(String[] args) {
		Teacher teacher= new Teacher();
		teacher.setNameOfTeacher("Ramkrishna");
		teacher.setSubject("Database Management System");
		teacher.setNoOfStudents(10);
		teacher.setRating(8);
		teacher.setSalary(28000);
		
		System.out.println(teacher.toString());
	}
}
