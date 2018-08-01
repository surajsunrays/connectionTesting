/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktrial3;

/**
 *
 * @author Sunrays
 */
public class TestBank3 {
    public static void main(String[] args) {
        try
        {
            BankTrialAcitivity bt = new BankTrialAcitivity(100, 500);
            bt.deposit(100);
            bt.withdraw(200);
            bt.deposit(500);
            bt.withdraw(400);
            bt.deposit(-400);
            bt.deposit(100);
            bt.withdraw(12000);
        }catch(Exception e)
        {
            System.out.println("Exception occured:"+e);
        }
    }
}
