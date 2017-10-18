/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes.tarea;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JFrame;
import utilerias.LoadImageApp;

/**
 *
 * @author HP
 */

 class IntentoReproductor{
    private void reproducir()
    {
         //InputStream path = getClass().getResourceAsStream(nombre);
        InputStream path;
        try {
            path = new FileInputStream("C://musica.wav");
       
       Clip sonido;
       sonido=AudioSystem.getClip();
       sonido.open(AudioSystem.getAudioInputStream(path));
       sonido.start();
       mostrarImagenes("");
       } catch (FileNotFoundException ex) {
            Logger.getLogger(IntentoReproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
      catch(Exception fallo){
       //System.out.println(fallo);
      }
    }
    public void mostrarImagenes(String img) {
        img="mapaMundi.jpg";
        System.out.println("Se muestran las imagenes de musica clasica");
        JFrame f = new JFrame("Load Image Sample");
         if(f.isVisible()){
            f.repaint();
        }
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        f.add(new LoadImageApp(img));
        f.pack();
        f.setVisible(true);
    }
    public void musica(String cancion) throws FileNotFoundException{
        reproducir();
    }
    public static double getAudioFileDuration(File file) {
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);

            // At present, ALAW and ULAW encodings must be converted
            // to PCM_SIGNED before it can be played
            AudioFormat format = stream.getFormat();
            if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
                format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
                        format.getSampleRate(), format.getSampleSizeInBits(),
                        format.getChannels(), format.getFrameSize(),
                        format.getFrameRate(), true); // big endian
                stream = AudioSystem.getAudioInputStream(format, stream);
            }
            DataLine.Info info = new DataLine.Info(Clip.class,
                    stream.getFormat(),
                    ((int) stream.getFrameLength() * format.getFrameSize()));
            Clip clip = (Clip) AudioSystem.getLine(info);
            // clip.open(stream);
            double durationInSecs = clip.getBufferSize()
                    / (clip.getFormat().getFrameSize() * clip.getFormat()
                            .getFrameRate());
            double minTemp = Math.round(Math.round(durationInSecs) / 60.0);
            double durationInMin = minTemp
                    + (((Math.round(durationInSecs) / 60.0) - minTemp) * 60)
                    / 100;
            return durationInMin;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }
}

public class Reproductor4 {
    public static void main(String[] args) throws FileNotFoundException {
        IntentoReproductor repro=new IntentoReproductor();
        repro.musica("/sonido/musica.wav");
    }
   
}
