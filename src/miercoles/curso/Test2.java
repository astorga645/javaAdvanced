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
abstract class Bicicleta{
    Bicicleta(){
        System.out.println("Se ha creado una Bibicleta");
    }
    abstract void run();
    void cambiarColor(){
        System.out.println("Color Cambiado..");
    }
}
class Honda extends Bicicleta{
    void run(){
        System.out.println("Se esta Corriendo..");
    }
}
public class Test2 {
    public static void main(String[] agrs){
        Bicicleta bici = new Honda();
        bici.run();
        bici.cambiarColor();
    }
}
