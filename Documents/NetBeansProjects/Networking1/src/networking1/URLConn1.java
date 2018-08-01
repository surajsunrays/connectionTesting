/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking1;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Sunrays
 */
public class URLConn1 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.javatpoint.com/URL-class");
            URLConnection ucon = u.openConnection();
            InputStream is = ucon.getInputStream();
            
            int i = 0;
            while((i = is.read()) != -1)
            {
                System.out.print((char)i);
            }
        } catch (Exception e) {
        }
    }
}
