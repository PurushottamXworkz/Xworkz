package com.xworkz.set_implemetaion.runner;

import java.util.HashSet;
import java.util.Set;

public class DetailsRunner {
		public static void main(String[] args) {
			Set<String> set=new HashSet<String>();
			set.add("Gale jazba");
			set.add("Dumm Dumm");
			set.add("Do dharri talwar");
			set.add("Dil se");
			
			System.out.println(set);
			set.clear();
			System.out.println(set);
			
		}
}
