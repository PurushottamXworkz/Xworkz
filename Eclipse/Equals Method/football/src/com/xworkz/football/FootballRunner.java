package com.xworkz.football;

import com.xworkz.football.things.Football;

public class FootballRunner {
	 public static void main(String[] args) {
		Football football = new Football();
		
		football.setAddress("Melborn");
		football.setClubName("Dynamo Kyiv");	
		football.setContact(78459652134l);
		football.setCountry("Brazil");
		football.setJerseyNumber(7);
		football.setNamedAs("GOAT");
		football.setNoOfCupsWon(40);
		football.setPlayerName("Leonal Messi");
		
		Football football2=new Football();
		football2.setAddress("Munich");
		football2.setClubName("Manchester United");
		football2.setContact(1245784512l);
		football2.setCountry("Germany");
		football2.setJerseyNumber(10);
		football2.setNamedAs("God of football");
		football2.setNoOfCupsWon(50);
		football2.setPlayerName("Cristiano Renaldo");
		
		Football football3=football2;
		
		Football football4=football;
		
		System.out.println("--------------------------------------");
		System.out.println(football.toString());
		System.out.println("--------------------------------------");
		System.out.println(football2.toString());
		System.out.println("--------------------------------------");
		System.out.println(football3.toString());
		System.out.println("--------------------------------------");
		System.out.println(football4.toString());
		System.out.println("--------------------------------------");
		System.out.println(football.equals(football2));
		System.out.println("--------------------------------------");
		System.out.println(football2.equals(football3));
		System.out.println("--------------------------------------");
		System.out.println(football3.equals(football4));
		System.out.println("--------------------------------------");
		System.out.println(football4.equals(football));
		System.out.println("--------------------------------------");
		System.out.println("Football : "+football.hashCode());
		System.out.println("--------------------------------------");
		System.out.println("Football 2 :"+football2.hashCode());
		System.out.println("--------------------------------------");
		System.out.println("Football 3 :"+football3.hashCode());
		System.out.println("--------------------------------------");
		System.out.println("Football 4 : "+football4.hashCode());
		System.out.println("-------------------------------------");
	}
}
