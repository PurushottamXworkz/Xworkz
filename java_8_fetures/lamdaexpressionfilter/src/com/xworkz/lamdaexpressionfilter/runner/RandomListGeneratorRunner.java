package com.xworkz.lamdaexpressionfilter.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomListGeneratorRunner {
	 public static void main(String[] args) {
	        
	        Supplier<List<Integer>> randomListSupplier = () -> {
	            Random random = new Random();
	            List<Integer> numbers = new ArrayList<>();
	            for (int i = 0; i < 10; i++) {
	                numbers.add(random.nextInt(100) + 1); 
	            }
	            return numbers;
	        };
	        
	        List<Integer> randomNumbers = randomListSupplier.get();
	        randomNumbers.forEach(System.out::println);
	    }
}
