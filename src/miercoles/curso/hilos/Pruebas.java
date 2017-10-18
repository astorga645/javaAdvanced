/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Pruebas extends Thread{
    public void run(){
        for(int i=1;i<5; i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
        }
    }
    public static void main(String[] agrs){
        Pruebas t1=new Pruebas(), t2 = new Pruebas();
        t1.start();
        t2.start();
        t2.run();
        t1.run();
    }
}
