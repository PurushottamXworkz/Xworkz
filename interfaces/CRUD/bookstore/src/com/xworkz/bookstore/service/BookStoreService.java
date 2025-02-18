package com.xworkz.bookstore.service;

import com.xworkz.bookstore.dto.BookStoreDto;

public interface BookStoreService {
	boolean onSave(BookStoreDto dto);
	BookStoreDto[] readData();
	boolean duplicateCheck(BookStoreDto dto);
	boolean update(BookStoreDto dto);
	boolean delete(String value);
}
