/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lsi.projetofastseller.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jacsoncavalcante
 */
public class ConnectionFactory {
    
    private final static String URL = "jdbc:postgresql://localhost:5432/biblioteca";
    private final static String USUARIO = "postgres";
    private final static String SENHA = "admin";

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);

            return conn;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

            return null;

        } catch (Exception e) {

        }
        return null;
    
}
}
