package com.xworkz.triptravellers.interfaces;

public class Nomad
		implements Agoda, EaseTrip, GetYourGuide, MakeMyTrip, NammaYaatri, Trip, TripAdvisor, Triplt, Wanderlog, Yatra {

	@Override
	public void tourPackage() {
		System.out.println("Tour package consists fecilities as given in Nomad Class");
		
	}

	@Override
	public void guideLines() {
		System.out.println("Guide Lines consists as given in Nomad Class");
		
	}

		
}
