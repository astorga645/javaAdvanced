/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.IO;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class PruebaIO19 {
    public static void main(String[] args)throws IOException {
        char[]array = {'H','O','L','A',' ','M','U','N','D','O'};
        CharArrayReader reader=new CharArrayReader(array);
        
        int i=0;
        while((i=reader.read())!=-1){
            char c= (char)i;
            System.out.print(c+" : ");
            System.out.println(i);
        }
        
    }
}
