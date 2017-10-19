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
public class Prueba1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout= new FileOutputStream(
                    new File (".").getAbsolutePath ()+""
                            + "\\manejoArchivos\\hola.txt");
            fout.write(65);
            fout.close();
            System.out.println("Listo...");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
