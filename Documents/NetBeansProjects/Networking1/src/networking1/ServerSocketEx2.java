/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking1;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Sunrays
 */
public class ServerSocketEx2 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server");
            dos.flush();
            dos.close();
            s.close();
        } catch (Exception e) {
        }
    }
}
