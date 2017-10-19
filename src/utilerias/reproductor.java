/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilerias;

/**
 *
 * @author jorgearturo
 */
public class reproductor {
    public static void main(String[] args) {
        try{
        String cad = new String("musica.wav");
        ProcessBuilder p=new ProcessBuilder("cmd.exe","/c","start",cad);
        p.start();
        }catch(Exception e) {}
     }
}
