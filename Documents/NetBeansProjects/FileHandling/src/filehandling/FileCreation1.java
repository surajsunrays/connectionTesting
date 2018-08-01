/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
/**
 *
 * @author Sunrays
 */
public class FileCreation1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("Sample.txt");
            f1.createNewFile();
            FileOutputStream fos1 = new FileOutputStream(f1);
            
            File f2 = new File("Sample2.txt");
            f2.createNewFile();
            FileOutputStream fos2 = new FileOutputStream(f2);
            
            
            BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
            String s1 = "Satish madarchod ahe";
            bos1.write(s1.getBytes());
            
            
            BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
            String s2 = "Raju madarchod ahe";
            bos2.write(s2.getBytes());
            
           
            
            
            FileInputStream fis1 = new FileInputStream(f1);
            BufferedInputStream bis1 = new BufferedInputStream(fis1);
            
            FileInputStream fis2 = new FileInputStream(f2);
            BufferedInputStream bis2 = new BufferedInputStream(fis2);
            
             SequenceInputStream sis = new SequenceInputStream(bis1, bis2);
        //    int i = fos.read();
         //   System.out.println(i);
            int i = 0;
           while((i = sis.read()) != -1)
           {
               System.out.print((char)i); 
           }
            
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }
}
