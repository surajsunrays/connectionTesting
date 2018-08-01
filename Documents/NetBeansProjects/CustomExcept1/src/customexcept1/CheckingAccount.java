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
public class CheckingAccount {
    public int accountNumber;
    public double amount;

    public CheckingAccount(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public void deposit(double deposit)
    {
        amount = amount + deposit;
    }
    public void withdraw(double withDrawAmount) throws InSufficientFundException
    {
        if(amount > withDrawAmount)
        {
            amount = amount - withDrawAmount;
        }
        else
        {
            double need = withDrawAmount - amount;
            throw new InSufficientFundException(need);
        }
        
    }
    public double getBalance()
    {
        return amount;
    }
    public int getAccount()
    {
        return accountNumber;
    }
}
