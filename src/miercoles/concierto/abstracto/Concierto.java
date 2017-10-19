/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.concierto.abstracto;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
abstract class Concierto {
    /*
    static protected JFrame f = new JFrame("Load Image Sample");;
    static protected AudioInputStream stream;*/
    
    public abstract void tocarInstrumentos();
    public abstract void mostrarImagenes(String img);
    public abstract void reproducirMusica(String cancion);
    public abstract void detenerMusica();
    public abstract void cambiarArtista();
}
