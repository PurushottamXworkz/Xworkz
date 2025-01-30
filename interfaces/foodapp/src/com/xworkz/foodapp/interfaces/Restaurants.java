package com.xworkz.foodapp.interfaces;

public class Restaurants implements Food{

	@Override
	public void orderFood() {
		System.out.println("Food order in Restaurants");
		
	}

	@Override
	public void rateFood() {
		System.out.println("Food rating in Restaurants");
	}

	@Override
	public void payment() {
		System.out.println("Food Payments in Restaurants");
	}

	@Override
	public void cancelFood() {
		System.out.println("Food cancel in Restaurants");	
	}
	
}
