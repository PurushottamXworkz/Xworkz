package com.xworkz.externaldevices.runner;

import com.xworkz.externaldevices.interfaces.MotherBoardImplentation;
import com.xworkz.externaldevices.interfaces.MouseImplentation;

public class InterfacesRunner {
	private MotherBoardImplentation boardImplentation;
	private MouseImplentation implentation;
	public static void main(String[] args) {		
		InterfacesRunner runner=new InterfacesRunner();
		
	    runner.boardImplentation= new MotherBoardImplentation();
	    runner.boardImplentation.motherboardEvent();
	    
	    runner.implentation=new MouseImplentation();
	    runner.implentation.itsexternalMouse();
	}
}
