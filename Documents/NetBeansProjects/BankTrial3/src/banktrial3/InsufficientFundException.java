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
public class InsufficientFundException extends Exception{
    double amount;

    public InsufficientFundException(double amount) {
        this.amount = amount;
    }
    
}
