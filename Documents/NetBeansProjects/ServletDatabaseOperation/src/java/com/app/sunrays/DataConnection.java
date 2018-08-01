/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sunrays;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.jsp.tagext.TryCatchFinally;

/**
 *
 * @author Sunrays
 */
public class DataConnection {
    private static String CONN_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String USER = "suraj";
    private static String PASS = "sunrays";
    private static String CLASSNAME = "oracle.jdbc.driver.OracleDriver";
    public static Connection con = null;
     public static Connection connectDB()
    {
        try
        {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(CONN_URL, USER, PASS);
            
        }catch(Exception e)
        {
            System.out.println("Connection Error:"+e);
        }
        return con;
    }
}
