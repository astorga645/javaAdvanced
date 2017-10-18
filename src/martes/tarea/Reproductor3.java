/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes.tarea;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author HP
 */    

public class Reproductor3 {
  
    
    private AudioFileFormat aff;
    private AudioInputStream ais;
    private File sf;   
 


    public Reproductor3(String ruta)
    {       
        sf = new File(ruta);
    }
    
       
    /*Ejecución de sonido*/
    public void playAudio() throws InterruptedException
    {
     try
     {
       aff = AudioSystem.getAudioFileFormat(sf); 
       ais = AudioSystem.getAudioInputStream(sf);
            
       AudioFormat af = aff.getFormat(); 
            
       DataLine.Info info=new DataLine.Info(Clip.class,ais.getFormat(), 
                        ((int) ais.getFrameLength()*af.getFrameSize())); 
            
       Clip audio = (Clip)AudioSystem.getLine(info);
       audio.open(ais);
       audio.loop(5);//Clip.LOOP_CONTINUOUSLY
       System.out.println("Reproduciendo 10s. de sonido...");
        Thread.sleep(1000); // 1000 milisegundos (10 segundos)
        audio.close();
     }  
   catch(UnsupportedAudioFileException ee){} 
   catch(IOException ea){} 
   catch(LineUnavailableException LUE){};                
 }
 
} 
class prueba{
    public static void main(String[] agrs) throws InterruptedException{
        Reproductor3 audio = new Reproductor3("C://musica.wav");
        audio.playAudio();
    }
}