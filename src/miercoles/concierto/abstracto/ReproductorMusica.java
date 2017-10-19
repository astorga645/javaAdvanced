/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.concierto.abstracto;
import sun.audio.AudioStream;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
/**
 *
 * @author HP
 */
//@SuppressWarnings("proprietary")
@SuppressWarnings("restriction")
public class ReproductorMusica {

    public static void main(String[] args)throws Exception {
        
            
            
            InputStream objInputStream = new FileInputStream("musica.wav");
             AudioStream objAudioStream;
        objAudioStream = new AudioStream(objInputStream);
        AudioPlayer.player.start(objAudioStream);
    }
}
