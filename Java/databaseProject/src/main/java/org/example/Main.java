// Filename: Main.java

package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "annu";

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

            String query = "CREATE TABLE IF NOT EXISTS kids (" +
                    "name VARCHAR(255), " +
                    "age INTEGER)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            System.out.println("Table created successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}