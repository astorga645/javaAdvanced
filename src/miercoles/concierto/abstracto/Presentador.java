/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.concierto.abstracto;

import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import martes.curso.Artista;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import utilerias.LoadImageApp;

/**
 *
 * @author HP
 */
class Sonido {
    public void iniciar(String pathToSoundFile) throws Exception{
        String soundFile = pathToSoundFile;
        InputStream objInputStream = new FileInputStream(soundFile);
        AudioStream objAudioStream = new AudioStream(objInputStream);
        AudioPlayer.player.start(objAudioStream);
    }
}
class Clasica extends Concierto {
    
    @Override
    public void tocarInstrumentos() {
        System.out.println("Se tocan instrumentos de musica clasica");
    }

    @Override
    public void mostrarImagenes(String img) {
        System.out.println("Se muestran las imagenes de musica clasica");
        //f = new JFrame("Load Image Sample");
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
    
    @Override
    public void reproducirMusica(String cancion) {
        System.out.println("Se reproduce la musica");
        try {
            cancion = new File ("").getAbsolutePath ()+"\\"+cancion;
            
           
        System.out.println("Ruta: "+cancion);
        File file = new File(cancion);
        if(!file.exists())
                System.out.println("No ahi fichero de musica loco");
            /*AudioInputStream */
            System.out.println("Ruta archivo: "+file.getAbsolutePath());
            stream = (AudioInputStream)AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(stream);
                clip.start();
                
                // sleep to allow enough time for the clip to play
                Thread.sleep(50000);
            
        detenerMusica();
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }

    @Override
    public void detenerMusica() {
        System.out.println("Se detiene la musica");
        try {
            stream.close();
        } catch (IOException ex) {
            Logger.getLogger(Clasica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cambiarArtista() {
        System.out.println("Se cambia al artista");
    }
    
}
class Banda extends Concierto {
    
    @Override
    public void tocarInstrumentos() {
        System.out.println("Se tocan instrumentos de musica de banda");
    }

    @Override
    public void mostrarImagenes(String img) {
        System.out.println("Se muestran las imagenes de musica la banda");
        //f = new JFrame("Load Image Sample");
        if(f.isVisible()){
            f.revalidate();
            
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
    
    @Override
    public void reproducirMusica(String cancion) {
        System.out.println("Se reproduce la musica");
        try {
           cancion = new File (".").getAbsolutePath ()+"\\"+cancion; 
      File file = new File(cancion);
      if(!file.exists())
                System.out.println("No ahi fichero de musica loco");
      /*AudioInputStream*/ stream = (AudioInputStream)AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(stream);
      clip.start();
 
      // sleep to allow enough time for the clip to play
      Thread.sleep(50000);
      detenerMusica();
      
 
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    }

    @Override
    public void detenerMusica() {
        System.out.println("Se detiene la musica");
        try {
            stream.close();
        } catch (IOException ex) {
            Logger.getLogger(Banda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cambiarArtista() {
        System.out.println("Se cambia al artista");
    }
    
}
public class Presentador{
    public static void main(String[] args) {
        /*se crean los objetos y se manipulan*/
        Artista artista=new Artista();
        ArrayList<Artista> lista=new ArrayList<Artista>();
        
        lista.add(new Artista("Buki","Banda","Microfono","banda.png",'H',42,1));
        lista.add(new Artista("Beethoven","Clasica","dirige","clasica.jpg",'H',62,30));
            System.out.println ("Ruta del proyecto: "+new File (".").getAbsolutePath ());
        Concierto presentador;
        presentador = new Banda();
        presentador.mostrarImagenes(lista.get(0).getImg());
        presentador.tocarInstrumentos();
        presentador.reproducirMusica("musica.wav");
        //presentador.detenerMusica();
        System.out.println("Presentador: Se cambiara de artista en "
                + "unos momentos...");
        presentador = new Clasica();
        presentador.mostrarImagenes(lista.get(1).getImg());
        presentador.tocarInstrumentos();
        presentador.reproducirMusica("musica.wav");
        //presentador.detenerMusica();
    }
}
