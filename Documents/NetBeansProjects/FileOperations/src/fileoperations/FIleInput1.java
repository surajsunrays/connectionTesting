/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.InputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
/**
 *
 * @author Sunrays
 */
public class FIleInput1 {
    public static void main(String[] args) {
        try
        {
            File f = new File("Sample.txt");
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(65);
            FileInputStream fis = new FileInputStream(f);
            int  i = fis.read();
            System.out.println(i);
            fis.close();
            fos.close();
        }catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}
