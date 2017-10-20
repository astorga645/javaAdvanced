/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author HP
 */
public class PruebasIO25 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String url=new File ("").getAbsolutePath ()+""
                    + "\\manejoArchivos\\c.txt";
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(url));
        PruebasIO24 t = (PruebasIO24)in.readObject();
        System.out.println("Respuesta: "+t.id+" - "+t.nameClass);
    }
}
