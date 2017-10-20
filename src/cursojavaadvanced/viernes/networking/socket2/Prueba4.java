/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.networking.socket2;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author HP
 */
public class Prueba4 {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.codigofacilito.com");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            for(int i=0;i<=8;i++){
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
