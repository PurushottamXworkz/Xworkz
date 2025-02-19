package com.xworkz.set_implemetaion.runner;

import java.util.LinkedHashSet;
import java.util.Set;

public class DetailsOfNameRunner {
		public static void main(String[] args) {
			Set<String> set=new LinkedHashSet<String>();
			set.add("Ranveer");
			set.add("Anushka");
			set.add("Ranbeer");
			System.out.println(set.size());
			System.out.println(set);
			System.out.println(set.isEmpty());
			System.out.println(set.removeAll(set));
			System.out.println(set);
			System.out.println(set.size());
		}
}
