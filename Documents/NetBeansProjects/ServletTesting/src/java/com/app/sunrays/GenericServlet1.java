/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sunrays
 */
public class GenericServlet1 extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String user = req.getParameter("username");
        int size = req.getContentLength();
        String charEncode = req.getCharacterEncoding();
        String contType = req.getContentType();
        final String serverName = req.getServerName();
        
        
        out.println("Checking Generic Servlet<br>");
        out.println("\nContent Length :"+size+"<br>");
        out.println("\nCharachter Encoding :"+charEncode+"<br>");
        out.println("\nContent Type :"+contType+"<br>");
        out.println("\nServer Name :"+serverName+"<br>");
        out.println("\n"+user+" ... Welcome to Test Servlet<br>");
        out.close();
    }
        
}
