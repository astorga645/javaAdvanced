/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author HP
 */
public class Audio implements PlayAudio, Runnable{
    public void run(){
        
    }
    @Override
    public void play(String musica)throws IOException{
        InputStream in = new FileInputStream(musica);
      AudioStream as = new AudioStream(in);
      AudioPlayer.player.start(as);
    }
}
