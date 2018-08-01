/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Statement;
/**
 *
 * @author Sunrays
 */
public class InsertOperation {
    public static void main(String args[])
    {
        Connection con = ConObj.connectDB();
        Statement st = null;
        Scanner sc = new Scanner(System.in);
        try
        {
            int roll = 0;
            String name = null;
            int marks = 0;
            System.out.println("Enter Roll Number :");
            roll = sc.nextInt();
            System.out.println("Enter Student Name");
            name = sc.next();
            System.out.println("Enter Student Marks");
            marks = sc.nextInt();
            String insertQuery = "insert into student values('"+roll+"','"+name+"','"+marks+"')";
            st = con.createStatement();
            int result = st.executeUpdate(insertQuery);
            if(result > 0)
            {
                System.out.println(roll+" :Record inserted");
            }
            else
            {
                System.out.println("Not Inserted");
            }
        }catch(Exception e)
        {
            System.out.println("Error Occured :"+e);
        }
    }
}
