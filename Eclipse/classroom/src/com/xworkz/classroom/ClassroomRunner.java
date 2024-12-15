package com.xworkz.classroom;

import com.xworkz.classroom.things.Classroom;

public class ClassroomRunner {
	public static void main(String[] args) {
		Classroom classroom=new Classroom(5, "Java Enterprise edition", "Vinoda", "Google meet", 2);
		System.out.println(classroom.toString());
	}
}
