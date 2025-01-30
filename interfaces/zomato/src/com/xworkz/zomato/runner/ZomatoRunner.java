package com.xworkz.zomato.runner;

import com.xworkz.zomato.interfaces.Customer;
import com.xworkz.zomato.interfaces.Owner;

public class ZomatoRunner {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.order();
		customer.cancel();
		
		Owner owner=new Owner();
		owner.provideOrder();
		
	}
}
