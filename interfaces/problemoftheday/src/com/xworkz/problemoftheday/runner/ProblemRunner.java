package com.xworkz.problemoftheday.runner;

public class ProblemRunner {
		public static void main(String[] args) {
			String sentence ="You cannt use any of the following as identifier";
			int vcount=0;
			int count=0;
				for(int i=0;i<sentence.length();i++) {
					 if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i'
							 || sentence.charAt(i)=='o' || sentence.charAt(i)=='u') {
						 vcount ++;				 
					 }else {
						count ++; 
					 }
			}
				System.out.println("Count of vowels "+vcount);
				System.out.println("Count of consonants "+count);
			
			
		}
}
