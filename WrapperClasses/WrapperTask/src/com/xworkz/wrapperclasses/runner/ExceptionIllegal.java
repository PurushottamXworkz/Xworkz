package com.xworkz.wrapperclasses.runner;

public class ExceptionIllegal {
		public static void main(String[] args) {
			int age=18;
			try {
				if (age < 50 || age > 150) {
					System.out.println("Illegal Exception ");
				}
			}
			  catch(IllegalArgumentException e) {
				  System.out.println("Here Illegal Exception is catched");
			  }
		    }
		}
			
			
		       
			
			 
		
