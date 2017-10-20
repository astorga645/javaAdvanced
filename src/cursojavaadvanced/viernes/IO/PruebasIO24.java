/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author HP
 */
public class PruebasIO24 implements Serializable {
    int id;
    String nameClass;
    public PruebasIO24(int id,String nameClass){
        this.id=id;
        this.nameClass=nameClass;
    }
    
}
class Prueba{
    public static void main(String[] args) throws IOException{
        PruebasIO24 pr=new PruebasIO24(24,"PruebasIO24");
        String url=new File ("").getAbsolutePath ()+""
                    + "\\manejoArchivos\\c.txt";
        System.out.println(url);
        FileOutputStream fout=new FileOutputStream(url);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(pr);
        out.flush();
        System.out.println("Listo");
        
        
        
    }
}
