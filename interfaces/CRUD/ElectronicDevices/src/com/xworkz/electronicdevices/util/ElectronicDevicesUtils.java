package com.xworkz.electronicdevices.util;

public class ElectronicDevicesUtils {
	private ElectronicDevicesUtils() {
		
	}
	
	public static boolean validate(String value) {
		if(value!=null && value.length() >=3 ) {
			return true;
		}
		return false;
	}
}	
