package com.xworkz.methods;

import com.xworkz.methods.example.Monitor;
import com.xworkz.methods.example.MultiplexScreen;
import com.xworkz.methods.example.Telivision;
import com.xworkz.methods.example.ThetreScreen;

public class MethodRunner {
	public static void main(String[] args) {
		
		Telivision telivision= new Telivision();
		System.out.println(telivision.toString());
		System.out.println(telivision.hashCode());
		System.out.println(telivision.getClass());
		
		Monitor monitor=new Monitor();
		System.out.println(monitor.toString());
		System.out.println(monitor.hashCode());
		System.out.println(monitor.getClass());
		
		MultiplexScreen multiplexScreen=new MultiplexScreen();
		System.out.println(multiplexScreen.toString());
		System.out.println(multiplexScreen.hashCode());
		System.out.println(multiplexScreen.getClass());
		
		ThetreScreen screen=new ThetreScreen();
		System.out.println(screen.toString());
		System.out.println(screen.hashCode());
		System.out.println(screen.getClass());
		
}
}
