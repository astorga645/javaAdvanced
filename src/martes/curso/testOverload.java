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
class Add{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class testOverload {
    public static void main(String[] agrs){
        System.out.println("Suma: "+Add.add(10, 5)+"\nSuma2: "+Add.add(10,26,3));
    }
}
