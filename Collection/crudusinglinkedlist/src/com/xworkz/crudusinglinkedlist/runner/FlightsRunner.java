package com.xworkz.crudusinglinkedlist.runner;

import java.util.LinkedList;

import com.xworkz.crudusinglinkedlist.dto.FlightsDto;

public class FlightsRunner {
		public static void main(String[] args) {
			LinkedList<FlightsDto> flights= new LinkedList<FlightsDto>();
			flights.add(new  FlightsDto("Commercial", "Air India", "Pacchu", 4585967421l));
			flights.add(new FlightsDto("Economic", "KingFisher", "Prashant", 7895421552l));
			flights.add(new FlightsDto("Business", "royal Dutch airlines", "Purushottam", 8952412574l));
			
			System.out.println(flights);
			flights.remove(1);
			System.out.println(flights);
			flights.addFirst(new FlightsDto("First class","british Airways","Pacchi",8745121000l));
			System.out.println(flights);
			System.out.println(flights.contains(flights.getFirst()));
		}
}
