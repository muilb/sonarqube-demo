package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class DatabaseService {

    // S2068: Hardcoded credentials - Security Hotspot
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "admin123456";  // Hardcoded password
    
    private String apiKey = "sk-1234567890abcdef";  // Hardcoded API key
    private String secretToken = "ghp_xxxxxxxxxxxxxxxxxxx";  // Hardcoded secret token
    private String awsAccessKey = "AKIAIOSFODNN7EXAMPLE";  // Hardcoded AWS key
    private String awsSecretKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";  // Hardcoded secret

    public Connection getDatabaseConnection() throws SQLException {
        // Hardcoded credentials in connection string
        String password = "mySecretPassword123";
        return DriverManager.getConnection(DB_URL, DB_USER, password);
    }

    public Connection getAnotherConnection() throws SQLException {
        // Another example of hardcoded credentials
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/testdb",
            "root",
            "rootpassword"  // Hardcoded password
        );
    }

    public String connectToApi() {
        // Hardcoded API authentication
        String apiPassword = "P@ssw0rd!2023";
        String authToken = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
        
        return "Connected with token: " + authToken;
    }

    public void configureDatabase() {
        // Multiple hardcoded credentials
        String dbHost = "localhost";
        String dbPort = "3306";
        String dbName = "production_db";
        String dbUsername = "prod_user";
        String dbPassword = "Pr0d_P@ssw0rd_2024";  // Hardcoded production password
        
        String connectionString = String.format(
            "jdbc:mysql://%s:%s/%s?user=%s&password=%s",
            dbHost, dbPort, dbName, dbUsername, dbPassword
        );
        
        System.out.println("Connection configured: " + connectionString);
    }

    public String getApiCredentials() {
        // Hardcoded API credentials
        String apiUsername = "api_user";
        String apiPassword = "api_secret_password_123";
        String apiEndpoint = "https://api.example.com";
        
        return String.format("Connecting to %s with user: %s, password: %s", 
            apiEndpoint, apiUsername, apiPassword);
    }

}
