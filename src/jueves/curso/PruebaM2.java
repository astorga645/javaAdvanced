/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso;

/**
 *
 * @author HP
 */
public class PruebaM2 implements Runnable{
    public void run(){
        System.out.println("Tarea 1");
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new PruebaM2()),t2=new Thread(new PruebaM2());
        t1.start();
        t2.start();
    }
}
