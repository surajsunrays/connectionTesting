/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.sunrays.DataConnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sunrays
 */
public class ServletGetData extends HttpServlet {
    Connection con = null;
    Statement st = null;
    ResultSet rst = null;
    
    public void init()
    {
        con = DataConnection.connectDB();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            if(con != null)
            {
                out.print("<h2>Connected Successfully</h2>");
                try
                {
                    String query = "select * from student1 order by roll";
                    st = con.createStatement();
                    rst = st.executeQuery(query);
                    while(rst.next())
                    {
                        
                        out.print(rst.getInt(1)+"     ");
                        out.print(rst.getString(2)+"     ");
                        out.print(rst.getString(3)+"<br>");
                    }
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                out.print("<h2>Connection Failed</h2>");
            }
            out.print("<h4>GO back to Home Page</h4>");
            out.print("<a href='index.html'>Main Page</a>");
        out.close();
    }
    public void destroy()
    {
        if(con != null)
        {
            try {
                con.close();
                System.out.println("Connection Closed Sucessfully.....");
            } catch (SQLException ex) {
                Logger.getLogger(ServletGetData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
