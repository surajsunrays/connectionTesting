/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sunrays
 */
public class LoginCheck extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = null;
       String uname = request.getParameter("username");
       String passwd = request.getParameter("password");
     
      
           out.print("<h2>Currently no Active Session </h2>");
                    if(uname.equals("sunrays") && passwd.equals("sunrays"))
                {
                    out.print("Welcome :"+uname);
                    session = request.getSession();
                    session.setAttribute("uname", uname);
                    out.print("<h3>Session Created</h3>");
                    out.print("<form action='SecondServlet'>");
                    out.print("<input type='submit' value='Second Session Servlet'>");
                    out.print("</form>");

                }
                else
                {
                    out.print("<h2>Invalid Username or Password </h2>");
                    response.sendRedirect("index.html");

                }
     
        out.close();
    }

}
