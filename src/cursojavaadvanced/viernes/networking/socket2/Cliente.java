/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.networking.socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",9000);
        
        BufferedReader br=null;
        String msg="",msg2="";
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dot = new DataOutputStream(s.getOutputStream());
        br = new BufferedReader(new InputStreamReader(System.in));
        
        while(!msg.equals("stop")){
            msg=br.readLine();
            dot.writeUTF(msg);
            dot.flush();
            msg2=din.readUTF();
            System.out.println("El servicor Dice: "+msg);
        }
        s.close();
        br.close();
        dot.close();
        din.close();
        
    }
}
