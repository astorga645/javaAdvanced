/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes.tarea;

import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author jorgearturo
 */
public class ReproductorAudio {
    public static void reproduce(){
        try {
			String s="musica.wav";
			AudioInputStream ais =
				AudioSystem.getAudioInputStream(
					getClass().getResourceAsStream(s)
				); //Obtiene el archivo de audio y lo transforma a un flujo de bits 
			AudioFormat baseFormat = ais.getFormat();//codifica el flujo de bits a un formato
			AudioFormat decodeFormat = new AudioFormat(
				AudioFormat.Encoding.PCM_SIGNED,//determina el tipo de PCM
				baseFormat.getSampleRate(),//Obtiene el rate de la muestra
				16,
				baseFormat.getChannels(),//Canales de audio
				baseFormat.getChannels() * 2,//Canales de audio
				baseFormat.getSampleRate(),
				false
			);
			AudioInputStream dais =
			AudioSystem.getAudioInputStream(
					decodeFormat, ais);//Decodifica finalmente el audio para manejarlo
                        
			Clip clip = AudioSystem.getClip();//obtiene un clip para almacenar y reproducir el audio
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource(s)));
                        clip.open(dais);//abre el archivo de audio.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
    public static void main(String[] agrs){
        reproduce();
        
    }
}
