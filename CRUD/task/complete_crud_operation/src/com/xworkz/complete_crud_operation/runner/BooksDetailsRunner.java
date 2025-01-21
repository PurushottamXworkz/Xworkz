package com.xworkz.complete_crud_operation.runner;

import com.xworkz.complete_crud_operation.things.BooksDetails;
import com.xworkz.complete_crud_operation.things.BooksDetailsOperations;

public class BooksDetailsRunner {
	public static void main(String[] args) {
		BooksDetails booksDetails=new BooksDetails();
		booksDetails.setBookNumber(123);
		booksDetails.setBookName("Yaana");
		booksDetails.setTypeOfBook("Fiction");
		booksDetails.setAuthorName("S L Bhairappa");
		
		BooksDetails booksDetails2=new BooksDetails();
		booksDetails2.setBookNumber(124);
		booksDetails2.setBookName("Malgudi Days");
		booksDetails2.setAuthorName("R K Narayan");
		booksDetails2.setTypeOfBook("Literature");
		
		
		BooksDetails booksDetails3=new BooksDetails();
		booksDetails3.setBookNumber(125);
		booksDetails3.setBookName("Karvalo");
		booksDetails3.setTypeOfBook("Fiction");
		booksDetails3.setAuthorName("K P Poornachandra");
		
		BooksDetails booksDetails4=new BooksDetails();
		booksDetails4.setBookNumber(126);
		booksDetails4.setBookName("Life's amazing secrets");
		booksDetails4.setAuthorName("Paramahamsa Yoganand");
		booksDetails4.setTypeOfBook("Self help books");
		
		BooksDetailsOperations operations=new BooksDetailsOperations();
		System.out.println("========================CREATE=================================");
		operations.saveDetails(booksDetails);
		operations.saveDetails(booksDetails2);
		operations.saveDetails(booksDetails3);
		operations.saveDetails(booksDetails4);
		operations.readDetails();
		System.out.println("========================SEARCH=====================");
		operations.searchByBookName("Malgudi Days");
		System.out.println("==========================DELETE===================");
		operations.deleteDetails(125);
		System.out.println("==================READ===========================");
		operations.readDetails();
		
		
		
		BooksDetails updateDetails=new BooksDetails();
		updateDetails.setBookNumber(126);
		updateDetails.setTypeOfBook("Horror Novel");
		updateDetails.setAuthorName("Jennifer");
		updateDetails.setBookName("Deadly Location");
		
		System.out.println("=======================After update data==================================");
		operations.updateByBookNumber(updateDetails);
		operations.readDetails();
	}
}
