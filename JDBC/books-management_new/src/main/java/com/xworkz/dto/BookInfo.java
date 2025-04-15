package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class BookInfo {
    private int bookId;
    private String bookName;
    private String author;
    private double price;
    private String genre;
    private String publisherName;
    private String language;


}
