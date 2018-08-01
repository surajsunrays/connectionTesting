/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.ByteArrayInputStream;

/**
 *
 * @author Sunrays
 */
public class ByteInStream {
    public static void main(String[] args) {
        try
        {
            byte[] buf = {35,36,37,38};
            
            ByteArrayInputStream bais = new ByteArrayInputStream(buf);
            
            int k = 0;
            while((k = bais.read()) != -1)
            {
                char ch = (char)k;
                System.out.println("Value :"+k+"\t\t"+"Character is:"+ch);
            }
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
