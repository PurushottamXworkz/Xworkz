package com.xworkz.foodapp.interfaces;

public class StreetFood implements Food{

	@Override
	public void orderFood() {
		System.out.println("Order food in street corner");
	}

	@Override
	public void rateFood() {
		System.out.println("Rating food in street corner");
	}

	@Override
	public void payment() {
		System.out.println("Payment food in street corner");
	}

	@Override
	public void cancelFood() {
		System.out.println("Cancel food in street corner");
	}
	
}
