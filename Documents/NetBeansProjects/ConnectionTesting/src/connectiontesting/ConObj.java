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
public class ConObj {
    static Connection con = null;
    
    //Final variables for Connection
    private static final String class_Name = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/sunrays";
    private static final String user = "root";
    private static final String password = "sunrays";
    public static Connection connectDB()
    {
        try
        {
            Class.forName(class_Name);
            con = DriverManager.getConnection(url, user, password);
            
        }catch(Exception e)
        {
            System.out.println("Connection Error:"+e);
        }
        return con;
    }
}
