package com.xworkz.lamdaexpressionfilter.runner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UppercaseconversionRunner {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("java","list","bike","conversion");
		
		Consumer<String> print=word->System.out.println(word.toUpperCase());
		
		list.forEach(print);
	}
}
