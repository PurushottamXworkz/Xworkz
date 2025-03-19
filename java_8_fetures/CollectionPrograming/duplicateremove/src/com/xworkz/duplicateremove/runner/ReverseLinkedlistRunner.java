package com.xworkz.duplicateremove.runner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedlistRunner {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(78);
		list.add(85);
		list.add(36);
		list.add(98);
		
		System.out.println(list);
		
		 List<Integer> reversedList = new LinkedList<>();
	        for (int i = list.size() - 1; i >= 0; i--) {
	            reversedList.add(list.get(i));
	        }
	        System.out.println(reversedList);
	}
}	
