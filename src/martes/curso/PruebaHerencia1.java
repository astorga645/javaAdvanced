/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes.curso;

/**
 *
 * @author HP
 */

    class Animal2 {
        void eat(){
         System.out.println("Comiendo...");
        }
    }
    class Perro2 extends Animal{
        void ladrar(){
            System.out.println("Ladrando...");
        }
    }
    class Gato extends Animal{
        void maullar(){
            System.out.println("Maullando...");
        }
    }
public class PruebaHerencia1 {
    public static void main(String[] agrs){
        Gato g = new Gato();
        g.maullar();
        g.eat();
    }
}
