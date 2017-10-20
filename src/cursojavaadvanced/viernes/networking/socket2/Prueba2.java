/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.networking.socket2;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author HP
 */
public class Prueba2 {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.codigofacilito.com");
            URLConnection urlcon = url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            
            while((i=stream.read())!=-1){
                System.out.print((char)i);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
