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
public class PruebaDemonio extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Es demonio");
        }else{
            System.out.println("No es demonio");
        }
    }
    public static void main(String[] agrs){
        PruebaDemonio p1=new PruebaDemonio();
        p1.setDaemon(true);
        PruebaDemonio p2=new PruebaDemonio();
        
        p1.start();
        p2.start();
        p2.setDaemon(true);
        p2.start();        
    }
}
