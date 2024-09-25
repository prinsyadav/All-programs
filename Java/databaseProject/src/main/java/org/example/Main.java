// Filename: Main.java

package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "annu";

        /*
        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // establish connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

            // create a table named kids
            String query = "CREATE TABLE IF NOT EXISTS kids (" +
                    "name VARCHAR(255), " +
                    "age INTEGER)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            System.out.println("Table created successfully.");

        } catch (ClassNotFoundException e) {
            System.out.println("PostgresSQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }

         */

        // take input from user and insert those values  into the employee table

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

            String query = "CREATE TABLE IF NOT EXISTS employees (" +
                    "name VARCHAR(255), " +
                    "age INTEGER)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.executeUpdate();
            System.out.println("Table created successfully.");
            // delete all values from the table
            String query1 = "DELETE FROM employees";
            pstmt = conn.prepareStatement(query1);
            pstmt.executeUpdate();
            System.out.println("Table cleared successfully.");

            // Take input from user and insert values into the table employee
            String query2 = "INSERT INTO employees (name, position) VALUES (?, ?)";
            pstmt = conn.prepareStatement(query2);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the employee: ");
            String name = sc.nextLine();
            System.out.println("Enter the position of the employee: ");
            String position = sc.nextLine();
            sc.close();
            pstmt.setString(1, name);
            pstmt.setString(2, position);
            pstmt.executeUpdate();
            System.out.println("Table updated successfully.");

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
    }
        catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}