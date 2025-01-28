package com.xworkz.movie.runner;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImplimentation;

public class MovieRunner {
	public static void main(String[] args) {
		MovieDto  dto=new MovieDto();
		dto.setLeadCast("Sudeep");
		dto.setMusicBy("Thaman");
		dto.setNameOfMovie("MAX");
		dto.setProducedBy("Kiccha Creations");
		dto.setThetreName("Sanghum");
		System.out.println("The Movie information: "+dto);
		MovieService movieService=new MovieServiceImplimentation();
		movieService.validateAndsave(dto);
		
		MovieDto dto2=new MovieDto();
		dto2.setLeadCast("Jacky Chaan");
		dto2.setMusicBy("Nelson");
		dto2.setNameOfMovie("Karate Kid");
		dto2.setProducedBy(null);
		dto2.setThetreName("Chandini thetre");
		System.out.println("The movie information:"+dto2);
		
		MovieService movieService2=new MovieServiceImplimentation();
		movieService2.validateAndsave(dto2);
		
		
		
	}
}
