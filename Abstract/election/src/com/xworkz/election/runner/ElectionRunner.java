package com.xworkz.election.runner;

import com.xworkz.election.things.ElectionProcess;
import com.xworkz.election.things.IndianElection;
import com.xworkz.election.things.PakistanElection;
import com.xworkz.election.things.SrilankaElection;

public class ElectionRunner {
	public static void main(String[] args) {
		ElectionProcess electionRunner=new IndianElection();
		electionRunner.setElectionProcess();
		
		ElectionProcess electionRunner1=new PakistanElection();
		electionRunner1.setElectionProcess();
		
		ElectionProcess electionRunner2=new SrilankaElection();
		electionRunner2.setElectionProcess();
	}
}
