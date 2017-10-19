/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author HP
 */
public class Prueba {
    public static void main(String[] args) {
        //se crea un servicio de hilos con la cantidad de hilos que se necesitan
        ExecutorService executor=Executors.newFixedThreadPool(5); 
        for (int i = 0; i < 10; i++) {
            Runnable worker=new WorkerThread(""+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){}
        System.out.println("Todos los hilos muertos");
    }
}
