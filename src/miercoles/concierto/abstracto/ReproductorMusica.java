/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.concierto.abstracto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class ReproductorMusica {
    void ReproductorMusica(){}
    public void reproduce(String rola){
        InputStream in;
        try {
            in = new FileInputStream(rola);
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public static void main(String[] args) {
        ReproductorMusica musica = new ReproductorMusica();
        musica.reproduce("musica.wav");
    }
}
