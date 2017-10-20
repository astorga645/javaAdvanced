/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto;

import java.io.File;
import java.io.IOException;
import martes.curso.Artista;

/**
 *
 * @author HP
 */
public class Presentador {
    public static void main(String[] args) throws IOException, InterruptedException {
        Artista a1=new Artista("Buki","Banda","buenosdias.wav","banda.png,banda2.jpg",'H',42,1);
        Artista a2=new Artista("Beethoven","Clasica","onlyone.wav","clasica.jpg,clasica2.jpg",'H',62,30);
        ConciertoGrupoRunnable concierto=new ConciertoGrupoRunnable();
        concierto.iniciar(a1);
        concierto.iniciar(a2);
        concierto.registraArtista(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\artistas.txt");
        //System.out.println(a1.todoString());
        //System.out.println(a2.todoString());
       // System.out.println("Termino");
    }
    
}
