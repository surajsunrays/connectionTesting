/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author Sunrays
 */
public class DataOutStreamEx {
    public static void main(String[] args) {
        try
        {
            File f = new File("Sample.txt");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            int count = fis.available();
            byte[] ary = new byte[count];
            dis.read(ary);
            for(byte bt : ary)
            {
             //   char k = (char)bt;
                System.out.print(((char)bt));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
