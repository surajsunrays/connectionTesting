/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sunrays
 */
public class PostConnection {
    public static void main(String[] args) {
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/projectshop", "Suraj", "sunrays");
            if(con != null)
            {
                System.out.println("Connection successfull");
                st = con.createStatement();
                ResultSet rst = st.executeQuery("select * from student");
                while(rst.next())
                {
                    System.out.println("Getting Data:"+rst.getString(1));
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error Occured:"+e);
        }
    }
}
