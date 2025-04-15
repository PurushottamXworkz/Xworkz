package com.xworkz.repo;

import com.xworkz.dto.BookInfo;
import com.xworkz.Util.BookUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BookRepoImp implements BookRepo{
    public String saveBook(BookInfo dto) {
        Connection connection =BookUtil.getConnection();
        String insertQuery="insert into bookinfo(bookName,author,price,genre,publisherName,language) values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement=null;
        int check=0;
        try {
            preparedStatement=  connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,dto.getBookName());
            preparedStatement.setString(2,dto.getAuthor());
            preparedStatement.setDouble(3,dto.getPrice());
            preparedStatement.setString(4,dto.getGenre());
            preparedStatement.setString(5,dto.getPublisherName());
            preparedStatement.setString(6,dto.getLanguage());
            check= preparedStatement.executeUpdate();
            System.out.println(check);
            if(check>=1){
                return "Data inserted ";
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return "Data Not inserted ";
    }

    @Override
    public void readAll() {

    }


}
