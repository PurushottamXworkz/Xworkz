package com.xworkz.library.dto;

import java.util.Objects;

public class LibraryDto {
	private String nameOfLibrary;
	private String librariean;
	private String address;
	private String bookName;
	private String bookAuthor;

	public LibraryDto() {
		System.out.println("---------------------------Constructor-----------------------------");
	}

	public LibraryDto(String nameOfLibrary, String librariean, String address, String bookName, String bookAuthor) {
		super();
		this.nameOfLibrary = nameOfLibrary;
		this.librariean = librariean;
		this.address = address;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public String getNameOfLibrary() {
		return nameOfLibrary;
	}

	public void setNameOfLibrary(String nameOfLibrary) {
		this.nameOfLibrary = nameOfLibrary;
	}

	public String getLibrariean() {
		return librariean;
	}

	public void setLibrariean(String librariean) {
		this.librariean = librariean;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bookAuthor, bookName, librariean, nameOfLibrary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibraryDto other = (LibraryDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(bookAuthor, other.bookAuthor)
				&& Objects.equals(bookName, other.bookName) && Objects.equals(librariean, other.librariean)
				&& Objects.equals(nameOfLibrary, other.nameOfLibrary);
	}

	@Override
	public String toString() {
		return "LibraryDto [nameOfLibrary=" + nameOfLibrary + ", librariean=" + librariean + ", address=" + address
				+ ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}

}
