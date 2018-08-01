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
public class BackActivity {
    int accountNumber;
    double amount;

    public BackActivity(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public void deposit(double depositAmount) throws NegativeAmountException
    {
        if(depositAmount < 0)
        {
            throw new NegativeAmountException(depositAmount);
        }
        else
        {
            amount = amount + depositAmount;
            System.out.println("Amount to be deposit:"+depositAmount);
            System.out.println("Amount Deposited Successfully");
            System.out.println("New Balance is:"+amount);
        }   
    }
    public void withdraw(double withdrawAmount) 
    {
        try
        {
            if(withdrawAmount > amount)
            {
                System.out.println("Amount to be withdraw :"+withdrawAmount);
                System.out.println("Current Balanece:"+amount);
                throw new InsufficientAmountException(amount);
            }
            else
            {
                amount = amount - withdrawAmount;
                System.out.println("Withdraw Successfull :"+withdrawAmount);
            System.out.println("Remaining Balance is:"+amount);
            }
            
        }catch(Exception e)
        {
            System.out.println("Exception Occured :"+e);
        }
    }
    public void status()
    {
        System.out.println("Balance is:"+amount);
    }
}
