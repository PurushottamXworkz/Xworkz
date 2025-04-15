package com.xworkz.shoppinglist;

import java.sql.*;

public class UpdateProduct {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        //creating connection

        String url = "jdbc:mysql://localhost:3306/country";
        String username = "root";
        String password = "root";


        String sqlQuery = "update citizen set name=? where citizen_id=? ;";
//        create statement
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,"Raghav");
            preparedStatement.setInt(2,123);
            System.out.println("Data Updated : " + preparedStatement.executeUpdate());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}