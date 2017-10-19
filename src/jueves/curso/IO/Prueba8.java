/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author HP
 */
public class Prueba8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\hola.txt");
        FileInputStream fis2 = new FileInputStream(
                new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\hola2.txt");
        
        FileOutputStream fos = new FileOutputStream(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\juntos.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis,fis2);
        int i;

        while ((i= sis.read())!=-1){
            fos.write(i);
        }
        close(fis, fis2, fos, sis);
        System.out.println("Listo...");
    }
    private static void close(FileInputStream fis1, FileInputStream fis2, FileOutputStream fos, SequenceInputStream sis) throws IOException {
        sis.close();
        fos.close();
        fis1.close();
        fis2.close();
    }
}
