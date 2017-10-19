/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba11 {
    public static void main(String[] args)throws IOException {
        FileInputStream in = new FileInputStream(
        new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\hola.txt");
        DataInputStream din=new DataInputStream(in);
        
        int c=in.available();
        byte []array=new byte[c];
        in.read(array);
        System.out.println("--------------------------------------------------");
        for(byte n:array){
            char l=(char)n;
            System.out.print(l+"*");
        }
        
        System.out.println("\n------------------------------------------------");
        in.close();
        din.close();
        
    }
}
