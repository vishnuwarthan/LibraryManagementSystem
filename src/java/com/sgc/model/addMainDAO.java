/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.model;
import com.sgc.data.dbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author vishnu
 */
public class addMainDAO {
    public static List<addMain> getMainClassific() throws SQLException{
        dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement(); 
        ResultSet rs =statement.executeQuery("select * from mainclassification");
        List<addMain> results = new ArrayList<>();
        while (rs.next()){
            addMain mainCla = new addMain();
            mainCla.setMainClassificationId(rs.getString("mainClassificationId"));
            mainCla.setMainClassificationName(rs.getString("mainClassification"));
            results.add(mainCla);
            
        }
        return results;
    }
    
     public void saveMain(addMain main) throws ClassNotFoundException,SQLException {
        dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement(); 
        String sql="insert into mainclassification(mainClassificationId,mainClassificationName) values('"+main.getMainClassificationId()+"','"+main.getMainClassificationName()+"')";

 
        statement.execute(sql);
}
     
}
