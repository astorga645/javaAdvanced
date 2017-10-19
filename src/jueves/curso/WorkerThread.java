/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class WorkerThread implements Runnable{
    private String msg;
    public WorkerThread(String s){
        this.msg=s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"(Start) mensaje: "+msg);
        System.out.println(Thread.currentThread().getName()+"(END)");
    }
    private void procesoMsg(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
        
    }
}
