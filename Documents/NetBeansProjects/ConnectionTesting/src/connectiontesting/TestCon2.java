/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontesting;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Sunrays
 */
public class TestCon2 {
    public static void main(String args[])
    {
        Connection con = ConObj.connectDB();
        Statement st = null;
        ResultSet rst = null;
        if(con != null)
        {
            try
            {
                String query = "select * from student";
                st = con.createStatement();
                rst = st.executeQuery(query);
                while(rst.next())
                    {
                          System.out.println("Getting Result:\t\t"+rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getInt(3));
                    }
            }catch(Exception e)
            {
                System.out.println("Error Occured :"+e);
            }
            
        }
    }
}
