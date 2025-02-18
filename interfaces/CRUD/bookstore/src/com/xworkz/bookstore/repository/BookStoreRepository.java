package com.xworkz.bookstore.repository;

import com.xworkz.bookstore.dto.BookStoreDto;

public interface BookStoreRepository {
	boolean onSave(BookStoreDto dto);
	BookStoreDto[] readData();
	boolean update(BookStoreDto dto);
	boolean delete(String value);
}
