/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso.carrera;

/**
 *
 * @author HP
 */
public class Liebre implements Runnable {
    public void run(){
        int i=0;
        System.out.println("Inicia la Liebre");
        while(i<=5){
            try{
                Thread.sleep(250);
                System.out.println("Da un paso la liebre");
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
            i++;
        }
        System.out.println("la liebre casi llega, pero parece que va a dormir");
    }
}
