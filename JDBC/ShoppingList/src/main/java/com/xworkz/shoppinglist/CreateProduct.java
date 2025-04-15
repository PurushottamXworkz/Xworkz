package com.xworkz.shoppinglist;

import java.sql.*;

public class CreateProduct {

    public static void main(String[] args) {
        //Load and register the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        //creating connection

       String url = "jdbc:mysql://localhost:3306/country";
        String username="root";
        String password="root";


        String query="Insert into citizen values(123,'Ramesh',12345678,'M','Banglore','2024-12-27')";
//        create statement
            Connection connection=null;
            Statement s=null;
        try {
          connection= DriverManager.getConnection(url,username,password);
          s= connection.createStatement();
            s.execute(query);
            System.out.println("Data inserted : "+s);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
           if(connection!=null){
               try{
                   connection.close();
               }catch (SQLException e){
                   throw new RuntimeException(e);
               }
           }
           if(s!=null){
               try{
                   s.close();
               }catch(SQLException e){
                   throw new RuntimeException(e);
               }
           }
        }
    }
}
