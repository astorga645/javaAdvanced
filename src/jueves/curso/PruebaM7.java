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
class Mesa2 extends Thread {

    synchronized void mostrarMesa(int i) {
        for (int j = 1; j < 6; j++) {
            System.out.println(j * i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());
            }
        }
    }

    public void run() {
        mostrarMesa(5);
    }
}

public class PruebaM7 {

    public static void main(String[] args) {
        final Mesa2 mesa = new Mesa2();
        Thread t1=new Thread(){
          public void run(){
              mesa.mostrarMesa(5);
          }  
        };
        Thread t2=new Thread(){
          public void run(){
              mesa.mostrarMesa(100);
          }  
        };
        t1.start();
        t2.start();
    }
}
