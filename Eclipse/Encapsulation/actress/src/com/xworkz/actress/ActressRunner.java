package com.xworkz.actress;

import com.xworkz.actress.things.Actress;

public class ActressRunner {
	 public static void main(String[] args) {
		 
		 Actress actress=new Actress();
		 actress.setnameOfActress("Kareena");
		 actress.setNameOfmovie("Khabhi khushi Khabhi Ghum");
		 actress.setAwardMovie("Airlift");
		 actress.setFirstMovie("K3G");
		 actress.setlanguage("Hindi");
		System.out.println(actress.toString());
	}
}
