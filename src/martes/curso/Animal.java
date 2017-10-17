/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Herencia Simple
package martes.curso;

/**
 *
 * @author HP
 */
public class Animal {
    void eat(){
        System.out.println("Comiendo...");
    }
}
    class Perro extends Animal{
        void ladrar(){
            System.out.println("Ladrando...");
        }
    }
    class Cachorro extends Perro{
        void correr(){
            System.out.println("Corriendo el cachorro...");
        }
    }
    class PruebaHerencia{
        public static void main(String[] agrs){
            System.out.println("Un perro: ");
            Perro p=new Perro();
            p.eat();
            p.ladrar();
            System.out.println("Un chachorro aprende ha: ");
            Cachorro cachorro = new Cachorro();
            cachorro.eat();
            cachorro.ladrar();
            cachorro.correr();
        }
    }

