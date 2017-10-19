/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Prueba7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin,fin2;
        try {
            fin = new FileInputStream(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\hola.txt");
            fin2 = new FileInputStream(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\hola2.txt");
            SequenceInputStream sis = new SequenceInputStream(fin,fin2);
            int j;
            while((j=sis.read())!=-1){
                System.out.println((char)j);
            }
            sis.close();
            fin.close();
            fin2.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
