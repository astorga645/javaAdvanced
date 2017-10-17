
package martes.curso;
/*
Constructor: Artefacto utilizado para inicializar los objetos
Es un conjunto de instrucciones diseñado para inicializar uns instanca de una clase
En su declaracion o encabezado puede aceptar parametros.

Bob b = nre Bob();
Bob() <- Hace referencia al constructor por omision

Antes de su ejecucion, bob, es util; al final de la llamada "bob"
es un apuntador a un objeto(referencia) con aspacio reservado en RAM
para contener sus valores de atributos y sus aputadores a metodos.

¿Por que el constructor no es un metodo?
No se puede llamar al constructor usando el operador de interaccion, carece
de un valor de retorno distinto a un apuntador 
no puede ser redefinido()
no puede ser declarado con un type
*/
/**
 *
 * @author HP
 */
public class Bob {
    Bob(){
        System.err.println("Soy Bob el Herrero loco");
    }
}
