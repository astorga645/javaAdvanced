/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes.tarea;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author HP
 */
public class Reproductor2 {
    public static void main(String[] args) {
   try {
     Clip sonido = AudioSystem.getClip();
     File a = new File("C://Users/HP/Desktop/CursoJavaAdvanced/src/martes/tarea/musica.wav");
     sonido.open(AudioSystem.getAudioInputStream(a));
     sonido.start();
     System.out.println("Reproduciendo 10s. de sonido...");
     Thread.sleep(1000); // 1000 milisegundos (10 segundos)
     sonido.close();
   }
    catch (Exception tipoerror) {
      //System.out.println("" + tipoerror);
    }
  }
}
