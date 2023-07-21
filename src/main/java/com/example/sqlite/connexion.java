package com.example.sqlite;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {
    public static void bdConnexion(){
        System.out.println("Connexion à la base de données");
        String url = "jdbc:sqlite::memory:";
        try {
            Class.forName("org.sqlite.JDBC");
            try(Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement();){
                System.out.println("Connexion réussie");
                // connexion à notre base de donnée locale
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
