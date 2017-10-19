/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba6 {
    public static void main(String[] args) {
        try {
            FileInputStream fin= new FileInputStream(
                    new File (".").getAbsolutePath ()+""
                            + "\\manejoArchivos\\hola.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.println((char)i);
            }
            bin.close();
            fin.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
