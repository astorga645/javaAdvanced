/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso.interfaces.acciones;

import miercoles.curso.interfaces.Circulo;
import miercoles.curso.interfaces.Drawable;

/**
 *
 * @author HP
 */
class Cuadrado implements Drawable{
    @Override
    public void draw(){
        System.out.println("drawing a cuadrado");
    }
}

public class Figuras{
    public static void main(String[] agrs){
        Circulo circulo= new Circulo();
        Drawable casteoCirculo = (Drawable)new Circulo();
        Cuadrado cuadrado= new Cuadrado();
        circulo.draw();
        cuadrado.draw();
        casteoCirculo.draw();
    }
}

