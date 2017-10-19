/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout= new FileOutputStream(
                    new File (".").getAbsolutePath ()+""
                            + "\\manejoArchivos\\hola.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="Hola loco";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Listo");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
