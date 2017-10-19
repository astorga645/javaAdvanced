/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso.IO;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Console13 {
    public static void main(String[] args) {
        System.out.println("Escribe algo: ");
        Scanner in = new Scanner(System.in);
        String seEscribio = in.next();
        System.out.println("Escriste: "+seEscribio);
        
    }
}
