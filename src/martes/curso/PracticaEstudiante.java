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
/*
1-
2-metodo
3- bloque
4- clases anidadas

*/

public class PracticaEstudiante {
  int matricula;
  String nombre;
  String msg;
  int contador =0;
  static int contadorEstatico = 0;
  static String escuela="Instituto Tecnologico de Culiacan";
  
  PracticaEstudiante(int matricula, String nombre){
      this.matricula=matricula;
      this.nombre=nombre;
      contador++;
      contadorEstatico++;
      System.out.println("Contador Estatico: "+contadorEstatico+" Contador: "+contador);
  }
  void display(){
      msg="Matricula: "+matricula;
      msg +="\nNombre: "+nombre;
      msg +="\nEscuela: "+escuela;
      System.out.println(msg);
  }
  public static void main(String[] args){
      PracticaEstudiante e1=new PracticaEstudiante(123,"Arturo Astorga");
      PracticaEstudiante e2=new PracticaEstudiante(124,"Jorge Martinez");
      
      e1.display();
      e2.display();
  }
}
