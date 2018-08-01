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
public class InsufficientAmountException extends Exception{
    double amount;

    public InsufficientAmountException(double amount) {
        this.amount = amount;
        System.out.println("Balance not sufficient to withdraw");
    }
    
}
