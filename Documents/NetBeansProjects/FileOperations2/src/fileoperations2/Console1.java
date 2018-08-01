/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations2;

import java.io.Console;

/**
 *
 * @author Sunrays
 */
    public class Console1 {
        public static void main(String[] args) {
            try
            {
            Console c = System.console();
            System.out.println("Enter your Name:");
            String p = "Suraj";
            String n = c.readLine();
            System.out.println(n);

            }catch(Exception e)
            {
                System.out.println("Error:"+e);
            }
           }

    }
