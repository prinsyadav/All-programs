package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//import java.sql.PreparedStatement;

public class UpdateTable {


    public static void updateTable(String url, String user, String password) {

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

            String query = "INSERT INTO kids (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
          // take input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the kid: ");
            String name = sc.nextLine();
            System.out.println("Enter the age of the kid: ");
            int age = sc.nextInt();
            sc.close();
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Table updated successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}