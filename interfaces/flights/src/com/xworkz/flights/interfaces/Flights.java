package com.xworkz.flights.interfaces;

public class Flights implements DomesticFlights, InternationalFlights {

	@Override
	public void airtraffic() {
		System.out.println("This is Air traffic from Flights implemetaion");
	}

}
