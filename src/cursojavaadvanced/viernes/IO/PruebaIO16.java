/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class PruebaIO16 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\creadoJava2.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.println("valor: "+(char)i);
            
        }
        fr.close();
    }
}
