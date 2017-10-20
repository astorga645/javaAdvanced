/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.casa;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class Servidor2 {
    ServerSocket server;
    Socket socket;
    int puerto=9001;
    DataOutputStream salida;
    BufferedReader entrada;
    
    public void iniciar(){
        try{
            server = new ServerSocket(puerto);
            //socket = new Socket(ip,puerto);
            socket = new Socket();
            socket = server.accept();
            entrada =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            //teclado=new BufferedReader(new InputStreamReader(System.in));
            String tec=entrada.readLine();
            System.out.println(tec);
            salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF(tec);
            socket.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}