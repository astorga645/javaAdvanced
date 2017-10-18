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
public class MultiHilos extends Thread{
    public void run(){
        System.out.println("Corriendo");
    }
    public static void main(String[] agrs){
        MultiHilos t1 = new MultiHilos();
        MultiHilos t2 = new MultiHilos();
        
        t1.start();
        t1.setName("Arturillo");
        
        t1.setPriority(MAX_PRIORITY);
        t1.run();

        System.out.println("Datos del hilo 1\nnombre: "+t1.getName()+" Prioridad:"
                + " "+t1.getPriority()+" Identificador: "+t1.getId());
        t1.interrupt();
        t2.start();
        t2.run();
        System.out.println("Estado del hilo 2\n"+t2.getState()+"\n"
                + "Estado del hilo 1: "+t1.getState());
    }
}
