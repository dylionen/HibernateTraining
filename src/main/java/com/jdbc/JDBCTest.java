package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args){
        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "adam13";

        try{
            System.out.println("Connecting to database: " + jdbcURL);
            Connection myCon = DriverManager.getConnection(jdbcURL,user,pass);
            System.out.println("Connection successfull!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
