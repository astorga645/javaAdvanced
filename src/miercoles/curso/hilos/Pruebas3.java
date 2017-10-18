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
public class Pruebas3 extends Thread{
    public void run(){
        System.out.println("Corriendo");
    }
    public static void main(String[] agrs){
        Pruebas3 t1 = new Pruebas3();
        Pruebas3 t2 = new Pruebas3();
        
        System.out.println("Nombre T1: "+t1.getName());
        System.out.println("Nombre T2: "+t2.getName());
        
        System.out.println("Id T1: "+t1.getId());
        System.out.println("Id T2: "+t2.getId());
        
        System.out.println("Prioridad T1: "+t1.getPriority());
        System.out.println("Prioridad T2: "+t2.getPriority());
        
        System.out.println("State T1: "+t1.getPriority());
        System.out.println("State T2: "+t2.getPriority());
        
        System.out.println("Datos T1: "+t1.toString());
        System.out.println("Datos T2: "+t2.toString());
        
        t1.start();
        t2.start();
        
    }
}