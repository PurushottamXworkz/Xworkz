package com.xworkz.lamdaexpressionfilter.runner;

import java.util.function.Consumer;

public class ConsumerchainingRunner {
	  public static void main(String[] args) {
	        String message = "Hello Runner";
	        Consumer<String> printMessage = System.out::println;
	        Consumer<String> appendDone = msg -> System.out.println(msg + " - Done");
	        printMessage.andThen(appendDone).accept(message);
	    }
}
