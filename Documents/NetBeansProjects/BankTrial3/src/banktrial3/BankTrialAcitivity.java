/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktrial3;

import javax.naming.InsufficientResourcesException;

/**
 *
 * @author Sunrays
 */
public class BankTrialAcitivity {
    int accountNumber;
    double amount;

    public BankTrialAcitivity(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public void deposit(double depositAmount) throws NegativeAmountException
    {
        try
        {
            if(depositAmount < 0)
        {
            System.out.println("amount cannot be Negative");
            throw new NegativeAmountException(depositAmount);
        }
         else
         {
             amount = amount + depositAmount;
             System.out.println("Deposit Successfull : Balance Is:"+amount);
   
         }
        }catch(Exception e)
        {
            System.out.println("Exeption Occured"+e);
        }
         
         }

   
    public void withdraw(double withdrawAmount) throws NegativeAmountException , InsufficientFundException
    {
       
        if(withdrawAmount > amount)
        {
            System.out.println("Your Account balance is not sufficient");
            double need = withdrawAmount - amount;
            throw new InsufficientFundException(need);
        }
        else
        {
            amount = amount - withdrawAmount;
            System.out.println("WithDraw Successfull. Remaining Balance is:"+amount);
        }
    }
    
}
