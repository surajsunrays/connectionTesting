/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sunrays
 */
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //Getting Username and Password
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(user.equals("sunrays") && pass.equals("sunrays"))
        {
            out.print("Welcome User : "+user);
            out.print("<h3>Login Successful </h3>");
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            
            
        }
        else
        {
            response.sendRedirect("Login.jsp");
            
            
        }
        out.close();
    }

}
