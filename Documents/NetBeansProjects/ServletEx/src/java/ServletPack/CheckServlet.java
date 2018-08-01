/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sunrays
 */
public class CheckServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Servlet is working Fine</h2>");
            out.flush();
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }       
}
