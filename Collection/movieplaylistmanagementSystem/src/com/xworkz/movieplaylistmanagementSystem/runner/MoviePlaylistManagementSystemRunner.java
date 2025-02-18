package com.xworkz.movieplaylistmanagementSystem.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.movieplaylistmanagementSystem.dto.MoviePlaylistManagementSystemDto;

public class MoviePlaylistManagementSystemRunner {
	public static void main(String[] args) {
		List<MoviePlaylistManagementSystemDto> dtos=new ArrayList<MoviePlaylistManagementSystemDto>();
		
		dtos.add(new MoviePlaylistManagementSystemDto("Dil to pagal", "Romantic", "yash Chopra", "Dil to pagal hai"));
		
		dtos.add(new MoviePlaylistManagementSystemDto("Sony Sony", "Romantic", "Aditya chopra", "Mohabbatein"));
		
		dtos.add(new MoviePlaylistManagementSystemDto("Dil na liya", "romantic", "Rakesh Roshan", "krrish"));
   		
		
		
	}
}

