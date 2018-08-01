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
public class Four extends HttpServlet {

    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException , IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String s = req.getParameter("username");
        String p = req.getParameter("password");
        String ss = req.getServerName();
        int port = req.getServerPort();
        int l = req.getContentLength();
        String ct = req.getContentType();
        out.println("Welcome: "+s);
        out.println("<br>");
        out.println("Your Username is :"+s+"<br>");
        out.println("Your password is :"+p+"<br>");
        out.println("Server:"+ss+"<br>");
        out.println("Port:"+port+"<br>");
        out.println("Length:"+l+"<br>");
        out.println("Content Type:"+ct+"<br>");
        out.flush();
        out.close();
    }
}
