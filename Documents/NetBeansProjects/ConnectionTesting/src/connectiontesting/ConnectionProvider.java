/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Sunrays
 */
public class ConnectionProvider {
    static
    {
        try
        {
            String class_Name = "com.mysql.jdbc.Driver";
            Class.forName(class_Name);
        }
        catch(Exception e)
        {
            System.out.println("Error while Connecting");
        }
        
        
    }
    
        static final String url = "jdbc:mysql://localhost:3306/sunrays";
        static final String username = "root";
        static final String password = "sunrays";
         public static Connection ConnectDB() throws SQLException {  
      return DriverManager.getConnection(url,username,password);
    
    }
}
