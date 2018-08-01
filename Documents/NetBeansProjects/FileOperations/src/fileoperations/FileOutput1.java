/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;
/**
 *
 * @author Sunrays
 */
public class FileOutput1 {
    public static void main(String[] args) {
       try
       {
           File file = new File("Sample");
           file.mkdir();
           boolean isAvailable = file.exists();
           if(isAvailable)
           {
               System.out.println("Folder available");
           }
           else
           {
               System.out.println("Folder Not Exists");
           }
           
       }catch(Exception e)
       {
           System.out.println("Error Occured:"+e);
       }
    }
}
