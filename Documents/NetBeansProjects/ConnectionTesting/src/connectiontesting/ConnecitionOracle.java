/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Sunrays
 */
public class ConnecitionOracle {
    public static void main(String args[])
    {
        Connection con = null;
        try
        {
            String user = "suraj";
            String password = "sunrays";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,password);
            if(con != null)
            {
                System.out.println("\tConnection Successfull\t");
            }
        }catch(Exception e)
        {
            System.out.println("Error Occured :"+e);
        }
    }
}
