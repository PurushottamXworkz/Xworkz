package com.xworkz.flipkart;

import com.xworkz.flipkart.things.Flipkart;

public class FlipkartRunner {

	public static void main(String[] args) {
		Flipkart flipkart= new Flipkart("Pacchu",7894,"Bangalore",2,4521);
		System.out.println(flipkart.toString());
	}
}
