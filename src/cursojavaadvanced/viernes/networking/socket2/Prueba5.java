/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.networking.socket2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Prueba5 {
    public static void main(String[] args) {
        InetAddres ip;
        try {
            ip = InetAddress.getAllByName("www.oracle.com");
            System.out.println("Nombre del Host: "+ip.getHostName());
        System.out.println("Direccion IP: "+ip.getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Prueba5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
