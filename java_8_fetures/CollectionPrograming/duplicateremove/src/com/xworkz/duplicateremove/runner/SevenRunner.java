package com.xworkz.duplicateremove.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SevenRunner {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("welcome");
		list.add("Harry");
		list.add("Harish");
		list.add("welcome");
		list.add("Harry");
		System.out.println(list);
		
		Set<String> set=new HashSet<String>(list);
		List<String> list2=new ArrayList<String>(set);
		System.out.println(list2);
		
		System.out.println("The first repeated element in a List using Set");
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(45);
		integers.add(20);
		integers.add(45);
		integers.add(10);
		integers.add(20);
		System.out.println(integers);
		
		Set<Integer>integers2=new HashSet<Integer>();
		Integer val=null;
		for(int num:integers) {
			if(integers2.contains(num)) {
				val=num;
				break;
			}
			integers2.add(num);
		}
		System.out.println(val);
		
		
		
	}
}
