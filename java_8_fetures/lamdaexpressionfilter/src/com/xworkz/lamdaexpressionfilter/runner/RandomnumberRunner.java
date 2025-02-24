package com.xworkz.lamdaexpressionfilter.runner;

import java.util.Random;
import java.util.function.Supplier;

public class RandomnumberRunner {
	public static void main(String[] args) {
		Supplier<Integer> rand=()->new Random().nextInt(100)+1;	
		System.out.println("Random number :"+rand.get());
	}
}
