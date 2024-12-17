package com.xworkz.actor;
import com.xworkz.actor.things.Actor;
public class ActorRunner {
	 public static void main(String[] args) {
		Actor actor= new Actor();
		actor.setNameOfActor("Salman Dulqur");
		actor.setNumOfMovies(24);
		actor.setLanguage("Malyalum");
		System.out.println(actor.getNameOfActor());
//		System.out.println(actor.getNumOfMovies());
		System.out.println(actor.toString());
		System.out.println(actor.getLanguage());
		
	}
}
