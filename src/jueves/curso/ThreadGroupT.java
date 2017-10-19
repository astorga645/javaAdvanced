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
public class ThreadGroupT implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] agrs){
        ThreadGroupT runnable=new ThreadGroupT();
        ThreadGroup tg1=new ThreadGroup("Grupo Padre");
        
        Thread t1=new Thread(tg1,runnable,"uno");
        t1.start();
        Thread t2=new Thread(tg1,runnable,"dos");
        t2.start();
        Thread t3=new Thread(tg1,runnable,"tres");
        t3.start();
        Thread t4=new Thread(tg1,runnable,"cuatro");
        t4.start();
        
        System.out.println("Thread Group Name: "+tg1.getName());
        tg1.list();
        
    }
}
