/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream(
                    new File (".").getAbsolutePath ()+""
                            + "\\manejoArchivos\\hola.txt");
            String s="Que rollo vato";
            byte b[]=s.getBytes();
            System.out.println("Listo");
            fout.write(b);
            fout.close();
        }catch(IOException e){
            System.out.println(e.getMessage()); 
        }
    }
}
