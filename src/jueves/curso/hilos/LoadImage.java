/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.hilos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import utilerias.LoadImageApp;

/**
 *
 * @author HP
 */
public class LoadImage extends Thread{
    String imagen;
    JFrame fv;
    LoadMusica musica;
    public void run(){
        
        try {
            System.out.println("Muestra Imagen");
            display("clasica.jpg");
            //musica.musica("onlyone.wav");
            Thread.sleep(1000);
            fv.setVisible(false);
            display("clasica2.jpg");
            Thread.sleep(1000);
            fv.setVisible(false);
            display("banda.png");
           // musica.musica("buenosdias.wav");
            Thread.sleep(1000);
            fv.setVisible(false);
            display("banda2.jpg");
            Thread.sleep(1000);
            fv.setVisible(false);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
    public void display(String imagen){
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
        //return fv;
    }
    public static void main(String []agrs)throws IOException{
        LoadImage img=new LoadImage();
        LoadMusica musica=new LoadMusica();
        musica.musica("onlyone.wav");
        img.start();
        
        
    }
}
