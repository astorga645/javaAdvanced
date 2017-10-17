/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunes.tareas;

/**
 *
 * @author jorgearturo
 */
public class Encapsulamiento {
    
    public class Coppel{
        public String nombre;
        private int numEmpleado=0; //esta variable solo puede ser accesada dentro de la clase o los objetos que se heredan de esta clase
        public Coppel(){
            
        }
        public void asigna_nombre(String nom){
            nombre=nom;
        }
        private int genera_numero(){
            return 123;
        }
        protected int obtener_numEmpleado(){
            return numEmpleado;
        }
                
        protected int generar_numEmp(){
            if(numEmpleado==0)
               numEmpleado= genera_numero(); //tenemos el ejemplo de un encapsulamiento privado donde este metoddo solo puede ser accesado internamiente en el objeto
            return numEmpleado;
        }
        
    }
    public class Empleado extends Coppel{
        public int tePasoNumEmple(){
            /*aqui tebnemos un ejemplo de un encapsulamiento protegido el cual solo puede ser accesado desde esta clase hijo o el mismo padre*/
            System.out.println("el numero de empleado antes de generarlo es: "+obtener_numEmpleado());
            return generar_numEmp();
        }
    }
    public static void main(String args[]) {
        Encapsulamiento capsula = new Encapsulamiento();
        Encapsulamiento.Empleado empleado=capsula.new Empleado();
        //tenemos un ejemplo de encapsulamiento de un atributo publico
        empleado.nombre="arturo";
        System.out.println(empleado.nombre);
        /*este es un ejemplo de un encapsulamiento privado debido a que solicitare
        que se genere el numero de empleado*/
        System.out.println(empleado.nombre+" tu numero de empleado es: "+empleado.tePasoNumEmple());
        
    }
}
