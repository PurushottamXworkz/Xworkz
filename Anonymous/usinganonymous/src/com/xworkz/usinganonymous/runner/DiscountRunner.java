package com.xworkz.usinganonymous.runner;

import com.xworkz.usinganonymous.service.Calculate;

public class DiscountRunner {
	public static void main(String[] args) {
		int price=200;
		int rate=2;
		
		Calculate calculate= new Calculate() {
			
			@Override
			public void discout(int price, int rate) {
				int dis=price-((price*rate)/100);
				System.out.println("Discount is :"+dis);
			}
		};
		calculate.discout(price, rate);
	}
}
