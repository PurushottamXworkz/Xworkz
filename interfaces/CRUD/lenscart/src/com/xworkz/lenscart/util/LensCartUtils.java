package com.xworkz.lenscart.util;


public class LensCartUtils {
	
	private LensCartUtils() {
		
	}
	public static boolean validate(String value) {
		if(value!=null && value.length() >= 3) {
			return true;
		}
		return false;
		
	}
}
