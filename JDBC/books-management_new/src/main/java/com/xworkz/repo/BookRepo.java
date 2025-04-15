package com.xworkz.repo;
import com.xworkz.dto.BookInfo;
public interface BookRepo {
    String saveBook(BookInfo dto);

    void readAll();
}
