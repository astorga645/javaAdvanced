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
public class Herencia {
    /*ejemplo de interfaz*/
    public interface InterJugadores{
            public void numJugadores();
        
    }
    public class JuegosMesa implements InterJugadores{
        public int numJugadores;
        
        public void numJugadores(){
            numJugadores=2;
        }
    }
    public class Juego{
        public String nombre;
                
    }
    public class Ajedrez extends Juego{
        public int jugadores;
        public boolean blancas=false;
        /*El ajedrez tiene jugadores herencia de agregacion*/
        public Jugador jugador[];
    }
    public class Jugador{
        public String jugador="Arturo";
        
    }
    public class Tablero extends Ajedrez{
        public int tamaño;
        public String estilo;
        public int pzJugador=16;
    }
    /*la clase piezas usa las propiedades de otras clases*/
    public class Piezas extends Tablero implements InterJugadores{
        public String nombrePz;
        public int valor;
        public int numJugadores;
        public void numJugadores(){
            numJugadores=2;
        }
        public String datos(){
            return "El juego se llama "+super.nombre+" es de tamaño: "+tamaño;
            
        }
        
    }
    
    
}
