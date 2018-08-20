
package com.sgc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbConnection {
     private static final String URL= "jdbc:mysql://localhost:3306/librarysarvelet?characterEncoding=UTF-8&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "manager";
    private static final String MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection getDbConnection() {
        Connection con = null;
        try { 
            Class.forName(MYSQL_JDBC_DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
