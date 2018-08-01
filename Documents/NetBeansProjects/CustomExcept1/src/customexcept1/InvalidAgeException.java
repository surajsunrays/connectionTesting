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
public class InvalidAgeException extends Exception{

    public InvalidAgeException(String s) {
        super(s);
    }
    
}
