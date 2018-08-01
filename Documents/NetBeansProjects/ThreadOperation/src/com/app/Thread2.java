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
public class Thread2 implements Runnable {
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Thread2 t = new Thread2();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
