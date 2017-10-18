/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class Prueba4 {
    public static void main(String[] agrs) throws IOException{
      try{
        try{
            System.out.println("Division");
            int b=39/0;
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        try{
            int a[]=new int[5];
            a[5]=3;
        }catch(ArrayIndexOutOfBoundsException aioe){
            System.out.println(aioe);
        }
      }catch(Exception e){
          System.out.println(e);
      }
      finally{
          System.out.println("Genera el bloque de final");
      }
      System.out.println("Termina todo el rollo");
    }
}
