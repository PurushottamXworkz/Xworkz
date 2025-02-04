package com.xworkz.internalcomponent.things;

public class MachineTermination extends MachineExecution{
	public void machineTerminates() {
		machineRunning();
		executionMethod();
		System.out.println("This is termination of execution");
	}
}
