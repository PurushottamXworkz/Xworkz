package com.xworkz.lamdaexpressionfilter.runner;

import java.util.Arrays;
import java.util.List;

public class SortlistRunner {
	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("Banana","aPPle","orangE","gRaAe");
		fruits.sort((s1,s2)->s1.compareToIgnoreCase(s2));
		
		fruits.forEach(System.out::println);
	}
}
