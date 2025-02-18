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

	@Override
	public boolean update(BookStoreDto dto) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null
					&& dtos[i].getNameOfBook()==dto.getNameOfBook()) {
				System.out.println("Name of book found");
				dtos[i]=dto;
				System.out.println("Updated Detail Dto"+dto);
			}else {
				System.out.println("Name of book not found");
			}
		}
		return false;
	}

	@Override
	public boolean delete(String value) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null
					&& dtos[i].getNameOfBook()==value) {
				System.out.println("Data found need to delete");
				dtos[i]=null;
				System.out.println("Data deleted ");
				return true;
			}else {
				System.out.println("Data not found need to delete");
			}
		}
		return false;
	}

}
