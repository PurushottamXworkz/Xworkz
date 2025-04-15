package com.xworkz.demo.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name="bookinfo")
@Entity
@Setter
@Getter
@ToString
public class DemoEntity {
    @Id
    @Column(name = "bookId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    @Column(name="bookName")
    private String bookName;
    @Column(name="author")
    private String author;
    @Column(name = "price")
    private double price;
    @Column(name="genre")
    private String genre;
    @Column(name="publisherName")
    private String publisherName;
    @Column(name = "language")
    private String language;
}
