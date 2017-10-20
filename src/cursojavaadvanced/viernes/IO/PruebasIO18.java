/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class PruebasIO18 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        
        FileWriter fr = new FileWriter(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\creadoJava2.txt");
        BufferedWriter bw=new BufferedWriter(fr);
        
        
        
        String cadena="";
        while(!cadena.equals("Stop")){
            System.out.print("Cadena: ");
            cadena=br.readLine();
            
            bw.write(cadena);
            //System.out.println("Cadena: "+cadena);
            
        }
        br.close();
        in.close();
        bw.close();
        fr.close();
        
    }
 
}
