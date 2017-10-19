/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.concierto;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ConciertoRunnable {
        public static void main(String[] args) {
        final LoadImage3 loadImg = new LoadImage3();
        final LoadMusica3 loadMusica = new LoadMusica3();
        Thread t1=new Thread(){
          public void run(){
              loadImg.display("clasica.jpg", "clasica2.jpg");
          }  
        };
        Thread t2=new Thread(){
          public void run(){
              loadImg.display("banda.png","banda2.jpg");
          }  
        };
        Thread t3=new Thread(){
          public void run(){
            try {
                System.out.println("pone Cancion");
                loadMusica.musica();
                Thread.sleep(1000);
            } catch (IOException ex) {
                System.out.println(ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConciertoRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
              
          }  
        };
        Thread t4=new Thread(){
          public void run(){
              try {
                System.out.println("pone Cancion");
                loadMusica.musica();
                Thread.sleep(1000);
            } catch (IOException ex) {
                System.out.println(ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConciertoRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
              
          }  
        };
        t3.start();
        t1.start();
        t2.start();
        t4.start();
    }
}
