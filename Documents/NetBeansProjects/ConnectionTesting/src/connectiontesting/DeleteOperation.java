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
public class DeleteOperation {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Connection con = ConObj.connectDB();
        Statement st = null;
        System.out.println("Enter the roll Number Want to delete");
        int roll = sc.nextInt();
        try
        {
            String deleteQuery = "delete from student where roll = '"+roll+"'";
            st = con.createStatement();
            int result = st.executeUpdate(deleteQuery);
            if(result > 0)
            {
                System.out.println("Record Deleted ");
            }
            else
            {
                System.out.println("No such Record found");
            }
        }catch(Exception e)
        {
            System.out.println("Error Occured :"+e);
        }
    }
}
