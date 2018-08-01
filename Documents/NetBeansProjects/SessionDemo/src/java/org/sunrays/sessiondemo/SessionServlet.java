/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sunrays.sessiondemo;

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
public class SessionServlet extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String user = request.getParameter("user");
        
        if(!user.equals("") || user!=null)
        {
            HttpSession ss = request.getSession();
            ss.setAttribute("user", user);
            out.println("Session is created for you !! "+user);
            out.println("<a href='SessionServlet2'>Session Check</a>");
        }
        
    }
}
