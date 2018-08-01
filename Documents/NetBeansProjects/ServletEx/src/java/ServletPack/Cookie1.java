/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPack;

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
public class Cookie1 extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String uname = req.getParameter("username");
        out.println("Welcome User :"+uname);
        Cookie ck = new Cookie("uname" ,uname);
        res.addCookie(ck);
        
        out.println("<a href= 'Cookie2'>Next Page</a>");
        out.flush();
        out.close();
    }
}
