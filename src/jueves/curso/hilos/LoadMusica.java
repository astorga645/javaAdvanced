/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.hilos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author HP
 */
public class LoadMusica extends Thread{
    String song;
    void LoadMusica(){
        
    }
    public void setMusica(String rola){
        song = rola;
    }
    public void run(){
        try {
            System.out.println("pone Cancion");
            musica(song);
            Thread.sleep(1000);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] agrs)throws IOException{
        LoadMusica artista1=new LoadMusica();
        artista1.setMusica("buenosdias.wav");
        LoadMusica artista2=new LoadMusica();
        artista2.setMusica("onlyone.wav");
        
        artista1.start();
        try {
            artista1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        artista2.start();
        
        //musica.musica("onlyone.wav");
    }
    void musica(String song) throws IOException{
      this.song = song;
      InputStream in = new FileInputStream(song);
      AudioStream as = new AudioStream(in);
      AudioPlayer.player.start(as);
    }
}
