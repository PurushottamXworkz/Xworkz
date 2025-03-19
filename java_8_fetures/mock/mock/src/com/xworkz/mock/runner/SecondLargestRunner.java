package com.xworkz.mock.runner;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class SecondLargestRunner {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(13);
		list.add(4);
		list.add(3);
		list.add(6);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	    System.out.println(list.get(1)); 
		
	}
}
