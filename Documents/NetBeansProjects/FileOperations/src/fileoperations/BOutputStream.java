/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Sunrays
 */
public class BOutputStream {
    public static void main(String[] args) {
        try
        {
            File f = new File("Sample.txt");
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String s = "I Love My India";
            
            bos.write(s.getBytes());
            
            bos.flush();
            
            bos.close();
            fos.close();
            System.out.println("Success");
            
            //Reading from file
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            int bufferCount = bis.available();
            
            FileDescriptor fd = null;
            fd = fis.getFD();
            System.out.println(fd);
            System.out.println(bufferCount);
            int i = 0;
            while((i = bis.read()) != -1)
            {
                System.out.print((char)i);
            }
            
            bis.close();
            fis.close();
            
        }catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}
