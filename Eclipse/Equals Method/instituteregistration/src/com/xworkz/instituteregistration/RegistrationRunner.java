package com.xworkz.instituteregistration;

import com.xworkz.instituteregistration.things.Registartion;

public class RegistrationRunner {
	public static void main(String[] args) {
		Registartion registartion=new Registartion();
		registartion.setFirstName("Athesh");
		registartion.setLastName("Khan");
		registartion.setCategory("General");
		registartion.setCountry("India");
		registartion.setState("Maharastra");
		registartion.setDistrict("Bandra");
		registartion.setStreet("Anvar street");
		registartion.setGuardian("Father");
		registartion.setPlaceOfBirth("Mumbai");
		registartion.setPassword("Salman@12");
		registartion.setTransactionID("XYS1234@UPI");
		registartion.setQuota("Sports");
		registartion.setPayment(true);
		registartion.setScoreInSSLC(98.47f);
		registartion.setScoreInPUC(78.96f);
		registartion.setScoreInBachelors(89.74f);
		registartion.setTotalFees(800000);
		registartion.setRegNumber(10561);
		registartion.setContact(9343435361l);
		registartion.setGuardianContact(9343435391l);
		
		
		
		Registartion registartion3=new Registartion();
		registartion3.setFirstName("Anita");
		registartion3.setLastName("Kulkarni");
		registartion3.setCategory("General");
		registartion3.setCountry("India");
		registartion3.setState("Karnataka");
		registartion3.setDistrict("Bangalore");
		registartion3.setStreet("BTM layout");
		registartion3.setGuardian("Father");
		registartion3.setPlaceOfBirth("Hubli");
		registartion3.setPassword("Ani@12");
		registartion3.setTransactionID("XYS1834@UPI");
		registartion3.setQuota("NCC");
		registartion3.setPayment(true);
		registartion3.setScoreInSSLC(97.47f);
		registartion3.setScoreInPUC(78.6f);
		registartion3.setScoreInBachelors(80.74f);
		registartion3.setTotalFees(800000);
		registartion3.setRegNumber(10568);
		registartion3.setContact(9343435761l);
		registartion3.setGuardianContact(6343435391l);
		
		
		Registartion registartion4=new Registartion();
		registartion4.setFirstName("Anusha");
		registartion4.setLastName("P");
		registartion4.setCategory("General");
		registartion4.setCountry("India");
		registartion4.setState("Karnataka");
		registartion4.setDistrict("Bangalore");
		registartion4.setStreet("KR Market");
		registartion4.setGuardian("Father");
		registartion4.setPlaceOfBirth("Harihar");
		registartion4.setPassword("Ani@29");
		registartion4.setTransactionID("WYS1834@UPI");
		registartion4.setQuota("Ex-Army");
		registartion4.setPayment(true);
		registartion4.setScoreInSSLC(79.47f);
		registartion4.setScoreInPUC(78.85f);
		registartion4.setScoreInBachelors(62.74f);
		registartion4.setTotalFees(800000);
		registartion4.setRegNumber(10578);
		registartion4.setContact(9343415761l);
		registartion4.setGuardianContact(9343435391l);
		
		
		Registartion registartion5=new Registartion();
		registartion5.setFirstName("Anusha");
		registartion5.setLastName("P");
		registartion5.setCategory("General");
		registartion5.setCountry("India");
		registartion5.setState("Karnataka");
		registartion5.setDistrict("Bangalore");
		registartion5.setStreet("KR Market");
		registartion5.setGuardian("Father");
		registartion5.setPlaceOfBirth("Harihar");
		registartion5.setPassword("Ani@29");
		registartion5.setTransactionID("WYS1834@UPI");
		registartion5.setQuota("Ex-Army");
		registartion5.setPayment(true);
		registartion5.setScoreInSSLC(79.47f);
		registartion5.setScoreInPUC(78.85f);
		registartion5.setScoreInBachelors(62.74f);
		registartion5.setTotalFees(800000);
		registartion5.setRegNumber(10578);
		registartion5.setContact(9343415761l);
		registartion5.setGuardianContact(9343435391l);
		
		Registartion registration1=registartion;
		System.out.println("-----------------------------------------------------");
		System.out.println(registartion.toString());
		System.out.println("-----------------------------------------------------");
		System.out.println(registration1.toString());
		System.out.println("-----------------------------------------------------");
		System.out.println(registartion3.toString());
		System.out.println("-----------------------------------------------------");
		System.out.println(registartion4.toString());
		System.out.println("-----------------------------------------------------");
		System.out.println(registartion5.toString());
		System.out.println("-----------------------------------------------------");
		System.out.println("Object is equal=="+registartion.equals(registration1));
		System.out.println("-----------------------------------------------------");
		System.out.println("Object is equal=="+registartion.equals(registartion3));
		System.out.println("-----------------------------------------------------");
		System.out.println("Object is equal=="+registartion4.equals(registartion3));
		System.out.println("-----------------------------------------------------");
		System.out.println("Object is equal=="+registartion4.equals(registartion5));
		System.out.println("-----------------------------------------------------");
		System.out.println("Object is equal=="+registartion3.equals(registartion5));
		System.out.println("-----------------------------------------------------");
		
	}
}
