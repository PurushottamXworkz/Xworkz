package com.xworkz.streamapi.runner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.Stream;

public class StreamRunner {
		public static void main(String[] args) {
			Stream<String> stream=Stream.of("Naveen","Amrut","Akash","Narendra");
			stream.filter(name->name.equals("Akash")).forEach(name->System.out.println(name));
			
			Stream<String> stream1=Stream.of("Naveen","Amrut","Akash","Narendra");
			stream1.filter(name->name.length() > 4).forEach(name->System.out.println(name));
			
			System.out.println(LocalDateTime.now());
			
			LocalDate date=LocalDate.now().minusDays(1);
			System.out.println(date);
			
			
			LocalDateTime dateTime=LocalDateTime.now().minusDays(2);
			
			System.out.println(dateTime);
			
			LocalDate date2=LocalDate.of(2025,3,1);
			System.out.println(date2.getDayOfWeek());
			
			LocalDate date3=LocalDate.of(2026, 3, 1);
			System.out.println(date3.getDayOfWeek());
		}
}
