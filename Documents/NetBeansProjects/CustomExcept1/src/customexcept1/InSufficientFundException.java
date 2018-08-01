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
public class InSufficientFundException extends Exception{

    private double amount;
    public InSufficientFundException(double amount) {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
    
}
