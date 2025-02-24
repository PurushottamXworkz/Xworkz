package com.xworkz.lamdaexpressionfilter.runner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumertodoubleRunner {
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	        
	        Consumer<List<Integer>> doubleNumbers = list -> {
	            list.replaceAll(n -> n * 2);
	            list.forEach(System.out::println);
	        };
	        doubleNumbers.accept(numbers);
	    }
}
