package com.xworkz.internalcomponent.runner;


import com.xworkz.internalcomponent.things.MachineExecution;
import com.xworkz.internalcomponent.things.MachineTermination;

public class MachineRunner {
		public static void main(String[] args) {
			System.out.println("----------Tight Coupling---------------");
			MachineExecution machine= new MachineExecution();
			machine.executionMethod();
			System.out.println("---------------------------");
			MachineTermination machineTermination = new MachineTermination();
			machineTermination.machineTerminates();
		}
}
