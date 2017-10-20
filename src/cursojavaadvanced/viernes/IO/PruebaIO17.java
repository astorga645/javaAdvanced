/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class PruebaIO17 {
    public static void main(String[] args)throws IOException {
        FileWriter fr = new FileWriter(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\creadoJava2.txt");
        BufferedWriter bw=new BufferedWriter(fr);
        bw.write("nose que pedo, loco");
        
        bw.close();
        fr.close();
        
    }
}
