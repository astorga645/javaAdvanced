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
public class Pruebas4 extends Thread{
    public void run(){
        System.out.println("Corriendo...");
    }
    public static void main(String[] agrs){
        Pruebas4 p1 = new Pruebas4();
        Pruebas4 p2 = new Pruebas4();
        
        System.out.println("Nombre P1: "+p1.getName());
        System.out.println("Nombre P2: "+p2.getName());
        
        p1.start();
        p2.start();
        
        p1.setName("Primer Hilo");
        p2.setName("Segundo Hilo");
        System.out.println("Despues del Cambio ");
        
        System.out.println("Nombre P1: "+p1.getName());
        System.out.println("Nombre P2: "+p2.getName());
        
        System.out.println("");
    }
}
