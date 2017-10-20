/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author HP
 */
public class PruebasIO21 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout=new FileOutputStream(new File ("").getAbsolutePath ()+""
                    + "\\manejoArchivos\\a.txt");
        PrintStream ps = new PrintStream(fout);
        
        ps.println("que show");
        ps.println("hee");
        ps.println("no");
        ps.close();
        fout.close();
        System.out.println("Listo...");
        
        
    }
 
}
