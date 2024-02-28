package com.blackjack.dataStock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{

    private static final String HOST = "localhost";//"127.0.0.1"
    private static final int PORT = 5432;
    private static final String DB_NAME = "blackjack";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Taoufik@4040@";


    private static Connection connection;


   public static Connection getConnection()
    {
        //jdbc:postgresql://localhost:5432/blackjack
        try {
            connection = DriverManager.getConnection(String.format("jdbc:postgresql://%s:%d/%s", HOST, PORT, DB_NAME), USERNAME, PASSWORD);
        } catch (SQLException se)
        {
            se.printStackTrace();
        }
        return connection;
    }






}
