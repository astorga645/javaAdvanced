/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.io.Console;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba12 {
    public static void main(String[] args) throws IOException{
        Console c=System.console();
        System.out.println("");
        String n=null;
        n = c.readLine();
        System.out.println("Bienvenidos: "+n);
    }
public static String readLine(){
  String answer="";
  Console console=null;
  try{
    console=System.console();
  }catch(Exception ex){}
 
  if(console!=null){
    try{
      answer=console.readLine();
    }catch(Exception ex){}
  }
  return answer;
}
}
