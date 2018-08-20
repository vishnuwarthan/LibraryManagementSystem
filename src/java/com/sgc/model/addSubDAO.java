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
 * @author Saruga
 */
public class addSubDAO {
    public static List<addSub> getSubClassific() throws SQLException {
        dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement();
        ResultSet rs =statement.executeQuery("select * from subclassification");
        List<addSub> results = new ArrayList<>();
        while (rs.next()){
            addSub subCla = new addSub();
            subCla.setSubClassificationId(rs.getString("subClassificationId"));
            subCla.setMainClassificationId(rs.getString("mainClassificationId"));
            subCla.setSubClassificationName(rs.getString("subClassification"));
            results.add(subCla);
            
        }
        return results;
    }
    
    
    public void saveSub(addSub sub) throws ClassNotFoundException,SQLException {
        dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement(); 
        String sql="insert into subclassification(subClassificationId,subClassificationName,mainClassificationId) values('"+sub.getSubClassificationId()+"','"+sub.getSubClassificationName()+"','"+sub.getMainClassificationId()+"')";

 
        statement.execute(sql);
}
    public static List<addSub> getSelectSubClasific(String mid) throws SQLException {
        dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement();
        ResultSet rst =statement.executeQuery("select * from subclassification where MainClassificationId='"+mid+"'");
        List<addSub> results = new ArrayList<>();
        while (rst.next()){
            addSub subCla = new addSub();
            subCla.setSubClassificationId(rst.getString("subClassificationId"));
            subCla.setMainClassificationId(rst.getString("mainClassificationId"));
            subCla.setSubClassificationName(rst.getString("subClassification"));
            results.add(subCla);
            
        }
        return results;
    }
}
