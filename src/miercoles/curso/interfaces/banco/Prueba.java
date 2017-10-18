/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso.interfaces.banco;

import miercoles.curso.interfaces.Banco;

/**
 *
 * @author HP
 */
class SBI implements Banco{
    public float getRateOfInterest(){
        return 1.9f;
    }
}
class ICICI implements Banco{
    public float getRateOfInterest(){
        return 1.96f;
    }
}
class ISASA implements Banco{
    public float getRateOfInterest(){
        return 1.89f;
    }
}
public class Prueba {
    public static void main(String[] agrs){
        Banco b=new SBI();
        System.out.println("Intereses en SBI: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("Intereses en ICICI: "+b.getRateOfInterest());
        b=new ISASA();
        System.out.println("Intereses en ISASA: "+b.getRateOfInterest());
    }
}
