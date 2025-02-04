package com.xworkz.bookstore.service;

import com.xworkz.bookstore.dto.BookStoreDto;
import com.xworkz.bookstore.util.BookStoreUtils;

public class BookStoreImplementation implements BookStoreService{

	@Override
	public boolean onSave(BookStoreDto dto) {
		System.out.println("dto : "+dto);
		if(dto!=null) {
			if(BookStoreUtils.validate(dto.getAddress()) &&
					BookStoreUtils.validate(dto.getBookTypes()) && 
					BookStoreUtils.validate(dto.getNameOfBook())
					&& BookStoreUtils.validate(dto.getNameOfPublication())
					&& BookStoreUtils.validate(dto.getTopAuthors())
					&& BookStoreUtils.validate(dto.getTypeOfLibrary())
					){
					return true;	
					}
		}
		return false;
	}
}
