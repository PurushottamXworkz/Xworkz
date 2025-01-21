package com.xworkz.complete_crud_operation.things;

public class BooksDetailsOperations {
	BooksDetails[] booksDetails=new BooksDetails[5];
	int index=0;
	
	public String saveDetails(BooksDetails details) {
		if(details!=null) {
			if(index < booksDetails.length) {
				booksDetails[index]=details;
				index++;
				return "Data saved";
			}else {
				return "Data is not saved";
			}
		}
		return "Data is Saved";
	}
	
	public void readDetails() {
		for(int i=0;i<booksDetails.length;i++) {
			System.out.println(booksDetails[i]);
		}
	}
	
	public void updateByBookNumber(BooksDetails updateDetails) {
		if(updateDetails!=null) {
			for(int i=0; i<booksDetails.length;i++) {
				if(booksDetails[i]!=null 
							&& booksDetails[i].getBookNumber()==updateDetails.getBookNumber()) {
						System.out.println("Data is updated");
						booksDetails[i]=updateDetails; 						
				}else {
					System.out.println("Data is not updated");
				}
			}
		}
	}
	
	public void deleteDetails(int bookNumber) {
		if(bookNumber>0) {
			for(int i=0;i<booksDetails.length;i++) {
				if(booksDetails[i]!=null
						&& booksDetails[i].getBookNumber()==bookNumber) {
					booksDetails[i]=null;
					System.out.println("Data is Deleted"); 
				}else {
					System.out.println("Data is not present");
		  		}
			}
		}
	}
	
	public void searchByBookName(String bookName) {
		System.out.println("Search by Book Name");
		for(int i=0;i<booksDetails.length;i++) {
			if(booksDetails[i]!=null
					&& booksDetails[i].getBookName().equals(bookName)) {
				System.out.println("Data is matched");
				System.out.println(booksDetails[i]);
			}else {
				System.out.println("Data is not matched");
			}
		}
	}
	
	
}
