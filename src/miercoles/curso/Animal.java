/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso;

/**
 *
 * @author HP
 */
public class Animal {
    void eat(){
        System.out.println("comiendo...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Comiendo Croquetas...");
    }
}
class BabyDog extends Animal{
    void eat(){
        System.out.println("Comiendo Lechita...");
    }
    public static void main(String[] agrs){
        Animal a1, a2, a3;
        a1= new Animal();
        a2= new Dog();
        a3= new BabyDog();
        
        a1.eat();
        a2.eat();
        a3.eat();
    }
}
