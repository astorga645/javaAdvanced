/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.concierto.abstracto;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */

public class VisorImagen extends Component {
          
    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public VisorImagen() {
       try {
           img = ImageIO.read(new File("strawberry.jpg"));
       } catch (IOException e) {
       }

    }
    public VisorImagen(String imagen) {
       try {
           img = ImageIO.read(new File(imagen));
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }/*
    void musica(){
        JFileChooser archivo = new JFileChooser();
        archivo.setFileFilter(filtro);
        intseleccion = archivo.showOpenDialog(archivo);
                URL url = null;
        if(seleccion == JFileChooser.APPROVE_OPTION){
        try {
        url = archivo.getSelectedFile().toURL();
                    } catch (MalformedURLException ex) {
        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }           
        AudioClipmusicarep = java.applet.Applet.newAudioClip(url);
        musicarep.play();
                }
            }*/
    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        String img="mapaMundi.jpg";
        f.add(new VisorImagen(img));
        f.pack();
        f.setVisible(true);
    }
}