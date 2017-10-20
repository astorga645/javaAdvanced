/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import utilerias.LoadImageApp;

/**
 *
 * @author HP
 */
public class Imagen implements DesplegaImagen, Runnable{
    public void run(){
        
    }
    JFrame fv;
    @Override
    public void desplegar(String img){
        fv = new JFrame("Load");
        fv.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        fv.add(new LoadImageApp(img));
        fv.pack();
        fv.setVisible(true);
    }
}
