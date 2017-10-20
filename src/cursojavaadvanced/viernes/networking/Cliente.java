/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class Cliente {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",3000);
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            
            dout.writeUTF("Hola vato");
            dout.flush();
            dout.close();
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
