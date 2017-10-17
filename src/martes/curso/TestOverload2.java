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
//sobrecargar un metodo
class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}
public class TestOverload2 {
    public static void main(String[] agrs){
        System.out.println("Suma: "+Adder.add(10, 5)+"\nSuma2: "+Adder.add(10.9,26.5));
    }
}
