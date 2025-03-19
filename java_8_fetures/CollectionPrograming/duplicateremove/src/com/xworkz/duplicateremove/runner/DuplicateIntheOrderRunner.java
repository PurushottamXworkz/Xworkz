package com.xworkz.duplicateremove.runner;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateIntheOrderRunner {
	public static void main(String[] args) {
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(3);
		integers.add(5);
		integers.add(3);
		integers.add(5);
		integers.add(8);
		
		List<Integer> integers2=new ArrayList<Integer>();
		integers2.add(3);
		integers2.add(5);
		integers2.add(3);
		integers2.add(5);
		integers2.add(4);
		
		LinkedHashSet<Integer> hashSet=new LinkedHashSet<Integer>();
		hashSet.addAll(integers);
		hashSet.addAll(integers2);
		
		System.out.println(hashSet);
	}
}
