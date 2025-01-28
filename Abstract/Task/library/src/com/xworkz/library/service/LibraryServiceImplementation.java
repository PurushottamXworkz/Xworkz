package com.xworkz.library.service;

import com.xworkz.library.dto.LibraryDto;

public class LibraryServiceImplementation extends LibraryService{
	
	@Override
	public String validateAndSave(LibraryDto dto) {
		if(dto!=null) {
			if(dto.getNameOfLibrary()!=null && dto.getNameOfLibrary().length()>3) {
				System.out.println("Name Of library validated and Save");
			}else {
				System.err.println("Not validated not saved");
			}
			if(dto.getLibrariean()!=null && dto.getLibrariean().length()>3) {
				System.out.println("Librarian Of library validated and Save");
			}else {
				System.err.println("Not validated not saved");
			}
			if(dto.getBookName()!=null && dto.getBookName().length()>0) {
				System.out.println("BookName Of library validated and Save");
			}else {
				System.err.println("Not validated not saved");
			}
			if(dto.getBookAuthor()!=null && dto.getBookAuthor().length()>3) {
				System.out.println("Book Author validated and Save");
			}else {
				System.err.println("Not validated not saved");
			}
			if(dto.getAddress()!=null && dto.getAddress().length()>0) {
				System.out.println("Address validated and Save");
			}else {
				System.err.println("Not validated not saved");
			}
		}
		return "Data is Null";
	}
}
