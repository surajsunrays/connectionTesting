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
public class SessionServlet2 extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        HttpSession ss = request.getSession();
        String s = (String)ss.getAttribute("user");
        if(s == null)
        {
            out.println("No Session Available<br>");
         //   throw new NullPointerException("No Session vaailabe");
           out.println("Create Session :<a href='index.html'>Create Session</a>");
            
        }
        else if(!s.equals(""))
        {
            out.println("Welcome User :"+s+"<br>");
            out.println("<a href='SessionOut'>Click to LoGGOut</a>");
        }
        
    }
}
