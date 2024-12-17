package com.xworkz.cricket;

import com.xworkz.cricket.things.Cricket;

public class CricketRunner {
	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		cricket.setNameincricket("King");
		cricket.setNameOfPlayer("Virat Kohli");
		cricket.setCoachName("rahul Dravid");
		cricket.setNameOfTeam("India");
		cricket.setOrder(1);
		System.out.println(cricket.toString());
	}
}
