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
class Vehicle{
    void run(){
        System.out.println("El veiculo corriendo");
    }
}
public class Bike extends Vehicle{
  void run(){
      System.out.println("La bicicleta esta corriendo");
  }   
  public static void main(String[] agrs){
      Bike b=new Bike();
      b.run();
  }
}
