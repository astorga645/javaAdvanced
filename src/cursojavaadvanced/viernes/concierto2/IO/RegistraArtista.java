/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto2.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import martes.curso.Artista;

/**
 *
 * @author HP
 */
public class RegistraArtista {
    static String artistas="";
    public String registra(String URL){
      try {
            FileInputStream fin= new FileInputStream(URL);
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                artistas += (char)i;
            }
            bin.close();
            fin.close();
        } catch (IOException ex) {
            System.out.println(ex);
            return "";
        }
        return artistas;
      
    }
}
