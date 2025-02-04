package com.xworkz.bookstore.util;

public class BookStoreUtils {
	private BookStoreUtils() {
	
	}
	public static boolean validate(String value) {
		if(value!=null && value.length() >= 3) {
			return true;
		}
		return false;
	}
}
