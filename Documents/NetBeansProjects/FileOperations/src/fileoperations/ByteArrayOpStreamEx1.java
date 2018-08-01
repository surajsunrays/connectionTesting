/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author Sunrays
 */
public class ByteArrayOpStreamEx1 {
    public static void main(String[] args) {
         try
        {
            File f1 = new File("Sample.txt");
            File f2 = new File("testing.txt");
            
            FileOutputStream fos1 = new FileOutputStream(f1);
            FileOutputStream fos2 = new FileOutputStream(f2);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(65);
            baos.writeTo(fos1);
            baos.writeTo(fos2);
            baos.flush();
            baos.close();
            fos1.close();
            fos2.close();
            
        }catch(Exception e)
        {
            System.out.println("Error "+e);
        }
    }
}
