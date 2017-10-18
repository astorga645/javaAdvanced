/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso.interfaces;

/**
 *
 * @author HP
 */
public class Printable implements print{
    public void print(){
        
        System.out.println("Hola loco");
    }
    public static void main(String[] agrs){
        Printable p = new Printable();
        p.print();
    }
}
