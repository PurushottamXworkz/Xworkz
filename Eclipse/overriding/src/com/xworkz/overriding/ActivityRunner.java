package com.xworkz.overriding;

public class ActivityRunner {
	public static void main(String[] args) {
		Person person = new Person();
		person.activity();
		
//		Walk walk=new Walk();
//		walk.activity();
		
//		Reading reading=new Reading();
//		reading.activity();
		
		Run run = new Run();
		run.activity();
		
		Riding riding = new Riding();
		riding.activity();
		
		
	}
}
