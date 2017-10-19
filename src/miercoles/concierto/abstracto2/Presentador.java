/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.concierto.abstracto2;

import java.util.ArrayList;
import martes.curso.Artista;

/**
 *
 * @author HP
 */

public class Presentador{
    public static void main(String[] args) {
        /*se crean los objetos y se manipulan*/
        Artista artista=new Artista();
        ArrayList<Artista> lista=new ArrayList<Artista>();
        
        lista.add(new Artista("Buki","Banda","Microfono","banda.png",'H',42,1));
        lista.add(new Artista("Beethoven","Clasica","dirige","clasica.jpg",'H',62,30));
        
        Concierto presentador;
        presentador = new Cantar();
        presentador.mostrarImagenes(lista.get(0).getImg());
        presentador.tocarInstrumentos();
        presentador.reproducirMusica("musica.wav");       
        
        //presentador.detenerMusica();
        System.out.println("Presentador: Se cambiara de artista en "
                + "unos momentos...");
        presentador = new Cantar();
        presentador.mostrarImagenes(lista.get(1).getImg());
        presentador.tocarInstrumentos();
        presentador.reproducirMusica("cancion2.wav");
        //presentador.detenerMusica();
    }
}
