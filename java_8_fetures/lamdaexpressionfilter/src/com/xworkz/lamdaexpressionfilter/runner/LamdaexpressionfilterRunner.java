package com.xworkz.lamdaexpressionfilter.runner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaexpressionfilterRunner {
		public static void main(String[] args) {
			List<Integer> number=Arrays.asList(20,85,40,12,3,6,5,1,2,5,1,4);
			
			List<Integer> even=number.stream().filter(n->n%2==0).collect(Collectors.toList());
			System.out.println("Even numbers :"+even);
		}
}
