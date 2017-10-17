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
public class Estudiante2 {
    int matricula;
    String nombre, msg="";
    static String escuela="ITCuliacan";
    
    static void cambio(){
        escuela="Instituto Tecnologico de Mexico";
    }
    Estudiante2(){
        
    }
    Estudiante2(int i, String n){
        matricula=i;
        nombre=n;
    }
    void display(){
        msg +="Matricula: "+matricula;
        msg +="\nNombre: "+nombre;
        msg += "\nEscuela: "+escuela+"\n";
        System.out.println(msg);
    }
    public static void main(String[] agrs){
        //Estudiante2.cambio();
        
        Estudiante2 e1=new Estudiante2(123,"Arturo");
        Estudiante2 e2=new Estudiante2(124,"Jorge");
        e1.display();
        e2.display();
        Estudiante2.cambio();
        System.out.println("-------------------------------------------------");
        e1.display();
        e2.display();
        Estudiante2 e3=new Estudiante2(125,"Roxana");
        Estudiante2 e4=new Estudiante2(126,"Karely");
        e3.display();
        e4.display();
    }
}
