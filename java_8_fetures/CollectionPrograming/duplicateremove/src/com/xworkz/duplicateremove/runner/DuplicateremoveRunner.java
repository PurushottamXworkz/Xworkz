package com.xworkz.duplicateremove.runner;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateremoveRunner {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(25);
		list.add(34);
		list.add(25);
		list.add(85);
		System.out.println(list); 
		
		List<Integer> integers=new ArrayList(new LinkedHashSet<>(list));
		System.out.println(integers);
	}
		
		
}
