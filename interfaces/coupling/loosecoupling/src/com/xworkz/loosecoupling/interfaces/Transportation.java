package com.xworkz.loosecoupling.interfaces;

public class Transportation implements FlightTransportation{

	@Override
	public void flight() {
		System.out.println("Implemtation of Flight transportation");
		
	}

}
