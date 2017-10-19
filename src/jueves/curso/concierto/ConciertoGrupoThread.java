/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.concierto;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import martes.curso.Artista;

/**
 *
 * @author HP
 */
public class ConciertoGrupoThread {
    public static void main(String[] args)throws IOException, InterruptedException {
        /*creo a los artistas*/
        Artista a1=new Artista("Buki","Banda","buenosdias.wav","banda.png,banda2.jpg",'H',42,1);
        Artista a2=new Artista("Beethoven","Clasica","onlyone.wav","clasica.jpg,clasica2.jpg",'H',62,30);
        System.out.println(a1.todoString());
        System.out.println(a2.todoString());
        Song(a1);
        Song(a2);
        System.out.println("Termino");
        /*
         LoadImage2 loadImg = new LoadImage2();
        loadImg.setImagen("banda.png","banda2.jpg");
         LoadMusica2 loadMusica = new LoadMusica2();
        loadMusica.setMusica("");
        ThreadGroup tg1=new ThreadGroup("Grupo Padre");
        
        Thread t1=new Thread(tg1,loadImg,"Pantalla");
        t1.start();
         Thread t2=new Thread(tg1,loadMusica,"Musica");
        t2.start();
         LoadImage2 loadImg2 = new LoadImage2();
        loadImg2.setImagen("classica.jpg","clasica2.jpg");
         LoadMusica2 loadMusica2 = new LoadMusica2();
        loadMusica2.setMusica("");
        
        try {
            t2.join();
        } catch (Exception ex) {
            System.out.println(ex);
        }
       
        Thread t3=new Thread(tg1,loadImg2,"Pantalla2");
        t3.start();
         Thread t4=new Thread(tg1,loadMusica2,"Musica2");
        t4.start();
        System.out.println("Thread Group Name: "+tg1.getName());
        tg1.list();
        */
    }
    private static void Song(final Artista art) throws IOException, InterruptedException{
       Thread audio = new Thread(){
           public void run(){
               LoadImage3 imagen = new LoadImage3();
               String[] imgs=art.getImg().split(",");
               System.out.println(imgs);
               imagen.setImagen(imgs[0],imgs[1]);
               LoadMusica3 musica = new LoadMusica3();
               musica.setMusica(art.getCancion());
               musica.LoadMusica3();
               imagen.display();
               //art.getImg();
               try {
                   Thread.sleep(9000);
                   Thread.interrupted();
               } catch (InterruptedException ex) {
                   System.out.println(ex);
               }
           }
       };  
       audio.start();
       audio.sleep(500);
    }
}
