package com.xworkz.optical;

import com.xworkz.optical.things.Optical;

public class OpticalRunner {
		public static void main(String[] args) {
			Optical optical=new Optical("LensKart",2,"Bangalore",256,"Rajesh");
			System.out.println(optical.toString());
		}
}
