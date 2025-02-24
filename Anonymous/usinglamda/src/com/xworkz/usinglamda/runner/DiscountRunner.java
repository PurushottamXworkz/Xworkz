package com.xworkz.usinglamda.runner;

import com.xworkz.usinglamda.service.Calculate;

public class DiscountRunner {
	public static void main(String[] args) {
		
		Calculate cal=(amount,rate) -> {
			int val=amount-(amount*rate/100);
			System.out.println("Discount :"+val);
		};
		cal.calculate(200, 2);
	}
}	
