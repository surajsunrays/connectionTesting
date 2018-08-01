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
public class AccountActivity {
    int accNo;
    double amount;

    public AccountActivity(int accNo, double amount) {
        this.accNo = accNo;
        this.amount = amount;
    }
    public void Checkout()
    {
        System.out.println("Account Number:"+accNo);
        System.out.println("Account Balance :"+amount);
    }
    public void deposit(double amountDeposit)
    {
        amount = amount + amountDeposit;
        System.out.println("Deposit Successfull. New Balance is :"+amount);
    }
    public void withdraw(double withdrawAmount) throws InsufficientFundException
    {
        if(amount > withdrawAmount)
        {
            amount = amount  - withdrawAmount;
            System.out.println("Withdraw Successful :"+amount);
        }
        else
        {
            System.out.println("Insufficient fund in your account:");
            System.out.println("Amount needed :"+(withdrawAmount - amount));
            throw new InsufficientFundException(accNo , amount);
        }
    }
}
