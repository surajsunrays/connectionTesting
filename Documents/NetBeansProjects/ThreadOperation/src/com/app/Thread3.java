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
public class Thread3 extends Thread{
    public void run()
    {
        try {
            for(int i =0; i< 10;i++)
            {
                Thread.sleep(500);
                System.out.println("Thread is running"+i);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        
    }
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread3 t2 = new Thread3();
        t1.run();
        t2.run();
        
    }
}
