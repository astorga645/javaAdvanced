/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author HP
 */
public class PruebasIO22 {
    public static void main(String[] args)throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Hola Con los rollos locos");
        pw.flush();
        pw.close();
        PrintWriter pw2=null;
        String url = new File ("").getAbsolutePath ()+""
                    + "\\manejoArchivos\\a.txt";
        File file=new File(url);
        pw2.write(file);
        pw2.write("Escribiendo loco");
        pw2.flush();
        pw2.close();
        
    }
}
