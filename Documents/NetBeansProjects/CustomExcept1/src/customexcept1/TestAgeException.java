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
public class TestAgeException {

    static void validate(int age) throws InvalidAgeException
    {
        if(age < 18)
        {
            throw new InvalidAgeException("Not Valid");
        }
        else
        {
            System.out.println("Welcome to Vote");
        }
    }
    public static void main(String[] args) {
        try
        {
            validate(15);
            
        }catch(Exception e)
        {
            System.out.println("Exception Occured :"+e);
        }
    }
}
