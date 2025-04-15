package com.xworkz.service;

import com.xworkz.dto.BookInfo;
import com.xworkz.repo.BookRepo;
import com.xworkz.repo.BookRepoImp;

public class BookServiceImp implements BookService{
    BookRepo repo=new BookRepoImp();
    @Override
    public String saveBookInfo(BookInfo dto){
        if(dto!=null){
            return repo.saveBook(dto);
        }
        return "You can't pass Null Values";
    }
}
