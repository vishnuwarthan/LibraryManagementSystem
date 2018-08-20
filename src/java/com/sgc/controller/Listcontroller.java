/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.controller;

import com.sgc.model.bookdao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thanusha
 */
@WebServlet(name = "Listcontroller", urlPatterns = {"/Listcontroller"})
public class Listcontroller extends HttpServlet {
    
   // bookdao classC = new bookdao();

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
            request.setAttribute("bookId",request.getParameter("BookId"));
        request.setAttribute("title",request.getParameter("Title"));
        request.setAttribute("author",request.getParameter("Author"));
        
        String mname = request.getParameter("mainClassification");
        request.setAttribute("mainclassification",mname);
        
        request.setAttribute("subclassification",request.getParameter("subClassification"));
        request.setAttribute("Year_of_publishing",request.getParameter("YearOfPublishing"));
        request.setAttribute("Last_Printed_Year",request.getParameter("LastPrintedYear"));
        request.setAttribute("ISBNNO",request.getParameter("ISBNNO"));
        request.setAttribute("No_Of_Pages",request.getParameter("NoOfPages"));
        
        bookdao b=new bookdao();
        List x = b.subclasificationname(mname);
        List y =b.M_name();
        request.setAttribute("subclassificationList", x);
        request.setAttribute("mainclassificationList", y);
        
        ServletContext context=getServletContext();
        RequestDispatcher rd = context.getRequestDispatcher("/Sample.jsp");
        rd.forward(request, response);
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
        processRequest(request, response);
        
        
        
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
