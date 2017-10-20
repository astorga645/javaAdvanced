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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9000);
        Socket s=ss.accept();
        String msg="",msg2="";
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dot = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(!msg.equals("stop")){
            msg = din.readUTF();
            System.out.println("El cliente dice: "+msg);
            msg2= br.readLine();
            dot.writeUTF(msg2);
            dot.flush();
        }
        CERRAR(din, dot, s, ss);
            
        
    }

    private static void CERRAR(DataInputStream din, DataOutputStream dot, Socket s, ServerSocket ss) throws IOException {
        din.close();
        dot.close();
        s.close();
        ss.close();
    }
}
