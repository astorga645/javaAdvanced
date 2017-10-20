/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto;

import java.io.IOException;
import jueves.curso.concierto.LoadImage3;
import jueves.curso.concierto.LoadMusica3;
import martes.curso.Artista;

/**
 *
 * @author HP
 */

public class ConciertoGrupoRunnable implements Concierto{
    @Override
    public Artista registraArtista(String datos){
      String[] info=datos.split(",");
      Artista a = new Artista(info[0],info[1],info[2],info[3]+","+info[4],info[5].charAt(0),Integer.parseInt(info[6]),Integer.parseInt(info[7]));        
    // Artista a1=new Artista("Buki","Banda","buenosdias.wav","banda.png,banda2.jpg",'H',42,1);  
      return new Artista();
    }
    @Override
    public void iniciar(final Artista art)throws IOException, InterruptedException{
       Thread audio = new Thread(){
           public void run(){
               LoadImage3 imagen = new LoadImage3();
               String[] imgs=art.getImg().split(",");
               //System.out.println(imgs);
               imagen.setImagen(imgs[0],imgs[1]);
               LoadMusica3 musica = new LoadMusica3();
               musica.setMusica(art.getCancion());
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
                
                //System.out.println("Thread Group Name: "+tg1.getName());
                tg1.list();
               
               //art.getImg();
               /*
               try {
                   //Thread.sleep(1000);
                   //Thread.interrupted();
               } catch (InterruptedException ex) {
                   System.out.println(ex);
               }*/
           }
       };  
       audio.start();
       audio.sleep(8000);
      
    }
    
}
