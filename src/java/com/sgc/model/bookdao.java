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
public class bookdao {
    public void saveBook(book bk) throws ClassNotFoundException,SQLException {
        dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        Statement statement = con.createStatement(); 
        String sql="insert into bookdetails(bookId,title,author,mainClassification,subClassification,yearOfPublishing,lastPrintedYear,isbnNo,noOfPages) values('"+bk.getBookId()+"','"+bk.getAuthor()+"','"+bk.getTitle()+"','"+bk.getMainClassification()+"','"+bk.getSubClassification()+"','"+bk.getYearOfPublishing()+"','"+bk.getLastPrintedYear()+"','"+bk.getIsbnNo()+"','"+bk.getNoOfPages()+"')";
//        String sql = "insert into bookdetails(`bookId`, `title`, `author`, `mainClassification`, `subClassification`, `yearOfPublishing`, `lastPrintedYear`, `isbnNo`, `noOfPages`) values('"+addbook.getBookId()+"','"+addbook.getTitle()+"','"+addbook.getAuthor()+"','"+addbook.getMainClassification()+"','"+addbook.getSubClassification()+"','"+addbook.getYearOfPublishing()+"','"+addbook.getLastPrintedYear()+"','"+addbook.getIsbnNo()+"','"+addbook.getNoOfPages()+"')";
//       String sql = "insert into bookdetails  values('1','1','1','1','1','1','1','1','1')";
        statement.execute(sql);
}
    
    public List M_name(){
         List<String> classificationList=new ArrayList<>();
        try{ 
            dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        String query="select mainClassification from mainclassification ";
        
        Statement stmt = con.createStatement();
       ResultSet rs= stmt.executeQuery(query);
       
            while (rs.next()) {
               classificationList.add(rs.getString("mainClassification"));
                System.out.println("test"+rs.getString("mainClassification"));
            }
        }
              
      catch(SQLException e){
           System.out.println(e.toString());
       }
       
    return classificationList;
    }
    public List S_name(){
         List<String> classificationList=new ArrayList<>();
        try{ 
            dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        String query="select subClassification from subclassification ";
        
        Statement stmt = con.createStatement();
       ResultSet rs= stmt.executeQuery(query);
       
            while (rs.next()) {
               classificationList.add(rs.getString("subClassification"));
               System.out.println("test"+rs.getString("subClassification"));
            }
        }
              
      catch(SQLException e){
           System.out.println(e.toString());
       }
       
    return classificationList;
    }

    public List subclasificationname(String mname) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      List<String> subclassificationList=new ArrayList<>();
        try{ 
            dbConnection dbconnection = new dbConnection();
        Connection con = dbconnection.getDbConnection();
        
        String query="select subClassification from subclassification where mainClassificationId='"+mname+"'";
        
        
        Statement stmt = con.createStatement();
       ResultSet rs= stmt.executeQuery(query);
       
            while (rs.next()) {
               subclassificationList.add(rs.getString("subClassification"));
               System.out.println("test"+rs.getString("subClassification"));
            }
        }
              
      catch(SQLException e){
           System.out.println(e.toString());
       }
       
    return subclassificationList;
    }
    
}

