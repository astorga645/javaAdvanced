/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso;
/*
    de implementacion y mostrar solo la funcionaliddad al usuario.
Declaracion int a;
una clase abstracta con la palabra reservada abstract se considera 
abstracta de nombre.

Puede ser abstracta con metodos no abstractos.

Enviar sms solo escribe el texto y lo envia. no conocemos el proceso interno
sobre la entrega de mensajes.


forma de lograr abstraccion
1- Calse abstracta
2 interface
una clase abstracta necesita ser extendida e implementar sus metodos. 
nose puede instancias.

abstract class A{}
un metodo declarado abstracto no tiene implemtaciones abstract void print();

*/
/**
 *
 * @author HP
 */
abstract class Bike{
    abstract void run();
}
public class Abstraccion extends Bike {
    @Override
    void run(){
        System.out.println("Corriendo...");
    }
    public static void main(String[] agrs){
        Bike b = new Abstraccion();
        b.run();
    }
}
