/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;

import java.sql.Connection;
/**
 *
 * @author Sunrays
 */
public class TestCon {
    public static void main(String args[])
    {
        try
        {
            Connection con = ConnectionProvider.ConnectDB();
            if(con != null)
            {
                System.out.println("Connected");
            }
        }catch(Exception e)
        {
            System.out.println("Error in Connection :"+e);
        }
        
    }
}
