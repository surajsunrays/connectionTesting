/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sunrays.loginapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sunrays
 */
public class loginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            String s = request.getParameter("username");
            String p = request.getParameter("password");
            String match = "sunrays";
            if(s.equals(match) && p.equals(match))
            {
                out.println("WELCOME :"+s);
                Cookie ck = new Cookie("user",s);
                response.addCookie(ck);
                request.getRequestDispatcher("link.html").include(request, response);
            }
            else
            {
                out.println("Username Passed is:"+s+"<br>");
                out.println("password Passed is:"+p+"<br>");
                out.println("Username or password is Wrong");
                request.getRequestDispatcher("login.html").include(request, response);
            }
    }


}
