package com.xworkz.cricket;

import com.xworkz.cricket.things.Cricket;

public class CricketRunner {
 public static void main(String[] args) {
	 
	 Cricket cricket = new Cricket();
	 
	 cricket.setJerseyNumber(7);
	 cricket.setOderPlaying("Middle Order");
	 cricket.setNameOfPlayer("M S Dhoni");
	 cricket.setTeamName("India");
	 cricket.setNameOfPlayer("India");
	 cricket.setCallBy("Finisher");
	 cricket.setStateFrom("Bihar");
	 cricket.setNameOfBoard("BCCI");
	 
	 Cricket  cricket2=new Cricket();
	 cricket2=cricket;
	 
	 
	 System.out.println("--------------------------------------------");
	 Cricket cricket3=new Cricket();
	 
	 cricket3.setJerseyNumber(10);
	 cricket3.setOderPlaying("Front Order");
	 cricket3.setNameOfPlayer("Sachin Tendulkar");
	 cricket3.setTeamName("India");
	 cricket3.setNameOfPlayer("India");
	 cricket3.setCallBy("God Of Cricket");
	 cricket3.setStateFrom("Maharastra");
	 cricket3.setNameOfBoard("BCCI");
	 
	 
	 System.out.println("--------------------------------------------");
	 Cricket cricket4=new Cricket();
	 cricket4.setJerseyNumber(10);
	 cricket4.setOderPlaying("Front Order");
	 cricket4.setNameOfPlayer("Virat Kihli");
	 cricket4.setTeamName("India");
	 cricket4.setNameOfPlayer("India");
	 cricket4.setCallBy("King");
	 cricket4.setStateFrom("Haryana");
	 cricket4.setNameOfBoard("BCCI");
	 
	 System.out.println(cricket.toString());
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket2.toString());
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket3.toString());
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket4.toString());
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket.equals(cricket2));
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket2.equals(cricket3));
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket3.equals(cricket4));
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket.hashCode());
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket2.hashCode());
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket3.hashCode());
	 System.out.println("--------------------------------------------");
	 System.out.println(cricket4.hashCode());
 }
}
