/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.controller;
import com.sgc.model.addMain;
import com.sgc.model.addMainDAO;
import com.sgc.model.addSub;
import com.sgc.model.addSubDAO;
import com.sgc.model.book;
import com.sgc.model.bookdao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Saruga
 */
@WebServlet(name = "BookController", urlPatterns = {"/BookController"})
public class BookController extends HttpServlet {
     book book = new book();
    bookdao bookdao = new bookdao();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

       request.getRequestDispatcher("/Sample.jsp").forward(request, response);

        //String x = book.getBookId();
        // System.out.println();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
             book.setBookId(request.getParameter("BookId"));
             book.setTitle(request.getParameter("Title"));
             book.setAuthor(request.getParameter("Author"));
             book.setMainClassification(request.getParameter("mainClassificationId"));
             book.setSubClassification(request.getParameter("subClassificationId"));
             book.setYearOfPublishing(request.getParameter("YearOfPublishing"));
             book.setLastPrintedYear(request.getParameter("LastPrintedYear"));
             book.setIsbnNo(request.getParameter("ISBNNO"));
             book.setNoOfPages(request.getParameter("NoOfPages"));
          try{   
             bookdao.saveBook(book);
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
         }
        request.getRequestDispatcher("/Sample.jsp").forward(request,response);
                
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

    
