package com.xworkz;

import java.sql.*;

public class Demo {

    public static void main(String[] args) throws Exception{
        String sqlQuery="select bookName from bookinfo where bookId=1";
        String url="jdbc:mysql://localhost:3306/bookmanagement";
        String userName="root";
        String password="root";
        Connection connection= DriverManager.getConnection(url,userName,password);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sqlQuery);
        resultSet.next();
        String bookName = resultSet.getString(1);
        System.out.println("Book name is "+bookName);
        connection.close();
    }
}
