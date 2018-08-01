/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sunrays
 */
@WebServlet(name = "SendRedirectEx", urlPatterns = {"/SendRedirectEx"})
public class SendRedirectEx extends HttpServlet {
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException
    {
        int count = 10;
        PrintWriter out = res.getWriter();
        out.println("Sending redirect to Google....");
        try {
                Thread.sleep(1000);
                for(int i = 0;i < 5 ;i++)
                {
                    
                    out.println("TIme:"+count+i);   
                }
                        
                      //  res.setHeader("Refresh", "1");
                    

        } catch (Exception e) {
            out.println("Error:"+e);
        }
    //    res.setHeader("Refresh", "5;url=http://www.google.co.in");
        out.flush();
        out.close();
    }
}
