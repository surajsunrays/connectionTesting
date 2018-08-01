/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;
import java.io.FileOutputStream;
/**
 *
 * @author Sunrays
 */
public class FileOutput3 {
    public static void main(String[] args) {
        try
        {
            File f = new File("testing.txt");
            FileOutputStream fos = new FileOutputStream(f);
            String details = "I Love my India";
            
            fos.write(details.getBytes());
            fos.flush();
            fos.close();
            System.out.println("Success");
         //   f.delete();
        }catch(Exception e)
        {
            System.out.println("Error :"+e);
        }
    }
}
