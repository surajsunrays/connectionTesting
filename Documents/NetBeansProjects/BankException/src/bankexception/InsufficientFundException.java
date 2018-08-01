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
public class InsufficientFundException extends Exception {
    int accNo;
    double amount;

    public InsufficientFundException(int accNo, double amount) {
        this.accNo = accNo;
        this.amount = amount;
    }
    public double amount()
    {
        return amount;
    }
    
}
