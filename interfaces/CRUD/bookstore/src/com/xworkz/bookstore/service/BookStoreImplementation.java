package com.xworkz.bookstore.service;

import com.xworkz.bookstore.dto.BookStoreDto;
import com.xworkz.bookstore.repository.BookStoreRepository;
import com.xworkz.bookstore.repository.BookStoreRepositoryImplemtation;
import com.xworkz.bookstore.util.BookStoreUtils;

public class BookStoreImplementation implements BookStoreService{

	private BookStoreRepository repository=new BookStoreRepositoryImplemtation();
	

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
					System.out.println("Validation is done");
					if(!this.duplicateCheck(dto)) {
						if(this.repository.onSave(dto)) {
							System.out.println("Saved Successfully");
							return true;
						}else {
							System.out.println("Not Saved");
							return true;
						}
					}else {
						System.out.println("Duplicate Dto");
					}
					}
		}
		return false;
	}

	@Override
	public BookStoreDto[] readData() {
		return this.repository.readData();
	}

	@Override
	public boolean duplicateCheck(BookStoreDto dto) {
		BookStoreDto[] listOfBooks= this.repository.readData(); 
		if(listOfBooks!=null) {
			for(BookStoreDto d:listOfBooks) {
				if (d!=null && d.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(BookStoreDto dto) {
		
		return this.repository.update(dto);
	}

	@Override
	public boolean delete(String value) {
		
		return this.repository.delete(value);
	}
}
