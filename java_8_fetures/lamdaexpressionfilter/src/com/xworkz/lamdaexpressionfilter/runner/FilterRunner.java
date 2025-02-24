package com.xworkz.lamdaexpressionfilter.runner;

import java.util.Arrays;
import java.util.List;

public class FilterRunner {
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 55, 23, 67, 45, 89, 33, 50, 12, 77);
	        List<Integer> filteredNumbers = numbers.stream().filter(n -> n <= 50).toList();
	        filteredNumbers.forEach(System.out::println);
	    }
}
