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
public class Carrera {
    public static void main(String[] agrs){
        Tortuga tortuga = new Tortuga();
        //Liebre liebre = new Liebre();
        //Thread Liebre = new Thread(liebre);
        Thread liebre = new Thread(new Liebre());
        tortuga.start();
        liebre.start();
    }
    
}
