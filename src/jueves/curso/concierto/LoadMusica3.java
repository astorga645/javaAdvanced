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

public class LoadMusica3 implements Runnable{
    String song;
    void LoadMusica3(){
        
    }
    public void setMusica(String rola){
        song = rola;
    }
    public void run(){
        try {
            //System.out.println("pone Cancion");
            musica();
            Thread.sleep(1000);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    synchronized void musica() throws IOException{
      //this.song = song;
      InputStream in = new FileInputStream(song);
      AudioStream as = new AudioStream(in);
      AudioPlayer.player.start(as);
    }
}