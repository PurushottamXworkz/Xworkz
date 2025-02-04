package com.xworkz.bookstore.service;

import com.xworkz.bookstore.dto.BookStoreDto;

public interface BookStoreService {
	boolean onSave(BookStoreDto dto);
}
