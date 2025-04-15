package com.xworkz.runner;

import com.xworkz.dto.BookInfo;
import com.xworkz.service.BookService;
import com.xworkz.service.BookServiceImp;

public class BookRunner {
    public static void main(String[] args) {
        BookInfo bookInfo=new BookInfo();
        bookInfo.setBookName("MERN");
        bookInfo.setAuthor("Madhav");
        bookInfo.setPrice(150);
        bookInfo.setGenre("Technology");
        bookInfo.setPublisherName("Dlithe");
        bookInfo.setLanguage("English");

        BookService service= new BookServiceImp();
        System.out.println("Inserted successfully");
        service.saveBookInfo(bookInfo);
    }
}
