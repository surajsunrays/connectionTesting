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
public class LimitException extends Exception{
    int amt;

    public LimitException(int amt) {
        this.amt = amt;
        System.out.println("limit exception occured");
    }
    
}
