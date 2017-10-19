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
public class SoundTest {
    public static void main(String[] args) throws Exception {
        SoundHandler sound = new SoundHandler();
        try {
            sound.playSound("musica.wav");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
