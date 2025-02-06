package com.xworkz.bookstore.repository;

import com.xworkz.bookstore.dto.BookStoreDto;

public class BookStoreRepositoryImplemtation implements BookStoreRepository{
	
	private BookStoreDto[] dtos=new BookStoreDto[2];
	private int index=0;
	
	@Override
	public boolean onSave(BookStoreDto dto) {
		System.out.println("This is Book Store Repo Implementation");
		if(index<this.dtos.length) {
			this.dtos[this.index]=dto;
			this.index++;
			return true;
		}
		return false;
	}

	@Override
	public BookStoreDto[] readData() {
		return dtos;
	}

}
