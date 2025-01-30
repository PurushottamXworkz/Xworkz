package com.xworkz.screens.interfaces;

public class Mobile implements PCScreen,TVScreen{

	@Override
	public void screenCast() {
		System.out.println("Screen casted from mobile");
	}
	

}
