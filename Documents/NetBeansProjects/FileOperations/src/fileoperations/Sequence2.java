/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author Sunrays
 */
public class Sequence2 {
    public static void main(String[] args) {
         try
        {
            File f1 = new File("Sample.txt");
            File f2 = new File("testing.txt");
            
            FileInputStream fis1 = new FileInputStream(f1);
            FileInputStream fis2 = new FileInputStream(f2);
            // Sequence Input Stream for merging data
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            int i = 0; 
            
            //OutputStream for Writing data to third file
            
            File f3 = new File("third.txt");
            f3.createNewFile();
            
            FileOutputStream fos = new FileOutputStream(f3);
            while((i=sis.read()) != -1)
            {
                //System.out.print((char)i);
                fos.write(i);
            }
        }catch(Exception e)
        {
            System.out.println("Error "+e);
        }
    }
}
