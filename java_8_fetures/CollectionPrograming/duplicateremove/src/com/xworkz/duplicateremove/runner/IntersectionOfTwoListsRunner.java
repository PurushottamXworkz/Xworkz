package com.xworkz.duplicateremove.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.lang.model.type.IntersectionType;

public class IntersectionOfTwoListsRunner {
	public static void main(String[] args) {
		List<Integer> integer=new ArrayList<Integer>();
		integer.add(78);
		integer.add(85);
		integer.add(36);
		integer.add(98);
		
		List<Integer> integer1=new ArrayList<Integer>();
		integer1.add(78);
		integer1.add(85);
		integer1.add(36);
		integer1.add(98);
		
		Set<Integer> set=new HashSet<Integer>();
		List<Integer> intersection = new ArrayList<>();

		for(int num:integer) {
			if(set.contains(num)) {
				intersection.add(num);
                set.remove(num);
			}
		}
		System.out.println(set);
	}
}
