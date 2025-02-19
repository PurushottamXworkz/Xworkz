package com.xworkz.set_implemetaion.runner;

import java.util.Set;
import java.util.TreeSet;

public class PlaylistTreeRunner {
		public static void main(String[] args) {
			Set<String> set=new TreeSet<String>();
			set.add("sony Sony");
			set.add("Marjani");
			set.add("Do pal");
			set.add("Sanam teri kasam");
			System.out.println(set);
			System.out.println(set.isEmpty());
			System.out.println(set.contains("Do pal"));
			System.out.println(set.removeAll(set));
			System.out.println(set.isEmpty());
		}
}
