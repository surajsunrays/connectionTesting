/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
/**
 *
 * @author Sunrays
 */
public class UpdateWithCheck {
    public static void main(String args[])
    {
        Connection con = ConObj.connectDB();
        Statement selectStatement = null, updateStatement = null;
        ResultSet rst = null;
        Scanner sc = new Scanner(System.in);
        String newName = null;
        int roll = 0;
        System.out.println("Enter roll Number want to Upadte Name");
        roll = sc.nextInt();
        try
        {
            String selectQuery = "select roll from student where roll = '"+roll+"'";
            selectStatement = con.createStatement();
            rst = selectStatement.executeQuery(selectQuery);
            if(rst.next())
            {
                System.out.println("Record Found");
                System.out.println("Enter Name to Update:");
                newName = sc.next();
                String deleteQuery = "update student set name = '"+newName+"' where roll = '"+roll+"'";
                updateStatement = con.createStatement();
                int result = updateStatement.executeUpdate(deleteQuery);
                if(result > 0)
                {
                    System.out.println("Record Updated Successfully");
                }
                else
                {
                    System.out.println("Record Not deleted ");
                }
            }
            else
            {
                System.out.println("Record not found");
            }
                      
        }catch(Exception e)
        {
            System.out.println("Error while connecting :"+e);
        }
        
    }
}
