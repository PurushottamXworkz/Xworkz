package com.xworkz.foodapp.interfaces;

public interface Food {
 public abstract void orderFood();
 public abstract void rateFood();
 public abstract void payment();
 public abstract void cancelFood();
 
 public static void address(){
	 System.out.println("Address of cutomer from food interface");
 }
 
 public static void landmark(){
	 System.out.println("landmark of cutomer from food interface");
 }
 
 public static void mobile(){
	 System.out.println("mobile of cutomer from food interface");
 }
 
}
