/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.concierto;

/**
 *
 * @author HP
 */
public class ConciertoGrupoRunnable {
    public static void main(String[] args) {
        final LoadImage3 loadImg = new LoadImage3();
        loadImg.setImagen("banda.png","banda2.jpg");
        final LoadMusica3 loadMusica = new LoadMusica3();
        loadMusica.setMusica("onlyone.wav");
        ThreadGroup tg1=new ThreadGroup("Grupo Padre");
        
        LoadImage3 loadImg2 = new LoadImage3();
        loadImg2.setImagen("classica.jpg","clasica2.jpg");
         LoadMusica3 loadMusica2 = new LoadMusica3();
        loadMusica2.setMusica("buenosdias.wav");
        
        Thread t1=new Thread(tg1,loadImg,"pantalla");
        t1.start();
         Thread t2=new Thread(tg1,loadMusica,"musica");
        t2.start();
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
    }
}
