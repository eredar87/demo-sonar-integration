package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestFindings {

    public static void main(String[] args) throws Exception {
        // SQL Injection (CRITICAL)
        String userInput = "someUserInput";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
        Statement stmt = conn.createStatement();
        stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");

        // Hardcoded credentials (MAJOR)
        String password = "123456";

        // Empty catch block (MINOR)
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // do nothing
        }

        // Dead store to local variable (INFO)
        int unusedVariable = 42;
    }
}
