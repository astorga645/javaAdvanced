/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class PruebaIO15 {
    public static void main(String[] args) throws IOException{
        /*aparentemenete hacen lo mismo el FileOutputStream se escribe en un archivo
        pero este si el archivo no existe lo crea, y el FIleWriter no crea archivos solo
        escribe en uno existente*/
        FileWriter fw = new FileWriter(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\creadoJava2.txt");
        fw.write("Hola Java");
        fw.close();
        System.out.println("Listo vato");
        
    }
}
