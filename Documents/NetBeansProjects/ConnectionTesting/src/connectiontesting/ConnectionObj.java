/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;

import java.sql.Connection;
import java.sql.DriverManager;
import connectiontesting.Details;
/**
 *
 * @author Sunrays
 */
public class ConnectionObj {
    Connection con = null;
    
    public Connection getConn()
    {
        try
        {
              
            String url = "jdbc:mysql://localhost:3306/sunrays";
            String user = "root";
            String password = "sunrays";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            if(con != null)
            {
                System.out.println("\tConnection Successfull");
                return con;
            }
        }catch(Exception e)
        {
            System.out.println("Error While Connecting: "+e);
        }
        return con;
    }
}
