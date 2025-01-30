package com.xworkz.foodapp.interfaces;

public class Hotel implements Food{

	@Override
	public void orderFood() {
		System.out.println("Food from hotel");
		
	}

	@Override
	public void rateFood() {
		System.out.println("Rating of Hotel");
		
	}

	@Override
	public void payment() {
		System.out.println("Payment in Hotel");
		
	}

	@Override
	public void cancelFood() {
		System.out.println("Cancel ordererd in Hotel");
	}
	
}
