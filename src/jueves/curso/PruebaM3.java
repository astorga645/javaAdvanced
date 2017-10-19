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
class Simple extends Thread{
    public void run(){
        System.out.println("Tarea uno");
    }
}
class Simple2 extends Thread{
    public void run(){
        System.out.println("Tarea tres");
    }
}
public class PruebaM3 {
    public static void main(String[] args) {
        Simple s = new Simple();
        Simple2 s2 = new Simple2();
        s.start();
        s2.start();
        
    }
}
