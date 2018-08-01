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
public class profileServlet extends HttpServlet {
  
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       request.getRequestDispatcher("link.html").include(request, response);
       Cookie ck[] = request.getCookies();
       if(ck != null)
       {
            String name = ck[0].getValue();
            if(!name.equals("") || name != null)
            {
                out.println("Welcome to Profile page:"+name);
                
            }
            else
            {
                out.println("Please login first");
                request.getRequestDispatcher("login.html").include(request, response);
            }
       }
       else
       {
           out.println("Login First");
       }
       out.flush();
       out.close();
       
    }

   
}
