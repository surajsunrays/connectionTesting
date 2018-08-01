/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPack;

import java.util.Scanner;
/**
 *
 * @author Sunrays
 */
public class CountDown1 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread t = new Thread();
        
        
        System.out.println("Enter time want to set a timer :");
        int n = sc.nextInt();
        for(int i = n; i>=0; i--)
        {
            Thread.sleep(1000);
            System.out.println("Remaining Time:"+i);
            if(i==0)
            {
                System.out.println("Time is Over !!!");
            }
        }
        
    }
}
