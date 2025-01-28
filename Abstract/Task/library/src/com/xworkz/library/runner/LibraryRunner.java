package com.xworkz.library.runner;

import com.xworkz.library.dto.LibraryDto;
import com.xworkz.library.service.LibraryService;
import com.xworkz.library.service.LibraryServiceImplementation;

public class LibraryRunner {
	public static void main(String[] args) {
		LibraryDto dto =new LibraryDto();
		dto.setAddress("Court circle");
		dto.setBookAuthor("S L Bhairappa");
		dto.setBookName("Yaana");
		dto.setLibrariean("Hiremath");
		dto.setNameOfLibrary("Central library");
		
		LibraryService service=new LibraryServiceImplementation();
		service.validateAndSave(dto);
		
		
		LibraryDto dto1 =new LibraryDto();
		dto1.setAddress("Malleshwaram circle");
		dto1.setBookAuthor("S L Bhairappa");
		dto1.setBookName("Kriti Shreni");
		dto1.setLibrariean("Likshmi");
		dto1.setNameOfLibrary(null);
		
		service.validateAndSave(dto1);
		
		
	}
}
