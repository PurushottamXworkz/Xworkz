package com.xworkz.government;

import com.xworkz.government.example.Address;
import com.xworkz.government.example.ChiefMinister;
import com.xworkz.government.example.MLA;
import com.xworkz.government.example.Minister;
import com.xworkz.government.example.Name;
import com.xworkz.government.example.Party;
import com.xworkz.government.example.Scheme;

public class GovernmentRunner {

	public static void main(String[] args) {
		Name name = new Name("Devendra","Fadnavis");
		Address address = new Address("India", "Thane", "rayghad");
		Party party = new Party("India", "Thane", "rayghad", "Sena", "Thakhre");
		
		ChiefMinister chiefMinister =new ChiefMinister(name, address, party);
		System.out.println("--------------------------------------------------------------");
		chiefMinister.printDetailsOfCM();
		System.out.println("--------------------------------------------------------------");
		
		Minister minister =new Minister("Patnaik", "Ravi", "Information & Technology", "Pune", true);
		Minister minister1 =new Minister("Raj", "Kapoor", "Agriculture", "Wardha", true);
		
		Minister minister2 =new Minister("Nana", "Patekar", "crime and antisocial", "Kolhapur", true);
		Minister minister3 =new Minister("Niraj", "Noor", "sports", "Latur", true);
		
		Minister[] ministerArr = {minister,minister1,minister2,minister3};
		System.out.println("--------------------------------------------------------------");
		for (Minister m : ministerArr) {
            m.printDetailsOfMinister();
        }
		
		MLA mla = new MLA("Patnaik", "Ravi", "Information & Technology", "Pune", true,"Pune");
		MLA mla1 = new MLA("Patil", "B C", "Finance", "Jalna", true,"Jalna");
		MLA mla2 = new MLA("S R", "Tewar", "Educational", "Hingoli", true,"Hingoli");
		MLA mla3 = new MLA("Bhaskar", "Lucky", "Law", "Yavatmal", true,"Yavatmal");
		
		MLA[] mlas= {mla,mla1,mla2,mla3};
		System.out.println("--------------------------------------------------------------");
		for (MLA l : mlas) {
            l.printDetailsOfMinister();
        }
		
		Scheme scheme = new Scheme("Grharaksha", "woman-child development Department", "Ram Shinde");
		Scheme scheme1 = new Scheme("Annadan", "child welfare Department", "Ravi Mandre");
		Scheme scheme2 = new Scheme("Vidyut-Jyoti", "Power Department", "Palaksha Athor");
		Scheme scheme3 = new Scheme("JalMission", "Water Department", "Sushma singh");
		
		Scheme[] schemes= {scheme,scheme1,scheme2,scheme3}; 
		System.out.println("--------------------------------------------------------------");
		for (Scheme s : schemes) {
            s.printDetailsOfSchemes();
        }
		
		
		
		
	}

}
