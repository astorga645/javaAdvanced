/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.casa;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author jorgearturo
 */
public class Servidor {
    ServerSocket server;
    Socket socket;
    int puerto=9001;
    String ip="127.0.0.1";
    PrintStream salida;
    BufferedReader entrada,teclado;
    
    public void iniciar(){
        try{
            server = new ServerSocket(puerto);
            //socket = new Socket(ip,puerto);
            socket = new Socket();
            socket = server.accept();
            entrada =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            teclado=new BufferedReader(new InputStreamReader(System.in));
            String tec=teclado.readLine();
            salida = new PrintStream(socket.getOutputStream());
            salida.println(tec);
            String mensaje = entrada.readLine();
            System.out.println(mensaje);
            
            socket.close();
            entrada.close();
            teclado.close();
            salida.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
