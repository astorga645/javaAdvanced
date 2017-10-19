/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilerias;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 *
 * @author jorgearturo
 */
public class SoundHandler {
    public void playSound(String pathToSoundFile) throws Exception{
        String soundFile = pathToSoundFile;
        InputStream objInputStream = new FileInputStream(soundFile);
        AudioStream objAudioStream = new AudioStream(objInputStream);
        AudioPlayer.player.start(objAudioStream);
    }
}
