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
class Mesa extends Thread {

    void mostrarMesa(int i) {
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

class MyT extends Thread {

    Mesa m;

    MyT(Mesa mMesa) {
        this.m = mMesa;
    }

    public void run() {
        m.mostrarMesa(5);
    }
}

class MyT2 extends Thread {

    Mesa m;

    MyT2(Mesa mMesa) {
        this.m = mMesa;
    }

    public void run() {
        m.mostrarMesa(8);
    }
}

public class Prueba6 {

    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        MyT t1 = new MyT(mesa);
        MyT2 t2 = new MyT2(mesa);

        t1.start();
        t2.start();
    }
}
