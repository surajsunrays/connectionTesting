/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sunrays
 */
public class ServletDeleteData extends HttpServlet {
    Connection con = null;
    Statement st = null;
    public void init()
    {
        con = DataConnection.connectDB();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int roll = Integer.parseInt(request.getParameter("roll"));
        try
        {
            String query = "delete from student1 where roll = '"+roll+"'";
            st = con.createStatement();
            int rows = st.executeUpdate(query);
            if(rows > 0)
            {
                out.print("<h2>Data Deleted</h2>");
                out.print("<a href='ServletGetData'>Check Data</a>");
            }
            else
            {
                out.print("<h3>No Data Found or Error occured</h3>");
                out.print("<a href='deleteData.html'>return to Try Again</a><br>");
                out.print("<a href='index.html'>return to Main Page</a>");
            }
        }catch(Exception e)
        {
            out.print(e);
        }
        out.close();
    }
    public void destroy()
    {
        if(con != null)
        {
            try
            {
                
                con.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
