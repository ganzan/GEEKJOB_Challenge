/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class 引数と戻り値1 extends HttpServlet {
    
    ArrayList<String> profileA = new ArrayList<>();
    ArrayList profileA(String idA){
        
        profileA.add(idA);
        profileA.add("Aさんの生年月日");
        profileA.add("Aさんの住所");        
        return profileA;       
    }
    ArrayList<String> profileB = new ArrayList<>();{
    
        profileB.add("456");
        profileB.add("Bさんの生年月日");
        profileB.add("Bさんの住所");
}
    
    ArrayList<String> profileC = new ArrayList<>();{
    
        profileC.add("789");
        profileC.add("Cさんの生年月日");
        profileC.add("Cさんの住所");
}

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
            out.println("<title>Servlet 引数と戻り値1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet 引数と戻り値1 at " + request.getContextPath() + "</h1>");
            
            String idA = ("123");
            
            int i = 0;
            while(i<3){
                
                i++;out.print(profileA(idA).get(i) + "<br>");i++;
                
                out.print(profileA(idA).get(i) + "<br><br>");i++;
            }
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
        processRequest(request, response);
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
