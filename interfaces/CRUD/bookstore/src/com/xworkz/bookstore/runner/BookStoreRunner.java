package com.xworkz.bookstore.runner;

import com.xworkz.bookstore.constant.BookType;
import com.xworkz.bookstore.constant.TopAuthors;
import com.xworkz.bookstore.constant.TypeOfLibrary;
import com.xworkz.bookstore.dto.BookStoreDto;
import com.xworkz.bookstore.service.BookStoreImplementation;
import com.xworkz.bookstore.service.BookStoreService;

public class BookStoreRunner {
	public static void main(String[] args) {
		BookStoreDto dto=new BookStoreDto();
		dto.setAddress("Dharwad");
		dto.setBookTypes(BookType.FICTION.toString());
		dto.setNameOfBook("Pride and Prejudice");
		dto.setNameOfPublication("Thomas Egerton");
		dto.setTopAuthors(TopAuthors.JOHN_RONALD.toString());
		dto.setTypeOfLibrary(TypeOfLibrary.CENTRAL_LIBRARY.toString());
		
		BookStoreService service=new BookStoreImplementation();
		if(service.onSave(dto)) {
			System.out.println("Validation is successfull");
		}else {
			System.out.println("Validation is not succesfull");
		}
		
		System.out.println("Read Data");
		BookStoreDto[] dtos=service.readData();
		for(BookStoreDto d:dtos) {
			System.out.println(d);
		}
	}
}
