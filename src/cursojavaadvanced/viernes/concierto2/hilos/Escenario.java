/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto2.hilos;

import cursojavaadvanced.viernes.concierto2.Audio;
import cursojavaadvanced.viernes.concierto2.Imagen;
import java.io.IOException;
import jueves.curso.concierto.LoadImage3;
import jueves.curso.concierto.LoadMusica3;
import martes.curso.Artista;

/**
 *
 * @author HP
 */
public class Escenario {
    public Artista registraArtista(String datos){
      String[] info=datos.split(",");
      Artista a = new Artista(info[0],info[1],info[2],info[3]+","+info[4],info[5].charAt(0),Integer.parseInt(info[6]),Integer.parseInt(info[7]));        
      return a;
    }
    public void iniciar(final Artista art)throws IOException, InterruptedException{
       Thread audio = new Thread(){
           public void run(){
               Imagen imagen = new Imagen();
               
               String[] imgs=art.getImg().split(",");
               //imagen.setImagen(imgs[0],imgs[1]);
               Audio musica = new Audio();
               //musica.setMusica(art.getCancion());
               ThreadGroup tg1=new ThreadGroup("Grupo Padre");
               Thread t1=new Thread(tg1,imagen,"pantalla");
                t1.start();
                 Thread t2=new Thread(tg1,musica,"musica");
                t2.start();
                try {
                    t2.join();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                tg1.list();
           }
       };  
       audio.start();
       audio.sleep(9000);
    }
}
