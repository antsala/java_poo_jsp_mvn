package com.example;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
    static final String DB_URL = "jdbc:mysql://localhost:3306";
    static final String USER = "root";
    static final String PASS = "<PON AQUÍ EL PASSWORD DE TU SERVIDOR>";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "CREATE DATABASE Prueba";

            stmt.executeUpdate(sql);
            System.out.println("Se ha creado la base de datos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
