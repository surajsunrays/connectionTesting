/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sunrays
 */
public class Five extends HttpServlet {
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException
    {
        ServletConfig config = getServletConfig();
        PrintWriter out = res.getWriter();
        String d = config.getInitParameter("driver");
        Enumeration<String> e = config.getInitParameterNames();
        String s = "";
        while(!e.hasMoreElements())
        {
            s = e.nextElement();
            out.println("Values are:"+s);
        }
        out.println("Init Paramter is:"+d);
        out.flush();
        out.close();
        
    }
}
