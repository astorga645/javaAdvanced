/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso.hilos;

/**
 *
 * @author HP
 */
public class MultiHilos2 implements Runnable{
    public void run(){
        System.out.println("Corriendo");
    }
    public static void main(String[] agrs){
        MultiHilos2 hilo = new MultiHilos2();
        Thread t2 = new Thread(hilo);
        t2.start();
        
    }
}
