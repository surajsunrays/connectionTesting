/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 *
 * @author Sunrays
 */
public class Filestream1 {
    public static void main(String[] args) {
        try
        {
            File f = new File("change.txt");
            PrintWriter pw = new PrintWriter(f);
            pw.println("Username");
            pw.println("password");
            pw.flush();
            pw.close();
            
            Scanner sc = new Scanner(f);
            String name = sc.nextLine();
            String pass = sc.nextLine();
            
            System.out.println(name + pass);
            sc.close();
            
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
