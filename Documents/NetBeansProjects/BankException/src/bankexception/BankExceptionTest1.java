/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankexception;

/**
 *
 * @author Sunrays
 */
public class BankExceptionTest1 {
    public static void main(String[] args) {
        try
        {
            AccountActivity aa = new AccountActivity(100, 500);
            aa.Checkout();
            aa.deposit(500);
            aa.Checkout();
            aa.withdraw(200);
            aa.Checkout();
            aa.withdraw(1200);
            aa.Checkout();
        }catch(Exception e)
        {
            System.out.println("Exception occured:"+e);
        }
        
        
    }
}
