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
public class Thread1 extends Thread{
    public void run()
    {
        System.out.println("Thread Is running");
    }
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
    }
}
