package com.xworkz.zomato.interfaces;

public class Customer implements CancellingOrder,Discounts,Ordering,ReturningOrder{

	@Override
	public void returnOrder() {
		System.out.println("Return Order");
		
	}

	@Override
	public void order() {
		System.out.println("Food order");
		
	}

	@Override
	public void discount() {
		System.out.println("Discounts on this customer");
		
	}

	@Override
	public void cancel() {
		System.out.println("Cancel Order");
		
	}

}
