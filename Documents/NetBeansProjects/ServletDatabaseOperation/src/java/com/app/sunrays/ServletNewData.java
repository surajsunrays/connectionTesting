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
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author Sunrays
 */
public class ServletNewData extends HttpServlet {
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
        ///////////////////////////////////////////////////////////////
        int roll = Integer.parseInt(request.getParameter("roll"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        ////////////////////////////////////////////////////////
        if(con != null)
        {
            try {
                String query ="insert into student1 values('"+roll+"','"+name+"','"+address+"')";
                st = con.createStatement();
                int rows = st.executeUpdate(query);
                if(rows > 0)
                {
                    out.print("<h3>Data Inserted Sucessfully....</h3>");
                    out.print("<a href='ServletGetData'>Check Data </a>");
                }
            } catch (Exception e) {
                out.print(e);
            }
            
        }
        else
        {
            out.print("<h2>Error while Connecting</h2>");
        }
    }
    
    public void destroy()
    {
        if(con != null)
        {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
