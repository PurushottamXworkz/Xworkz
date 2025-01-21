package com.xworkz.complete_crud_operation.things;

import java.util.Objects;

public class BooksDetails {
	private int bookNumber;
	private String typeOfBook;
	private String authorName;
	private String bookName;
	
	public BooksDetails() {
		System.out.println("This is default constructor");
	}

	public BooksDetails(int bookNumber, String typeOfBook, String authorName, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.typeOfBook = typeOfBook;
		this.authorName = authorName;
		this.bookName = bookName;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getTypeOfBook() {
		return typeOfBook;
	}

	public void setTypeOfBook(String typeOfBook) {
		this.typeOfBook = typeOfBook;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "BooksDetails [bookNumber=" + bookNumber + ", typeOfBook=" + typeOfBook + ", authorName=" + authorName
				+ ", bookName=" + bookName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, bookName, bookNumber, typeOfBook);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksDetails other = (BooksDetails) obj;
		return Objects.equals(authorName, other.authorName) && Objects.equals(bookName, other.bookName)
				&& bookNumber == other.bookNumber && Objects.equals(typeOfBook, other.typeOfBook);
	}
	
	
}
