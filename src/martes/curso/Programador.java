/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes.curso;
/*
Herencia: Es un mecanismo que permite que un objeto cualquiera

la idea de la herencia es que puedas

existen diversas clasificaciones de relacion en la herenca:
relaciones entre clases: Asociacion, Composicion, Agregacion y Herencia.

Hay un termino que permite distinguir los distintos tipos de relaciones, llamado
acoplamiento.

*- Medida de dependencia que hay entre dos modulos, existen grados de
acoplamiento(bajo/alto).

*- cada clase y emtodo hace una sola cosa y la hace bien(cohesion), numero
de tareas que tiene cada clase o metodo.
es deseable que 2 o mas modulos de un programa mantenga alta cohesion y
bajo acoplamiento.

relacione entre clases:
    Asociacion(Es un): cuando entre 2 o mas clases se da una interrelacion
que no modifica en nada el comportamiento de los objetos 
antes o despues de terminada la relacion.
la asociacion es un modo de interrelacion ewntre objetos donde uno utiliza los
servicios de otro a corto plazo.

la asosiacion es una relacion de objetos debilmente acoplados.

Agregacion(Tiene Un): Es una relacion entre objetos que afectan el 
comportamiento entre ellos, mientras que dura la relacion. es decir, un objeto
depende de los servicioss de otro a largo plazo.

composicion(contiene un): Cuando un objeto complejo usa otros objetos cuya
escencia tiene setido solo cuando ellos estan acoplados.

por ulyimo podemos decir que la composicion es un tipo de agregacopm a muy 
largo plazo.

Herencia: Cuando un objeto tiene las caracteristicas de otro permanentemente,
tendremos una relacion entre objetos intimamente acp´ñadps cuya existencia
depende de un ancestro padre.

*/
/**
 *
 * @author HP
 */
class Empleado{
    float salario=40000;
}

public class Programador extends Empleado{
    int bono=10000;
    public void mostrar(){
        System.out.println("Salario: "+salario+" bono: "+bono);
    }
    public static void main(String[] agrs){
        Programador progra=new Programador();
        progra.mostrar();
    }
}
