/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream(
                new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\juntos.txt");
        FileOutputStream fout2 = new FileOutputStream(
                new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\juntos.txt");
        
        ByteArrayOutputStream bout= new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout);
        bout.writeTo(fout2);
        bout.close();
        fout.close();
        fout2.close();
    }
}
