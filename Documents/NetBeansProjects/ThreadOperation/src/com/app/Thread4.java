/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

/**
 *
 * @author Sunrays
 */
public class Thread4 extends Thread{
    public void run()
    {
        try
        {
            for(int i = 0; i< 5; i++)
            {
                Thread.sleep(500);
                System.out.println(i);
            }
        }catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();
        t1.start();
        try {
            t1.join(500);
            
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        t3.setName("Sunrays");
        t3.start();
        t2.start();
        System.out.println("t3 Name:"+t3.getName());
        System.out.println("T3 Id"+t3.getId());
        System.out.println("T3 Class"+t3.getClass());
    }
}
