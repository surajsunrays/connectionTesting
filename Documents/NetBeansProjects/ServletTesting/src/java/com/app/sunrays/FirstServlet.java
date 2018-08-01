/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
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
public class FirstServlet implements Servlet {

    ServletConfig config = null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet COnfiguration is :"+config);
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.println("Sample Servlet Checking......");
        out.close();
    }

    @Override
    public String getServletInfo() {
        return "Servlet Information :";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet is Destroyed");
    }
    
}
