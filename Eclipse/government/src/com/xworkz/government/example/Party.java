package com.xworkz.government.example;

public class Party extends Address{

	String nameOfParty;
	String partyFounder;
	
	public Party(String country, String district, String area, String nameOfParty, String partyFounder) {
		super(country, district, area);
		this.nameOfParty = nameOfParty;
		this.partyFounder = partyFounder;
	}
}
