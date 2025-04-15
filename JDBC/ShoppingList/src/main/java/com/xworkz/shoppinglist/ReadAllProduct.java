package com.xworkz.shoppinglist;

import java.sql.*;

public class ReadAllProduct {
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


        String sqlQuery = "select * from citizen where citizen_id=? ;";
//        create statement
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,123);

            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                System.out.println();
                System.out.println("Citizen id : " + resultSet.getInt("citizen_id"));
                System.out.println("Name : " + resultSet.getString("name"));
                System.out.println("Gender : " + resultSet.getString("citizen_gender").charAt(0));
                System.out.println("Address : " + resultSet.getString("citizen_address"));
            }
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
