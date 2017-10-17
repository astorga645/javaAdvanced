/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunes.tareas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jorgearturo
 */
public class Polimorfismo {
    public class PoliGenerico{
        private String pieza;
        public PoliGenerico(){
           
        }
        public void asignar_pieza(String pz){
            pieza = pz;
        }
        public String obtener_pieza(){
            return pieza;
        }
        public void movimiento(int vertical){
            System.out.println("La pieza: "+pieza+" se mueve "+vertical+" celdas verticalmente");
        }
        public void movimiento(int vertical,int horizontal){
            System.out.println("La pieza: "+pieza+" se mueve "+vertical+" celdas verticalmente y "+horizontal+" celdas horizontalmente.");
        }
        
    }
    public class PoliPrimitivo extends PoliGenerico{
        @Override
        public void movimiento(int vertical){
            System.out.println("Para este objeto se sobre escribio el metodo Movimiento, la pieza: "+super.pieza+" se mueve "+vertical+" celdas verticalmente");
        }
    }
    public static void main(String args[]) {
        Polimorfismo polimorfismo = new Polimorfismo();
        Polimorfismo.PoliGenerico caballo= polimorfismo.new PoliGenerico();
        Polimorfismo.PoliGenerico alfil= polimorfismo.new PoliGenerico();
        /*este ejemplo es poliorfirmo real ya que se esta realizando sobrecarga*/
        caballo.asignar_pieza("caballo");
        alfil.asignar_pieza("alfil");
        caballo.movimiento(3,-1);
        alfil.movimiento(2);
        caballo.movimiento(-3,1);
        alfil.movimiento(1);
        caballo.movimiento(-3,-1);
        alfil.movimiento(1);
        /*ahora se realizara un poliformismo generico*/
        ArrayList<Polimorfismo.PoliGenerico> ajedrez =new ArrayList();
        ajedrez.add(alfil);
        ajedrez.add(caballo);
        System.out.println(ajedrez.get(0).obtener_pieza());
        System.out.println(ajedrez.get(1).obtener_pieza());
        
        Iterator<Polimorfismo.PoliGenerico> nombreIterator = ajedrez.iterator();
        while(nombreIterator.hasNext()){
                System.out.println("Pieza: "+nombreIterator.next().obtener_pieza());
        }
        
        /*
        Se realiza el la sobre escritura del metodo movimiento del padre en el hijo, con lo que 
        se realiza el poliformismo primitivo
        */
        Polimorfismo.PoliPrimitivo poliPrimitivo = polimorfismo.new PoliPrimitivo();
        poliPrimitivo.asignar_pieza("Torre");
        poliPrimitivo.movimiento(6);
        
        
    }
}
