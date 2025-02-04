package com.xworkz.loosecoupling.runner;

import com.xworkz.loosecoupling.interfaces.FlightTransportation;
import com.xworkz.loosecoupling.interfaces.Transportation;

public class TransportationRunner {
	
	private FlightTransportation flightTransportation;
	
	public static void main(String[] args) {
		TransportationRunner runner=new TransportationRunner();
	    runner.flightTransportation=new Transportation();
	    runner.flightTransportation.flight();
	}
}
