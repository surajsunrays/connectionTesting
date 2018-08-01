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
public class FileOutput2 {
    public static void main(String[] args) {
        try
        {
            File sampleText = new File("SampleDoc.jpg");
        sampleText.createNewFile();
        boolean isAvailable = sampleText.exists();
        if(isAvailable)
        {
            System.out.println("Available");
        }
        else
        {
            System.out.println("Not Available");
        }
        }
        catch(Exception e)
        {
            System.out.println("Error :"+e);
        }
        
        
    }
}
