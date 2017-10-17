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

public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=3;
        String hola="Hola Coppel";
        int marca=65, numero=20;
        
        System.out.println("Hola");
        System.out.println(hola);
        System.out.println(a);
        
        //if stament
        int edad=23;
        if(edad>18)
            System.out.println("Tu edad es mayor a 18");
        if(edad>21){
            System.out.println(edad);
        }else
            System.out.println("Eres aun Joven");
        
        if(marca<50){
            System.out.println("Error");
        }else if (marca>=50 && marca<60){
            System.out.println("Grado D");
        }else if(marca>=60 && marca<70){
            System.out.println("Grado C");
        }else if(marca>=70 && marca <80){
            System.out.println("Grado B");
        }else if (marca >=80 && marca <90){
            System.out.println("Grado A");
        }else if (marca >=90 &&marca <100){
            System.out.println("Grado A+");
        }else System.out.println("Invalido");
        
        /**/
        switch(numero){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("no es ni 10,20,30");
        }
        //lazoz bucle for
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        //forech
        int arreglo[]={1,22,33,44,55};
        for(int loQueSea:arreglo){
            System.out.println("loQuesEa");
        }
        //while
        //Mientras la condición se cumpla has lo que tengas que hacer e incrementa 1
        int b=1;
        while (b<=10){
            System.out.println(b);
            b++;
        }
        
        //Do while
        //primero lo hace, luego evalua si debe de hacerlo.
        int n=1;
        do{
            System.out.println("Hago algo");
            n++;
        }while(n<=10);

    }
    
}