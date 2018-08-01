/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexcept1;

/**
 *
 * @author Sunrays
 */
public class TestBank {
    public static void main(String[] args) {
        try
        {
             CheckingAccount ca = new CheckingAccount(101,500);
                
                System.out.println("Balance Before deposit"+ca.getBalance());
                ca.deposit(100);
                
                System.out.println("Balance after Deposit:"+ca.getBalance());
                
                
                ca.withdraw(800);
                
        }catch(InSufficientFundException e)
        {
            
            
            System.out.println("Exception occur:"+e);
        }
       
        
    }
}
