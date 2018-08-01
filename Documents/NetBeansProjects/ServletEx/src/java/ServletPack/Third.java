/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPack;

import java.io.IOException;
import java.io.PrintWriter;
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
public class Third extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException , IOException
    {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.println("<h2>This is from HTTPServlet Page</h2>");
        out.flush();
    }
}
