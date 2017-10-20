/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/**
 *
 * @author HP
 */
public class PruebasIO23 {
    public static void main(String[] args) throws IOException {
        char[] a=new char[512];
        StringWriter w =new StringWriter();
        FileInputStream in =null;
        BufferedReader br=null;
        String url=new File ("").getAbsolutePath ()+""
                    + "\\manejoArchivos\\c.txt";
        System.out.println("URL: "+url);
        in = new FileInputStream(url);
        br= new BufferedReader(new InputStreamReader(in,"UTF-8"));
        
        int i=0;
        while((i=br.read())!=-1){
            w.write(a,0,1);
           
        }
        System.out.println(w.toString());
        w.close();
        br.close();
        in.close();
    }
}
