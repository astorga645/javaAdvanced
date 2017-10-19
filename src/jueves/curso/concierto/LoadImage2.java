/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.concierto;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;
import jueves.curso.hilos.LoadMusica;
import utilerias.LoadImageApp;

/**
 *
 * @author HP
 */

public class LoadImage2 extends Thread{
    String imagen,imagen2;
    JFrame fv;
    public void run(){
        //display("clasica.jpg");
        
    }
    public void setImagen(String img1, String img2){
        this.imagen =img1;
        this.imagen2 =img2;
        
    }
    synchronized void display(String imagen,String imagen2){
        try {
            System.out.println("Muestra Imagen");
            muestra(imagen);
            //musica.musica("onlyone.wav");
            Thread.sleep(1000);
            fv.setVisible(false);
            muestra(imagen2);
            Thread.sleep(1000);
            fv.setVisible(false);
           
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        //return fv;
    }
    private void muestra(String imagen){
        this.imagen =imagen;
        fv = new JFrame("Load");
        fv.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        fv.add(new LoadImageApp(imagen));
        fv.pack();
        fv.setVisible(true);
    }
}