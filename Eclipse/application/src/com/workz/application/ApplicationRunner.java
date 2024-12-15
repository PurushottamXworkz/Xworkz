package com.workz.application;

import com.workz.application.things.Application;

public class ApplicationRunner {
	public static void main(String[] args) {
		Application application=new Application(5, "Ravan", "Ramesh", 2, ".com");
		System.out.println(application.toString());
	}
}
