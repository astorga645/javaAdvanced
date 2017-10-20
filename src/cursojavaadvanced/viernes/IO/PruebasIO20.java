/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class PruebasIO20 {
    public static void main(String[] args)throws IOException {
        CharArrayWriter out = new CharArrayWriter();
        out.write("JAVA LOCOSHON");
        FileWriter f1 = new FileWriter(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\a.txt"); 
        FileWriter f2 = new FileWriter(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\b.txt"); 
        FileWriter f3 = new FileWriter(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\c.txt"); 
        FileWriter f4 = new FileWriter(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\d.txt"); 
        
        escritura(out, f1, f2, f3, f4);
        
        Cerrado(out, f1, f2, f3, f4);
    }

    private static void Cerrado(CharArrayWriter out, FileWriter f1, FileWriter f2, FileWriter f3, FileWriter f4) throws IOException {
        out.close();
        f1.close();
        f2.close();
        f3.close();
        f4.close();
    }

    private static void escritura(CharArrayWriter out, FileWriter f1, FileWriter f2, FileWriter f3, FileWriter f4) throws IOException {
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
    }
}
