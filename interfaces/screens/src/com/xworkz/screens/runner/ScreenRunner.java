package com.xworkz.screens.runner;

import com.xworkz.screens.interfaces.Keypad;
import com.xworkz.screens.interfaces.Mobile;

public class ScreenRunner {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.screenCast();
		Keypad keypad=new Keypad();
		keypad.bluethootShare();
		
	}
}
