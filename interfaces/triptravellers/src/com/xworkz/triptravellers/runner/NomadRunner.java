package com.xworkz.triptravellers.runner;

import com.xworkz.triptravellers.interfaces.Nomad;

public class NomadRunner {
	public static void main(String[] args) {
		Nomad nomad=new Nomad();
		nomad.guideLines();
		nomad.tourPackage();
	}
}
