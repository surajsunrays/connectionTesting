
import java.io.FileOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sunrays
 */
public class OutputStreamExample {
    public static void main(String args[])
    {
        System.out.println("----------- File Output Example---------");
        try
        {
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("Success");
            
        }catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}
