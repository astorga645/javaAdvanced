/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.concierto.abstracto;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import utilerias.LoadImageApp;

/**
 *
 * @author HP
 */

class MusicaClasica extends Concierto {
    
    @Override
    public void tocarInstrumentos() {
        System.out.println("Se tocan instrumentos de musica clasica");
    }

    @Override
    public void mostrarImagenes(String img) {
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
    
    @Override
    public void reproducirMusica(String cancion) {
        System.out.println("Se reproduce la musica");
        try {
            InputStream in = new FileInputStream("musica.wav");
            AudioStream as=new AudioStream(in);
            AudioPlayer.player.start(as);
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }

    @Override
    public void detenerMusica() {
        System.out.println("Se detiene la musica");
        
    }

    @Override
    public void cambiarArtista() {
        System.out.println("Se cambia al artista");
    }
    public static void main(String[] arts){
     MusicaClasica musica = new MusicaClasica();
     musica.mostrarImagenes("banda.png");
     musica.reproducirMusica("musica.wav");
     //AudioPlayer.player.start(as);
    }
}
