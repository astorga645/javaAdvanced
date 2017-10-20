/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.networking.socket2;

import java.net.URL;

/**
 *
 * @author HP
 */
public class Prueba {
    public static void main(String[] args) {
        try{
            URL url=new URL("http:\\www.coppel.com");
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File name: "+url.getFile());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
 
}
