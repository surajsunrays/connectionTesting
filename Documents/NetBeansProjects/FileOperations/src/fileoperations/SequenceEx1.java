/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author Sunrays
 */
public class SequenceEx1 {
    public static void main(String[] args) {
        try
        {
            File f1 = new File("Sample.txt");
            File f2 = new File("testing.txt");
            
            FileInputStream fis1 = new FileInputStream(f1);
            FileInputStream fis2 = new FileInputStream(f2);
            
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            int i = 0; 
            while((i=sis.read()) != -1)
            {
                System.out.print((char)i);
            }
        }catch(Exception e)
        {
            System.out.println("Error "+e);
        }
    }
}
