/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author HP
 */
public class Prueba10 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream(
        new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\creadoJava.txt");
        DataOutputStream data=new DataOutputStream(fos);
        /*
        while ((i= data.read())!=-1){
            fos.write(i);
        }
        */
    }
}
