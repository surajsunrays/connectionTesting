/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.FileOutputStream;
import java.io.File;
/**
 *
 * @author Sunrays
 */
public class FileOutputStreamEx1 {
    public static void main(String args[])
    {
        try
        {
            File file = new File("test.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("Success Printing");
        }catch(Exception e)
        {
            System.out.println("Error Occured:"+e);
        }
    }
}
