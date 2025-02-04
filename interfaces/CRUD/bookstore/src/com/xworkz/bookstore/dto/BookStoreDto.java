package com.xworkz.bookstore.dto;

import java.util.Objects;

public class BookStoreDto {
	private String bookTypes;
	private String nameOfBook;
	private String topAuthors;
	private String typeOfLibrary;
	private String address;
	private String nameOfPublication;
	
	public BookStoreDto() {
		System.out.println("-----------Book Store----------------");
	}

	public BookStoreDto(String bookTypes, String nameOfBook, String topAuthors, String typeOfLibrary, String address,
			String nameOfPublication) {
		super();
		this.bookTypes = bookTypes;
		this.nameOfBook = nameOfBook;
		this.topAuthors = topAuthors;
		this.typeOfLibrary = typeOfLibrary;
		this.address = address;
		this.nameOfPublication = nameOfPublication;
	}

	public String getBookTypes() {
		return bookTypes;
	}

	public void setBookTypes(String bookTypes) {
		this.bookTypes = bookTypes;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public String getTopAuthors() {
		return topAuthors;
	}

	public void setTopAuthors(String topAuthors) {
		this.topAuthors = topAuthors;
	}

	public String getTypeOfLibrary() {
		return typeOfLibrary;
	}

	public void setTypeOfLibrary(String typeOfLibrary) {
		this.typeOfLibrary = typeOfLibrary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNameOfPublication() {
		return nameOfPublication;
	}

	public void setNameOfPublication(String nameOfPublication) {
		this.nameOfPublication = nameOfPublication;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bookTypes, nameOfBook, nameOfPublication, topAuthors, typeOfLibrary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStoreDto other = (BookStoreDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(bookTypes, other.bookTypes)
				&& Objects.equals(nameOfBook, other.nameOfBook)
				&& Objects.equals(nameOfPublication, other.nameOfPublication)
				&& Objects.equals(topAuthors, other.topAuthors) && Objects.equals(typeOfLibrary, other.typeOfLibrary);
	}

	@Override
	public String toString() {
		return "BookStoreDto [bookTypes=" + bookTypes + ", nameOfBook=" + nameOfBook + ", topAuthors=" + topAuthors
				+ ", typeOfLibrary=" + typeOfLibrary + ", address=" + address + ", nameOfPublication="
				+ nameOfPublication + "]";
	}
	
	
	
	
}
