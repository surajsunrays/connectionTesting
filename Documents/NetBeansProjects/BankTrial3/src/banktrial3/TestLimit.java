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
public class TestLimit {
    public static void main(String[] args)throws LimitException {
        int i =  100;
        if(i < 200)
        {
            throw new LimitException(i);
        }
        else
        {
            System.out.println("Nthing");
        }
    }
}
