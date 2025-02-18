package com.xworkz.wrapperclasses.runner;

public class ExceptionString {
	public static void main(String[] args) {
		int a[]= {2,4,6,8,10};
		
		try{
			for(int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
		}catch (Exception e) {
			System.out.println("Array index out of bound exception");
		}
	}
}
