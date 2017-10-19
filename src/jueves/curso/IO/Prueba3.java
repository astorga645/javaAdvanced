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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Prueba3 {
    public static void main(String[] args) {
        try {
            FileInputStream fin= new FileInputStream(
                    new File (".").getAbsolutePath ()+""
                            + "\\manejoArchivos\\hola.txt");
            int i=fin.read();
            System.out.println((char)i);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
