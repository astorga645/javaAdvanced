/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.concierto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author HP
 */
public class LoadMusica2 extends Thread{
    String song;
    void LoadMusica2(){
        
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
        LoadMusica2 artista1=new LoadMusica2();
        artista1.setMusica("buenosdias.wav");
        LoadMusica2 artista2=new LoadMusica2();
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
    synchronized void musica(String song) throws IOException{
      this.song = song;
      InputStream in = new FileInputStream(song);
      AudioStream as = new AudioStream(in);
      AudioPlayer.player.start(as);
    }
}
