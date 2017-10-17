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
public class Estudiante {
    int id;
    String nombre;
    int edad;
    
    //default
    Estudiante(){System.err.println("Soy el Constructor");}
    
    Estudiante(int i, String n){
        id=i;
        nombre=n;
    }
    Estudiante(int i, String n, int c){
        id=i;
        nombre=n;
        edad =c;
    }
    void display(){System.out.println(id+" "+nombre+" "+edad);}
    
    public static void main(String[] args){
        Estudiante estudiante1=new Estudiante();
        Estudiante estudiante2=new Estudiante(2,"Jorge");
        Estudiante estudiante3=new Estudiante(3,"Arturo",26);
        estudiante1.display();
        estudiante2.display();
        estudiante3.display();
        new Estudiante(4,"Arturo Astorga",26).display();
    }
    
}
