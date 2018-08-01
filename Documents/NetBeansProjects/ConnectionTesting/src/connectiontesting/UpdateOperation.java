/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author Sunrays
 */
public class UpdateOperation {
    public static void main(String args[])
    {
        Connection con = ConObj.connectDB();
        Statement st = null;
        Scanner sc = new Scanner(System.in);
    
        int roll = 0;
        String newName = null;
        System.out.println("Enter Student Roll Number Want to Update Name : ");
        roll = sc.nextInt();
        System.out.println("Enter Student New Name");
        newName = sc.next();
        try
        {
            String updateQuery = "update student set name = '"+newName+"' where roll ='"+roll+"'";
            st = con.createStatement();
            int result = st.executeUpdate(updateQuery);
            if(result > 0)
            {
                System.out.println("Entry Updated Successfully ");
            }
            else
            {
                System.out.println("No such Record Found");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error While Connecting :"+e);
        }
    }
}
