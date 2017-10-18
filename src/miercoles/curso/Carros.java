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
class Bici{
    int limiteVelocidad=150;
}
public class Carros extends Bici{
    int limiteVelocidad=10;
    public static void main(String[] agrs){
    Bici movil = new Carros();
    System.out.println("la velocidad tope es: "+movil.limiteVelocidad);
    }
}
    
