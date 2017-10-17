/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunes.tareas;

import java.util.Random;

/**
 *
 * @author jorgearturo
 */
public class Modularidad {
    public class Zangano{
        private String nombre;
        public void comer(){
            System.out.println("El zangano: "+this.nombre+" termino de comer de manera satisfactoria.");
        }
        public void fecundar(){
            System.out.println("El zangano: "+this.nombre+" termino de fecundar a la reina de manra satisfactoria.");
        }
        public void morir(){
            System.out.println("El zangano: "+this.nombre+" ya fecundo ahora debe de morir si o si.");
        }
        public void localizarReina(){
            System.out.println("El zangano: "+nombre+" sigue a la reyna..");
        }
        public Zangano(){
            this.nombre="flojo";
        }
       
    }
    public class Reyna{
        private String nombre;
        public boolean buscaFecundador(){
            return ((int)(new Random().nextDouble() * 6 + 1)>4)?true:false;
        }
        public void seOcupaNuevoHogar(int opcion){
            Random rnd=new Random();
            if((int)(rnd.nextDouble() * 6 + 1)==5 || opcion==1)
                System.out.println("La reyna: "+nombre+" buscara nuevo lugar para vivir.");
            else
                System.out.println("La reyna: "+nombre+" esta criando.");
        }
        public void creaHuevecillos(){
            System.out.println("La reyna: "+nombre+" ya fecundo ahora debe de morir si o si.");
        }
        public void gestionaColmena(){
            System.out.println("La reyna: "+nombre+" esta gestionnado los recursos de la colmena.");
        }
        public Reyna(){
            this.nombre="k";
        }
       
    }
    public class Obrero{
        private String nombre;
        public void recolectarPolen(){
            System.out.println("El obrero: "+nombre+" recolecta polen.");
        }
        public void transportarPolen(){
            Random rnd=new Random();
            if((int)(rnd.nextDouble() * 6 + 1)==3)
                System.out.println("El obrero: "+nombre+" transporta polen.");
        }
        public void generarMiel(){
            System.out.println("El obrero: "+nombre+" crea miel.");
        }
        public void generarPapillaReal(){
            System.out.println("El obrero: "+nombre+" genera papilla real.");
        }
        public void limpiarColmena(){
            System.out.println("el obrero: "+nombre+" limpía el desmadre.");
        }
        public void crearCelda(){
            System.out.println("El obrero: "+nombre+" construye nuevas celdas.");
        }
        public void defenderColmena(){
            System.out.println("El obrero: "+nombre+" pelea.");
        }
        public void localizarReina(){
            System.out.println("El obrero: "+nombre+" sigue a la reyna..");
        }
        public Obrero(){
            this.nombre="nose";
        }
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        Modularidad colmena = new Modularidad();
        Modularidad.Obrero obrero = colmena.new Obrero();
        Modularidad.Reyna reyna = colmena.new Reyna();
        Modularidad.Zangano zangano = colmena.new Zangano();
        /*
        ahi 3 objetos que trabajndo juntos simulan el funcuionamiento de una colmena de abejas
        en donde cada uno de ellos realiza sus funciones especificas de manera satisfactoria
        lamentablemente es necesario de los 3 modulos diferentes de lo contrario la colmena estara vigente
        hasta que se acabe la comida, la abeja reina muera, se exisgan por falta de zanganos o muchas otras cosas
        se tiene un bajo nivel de acoplamento entre la reyna y el zangano ya que cuando el zangano 
        fermenta a la reyna este es expulsado del panal si no muere al llegar el invierno, por otro lado,
        se tiene un gran nivel de acoplamiento hacia la reyna, ya que si o si todos la sigue de lo contrario
        moriran por falta de ordenes.
        */
        reyna.seOcupaNuevoHogar(1);
        obrero.localizarReina();
        zangano.localizarReina();
        
        for(int i=1;i <30; i++){
            obrero.recolectarPolen();
            obrero.transportarPolen();
            obrero.generarMiel();
            zangano.comer();
            obrero.generarPapillaReal();
            reyna.gestionaColmena();
            obrero.limpiarColmena();
            obrero.crearCelda();
            obrero.defenderColmena();
            zangano.comer();
            reyna.gestionaColmena();
            if(reyna.buscaFecundador()){
                
                zangano.fecundar();
                reyna.creaHuevecillos();
                zangano.morir();
                obrero.crearCelda();
                obrero.generarPapillaReal();
                obrero.limpiarColmena();
            }
        }
        
    }
}
