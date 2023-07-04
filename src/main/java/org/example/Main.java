package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String username = "postgres";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the PostgreSQL database!");

            // Perform database operations here

        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}
