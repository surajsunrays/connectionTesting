/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringnstringbuffdiff;

/**
 *
 * @author Sunrays
 */
public class StringNStringBuffDiff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1 = new String("Sunrays");
        String s2 = new String("Sunrays");
        //Checking ==
        System.out.println(s1 == s2);
        //checking .equals()
        System.out.println(s1.equals(s2));
        
    }
    
}
