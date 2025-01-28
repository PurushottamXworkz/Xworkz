package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;

public class MovieServiceImplimentation extends MovieService{
		 MovieDto[] dtos=new MovieDto[3];
		 int index=0;
	
		@Override
		public String validateAndsave(MovieDto dto) {
			if(dto!=null) {
//				if(dto.getNameOfMovie()!=null 
//						&& dto.getNameOfMovie().length()>0) {
//					System.out.println("Movie name is valid and stored");
//				}else {
//					System.err.println("Not valid data");
//				}
//				if(dto.getMusicBy()!=null
//						&& dto.getMusicBy().length()>0) {
//					System.out.println("Music of movie data is valid and stored");
//				}else {
//					System.err.println("Not valid data");
//				}
//				if(dto.getProducedBy()!=null
//						&& dto.getProducedBy().length()>0) {
//					System.out.println("Produce by movie data is valid and stored");
//				}else {
//					System.err.println("Not valid data");
//				}
//				if(dto.getLeadCast()!=null
//						&& dto.getLeadCast().length()>0) {
//					System.out.println("Lead cast by movie data is valid and stored");
//				}else {
//					System.err.println("Not valid data");
//				}
//				if(dto.getThetreName()!=null
//						&& dto.getThetreName().length()>0) {
//					System.out.println("Movie Thetre data is valid and stored");
//				}else {
//					System.err.println("Not valid data");
//				}
				boolean result=this.onSave(dto);
				if(result==true) {
					System.out.println("Saved successfully Movie Data");
				}else {
					System.out.println("Not saved data");
				}
			}
			return "the Information is null";
		}
		
		public boolean onSave(MovieDto dto) {
			System.out.println("Save method invoke");
			if(this.index<dtos.length) {
				dtos[this.index]=dto;
				this.index++;
				return true;
			}
			return false;
		}
		
		
		
}
