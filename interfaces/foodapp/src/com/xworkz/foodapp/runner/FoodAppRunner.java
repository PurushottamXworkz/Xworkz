package com.xworkz.foodapp.runner;

import com.xworkz.foodapp.interfaces.Hotel;
import com.xworkz.foodapp.interfaces.Restaurants;
import com.xworkz.foodapp.interfaces.StreetFood;

public class FoodAppRunner {
	public static void main(String[] args) {
		Hotel hotel=new Hotel();
		hotel.orderFood();
		hotel.payment();
		hotel.rateFood();
		hotel.cancelFood();
		System.out.println("--------------------");
		Restaurants restaurants=new Restaurants();
		restaurants.orderFood();
		restaurants.payment();
		restaurants.rateFood();
		restaurants.cancelFood();
		System.out.println("--------------------");
		StreetFood food=new StreetFood();
		food.orderFood();
		food.payment();
		food.rateFood();
		food.cancelFood();
		
	}
}
