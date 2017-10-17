/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunes.tareas;

import java.util.ArrayList;

/**
 *
 * @author jorgearturo
 */

public class Abstraccion {
    public abstract class JuegosMesa{
        private String nombre;
        void JuegosMesa(){
            
        }
        void setNombre(String nom){
            nombre = nom;
        }
        public abstract String reglas();
        String getNombrePadre(){
            return nombre;
        }
    }
    public class Domino extends JuegosMesa{
        public String reglas(){
            String cadena;
            cadena = "dhsafhdlshkls";
            
           return cadena.substring(2, 8); 
        }
    }
    public class Ajedrez extends JuegosMesa{
        public String nombre;
        void Ajedrez(){
            
        }
        /*Esto se me ocurre con abstraccion funcional*/
        public String reglas(){
            
            return "Todo al 100";
        }
        public void set_nombrePadre(){
            setNombre("El juego "+nombre);
        }
        public String getNombres(){
            return "Clase Padre: "+getNombrePadre()+" y en la clase hijo: "+nombre;
        }
    }
    public static void main(String args[]) {
        Abstraccion abs = new Abstraccion();
        Abstraccion.Ajedrez juego=abs.new Ajedrez();
        juego.nombre="Ajedre";
        juego.set_nombrePadre();
        /*no habia manejado este concepto con algo como abstraccion de datos-tipo de acceso modificador
        lo unico que se me ocurre es esto, el nombre es abstracto ya que para la clase padre e hijo tiene nombre diferente
        que se almacena en una variable con el mismo nombre pero con modificador diferente*/
        System.out.println(juego.getNombres());
        
        /*no se me ocurre algo mas, no tengo mucho conocimiento teorico al respecto
        de igual manera existe la incertdumbre si lo que se es correcto, generado por un conomcimiento pobre en el tema*/
        
        
    }
}
