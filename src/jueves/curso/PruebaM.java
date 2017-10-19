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
public class PruebaM extends Thread{
    public void run(){
        System.out.println("Una sola tarea");
        
    }
    public static void main(String[] args) {
        PruebaM p1=new PruebaM(),p2=new PruebaM(),p3=new PruebaM();
        p1.start();
        p2.start();
        p3.start();
    }
}
