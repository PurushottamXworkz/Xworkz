package com.xworkz.government.example;

public class ChiefMinister {
	Name name;
	Address address;
	Party party;
	public ChiefMinister(Name name, Address address, Party party) {
		super();
		this.name = name;
		this.address = address;
		this.party = party;
	}
	
	
	public void printDetailsOfCM(){
		System.out.println("Name Of CM : "+name.firstName +" "+name.lastName);
		System.out.println("Address of CM : "+address.country+" "+address.district+" "+address.area);
		System.out.println("Party name of CM : "+party.nameOfParty);
	}
	
}
