package com.xworkz.train.runner;

import java.util.LinkedList;

public class TrainRunner {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		
		linkedList.add("General coach");
		linkedList.add("Sleeper coach");
		linkedList.add("AC coach");
		linkedList.add("General coach");
		
		System.out.println(linkedList);
		
		linkedList.remove();
		System.out.println("After remove");
		System.out.println(linkedList);
		
		linkedList.set(0, "General coach");
		System.out.println("After adding coach");
		System.out.println(linkedList);  
		System.out.println("Contains coach");
		linkedList.contains(linkedList.getFirst());
		System.out.println(linkedList);
		
		System.out.println("Add inf to first");
		linkedList.addFirst("B1 coach");
		System.out.println(linkedList);
		linkedList.peek();
		System.out.println(linkedList);
	}
}
