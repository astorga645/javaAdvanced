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
public class Pruebas5 extends Thread{
    public void run(){
        System.out.println("Corriendo un hilo llamado"
        +Thread.currentThread().getName());
        
        System.out.println("Corriendo un hilo con prioridad"
            +Thread.currentThread().getPriority());
    }
    public static void main(String[] agrs){
        Pruebas5 p1=new Pruebas5();
        p1.start();
    }
}
