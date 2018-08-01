/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktest4;

/**
 *
 * @author Sunrays
 */
public class BankTest4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BackActivity bt = new BackActivity(101, 1000);
        try {
            bt.status();
        bt.deposit(500);
        bt.withdraw(500);
        bt.deposit(100);
        bt.deposit(-1500);
        bt.withdraw(1200);
        } catch (Exception e) {
            System.out.println("Exception Occured :"+e);
        }
        
    }
    
}
