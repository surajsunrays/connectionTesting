/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking1;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Sunrays
 */
public class UrlDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL u = new URL("https://www.javatpoint.com/URL-class");
        System.out.println("Protocol IS:"+u.getProtocol());
        System.out.println("Host is:"+u.getHost());
        System.out.println("File is:"+u.getFile());
        System.out.println("Port Number :"+u.getPort());
        System.out.println("FIle is:"+u.getFile());
    }
}
