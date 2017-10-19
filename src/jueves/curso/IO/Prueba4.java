/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba4 {
    public static void main(String[] args) {
        try {
            FileInputStream fin= new FileInputStream(
                    new File (".").getAbsolutePath ()+""
                            + "\\manejoArchivos\\hola.txt");
            int i=0;
            while((i=fin.read())!=-1){
                
                System.out.println((char)i);
            }
            fin.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
