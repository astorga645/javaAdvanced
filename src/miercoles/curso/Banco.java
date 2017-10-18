/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miercoles.curso;

/**
 *
 * @author HP
 */
        
abstract class Banco {
    abstract float getRateOfInterest();
}
class SBI extends Banco{
    float getRateOfInterest(){
        return 1.5f;
    }
}
class PNB extends Banco{
    float getRateOfInterest(){
        return 1.9f;
    }
}
class ICICI extends Banco{
    float getRateOfInterest(){
        return 1.7f;
    }
}
class Test{
    public static void main(String[] agrs){
        Banco b;
        String msg="";
        b=new SBI();
        msg += "Rate of interest is: ";
        msg+=+b.getRateOfInterest();
        msg+=" %";
        System.out.println(msg);
        
        b=new PNB();
        msg += "\nRate of interest is: ";
        msg+=+b.getRateOfInterest();
        msg+=" %";
        System.out.println(msg);
        
        b=new ICICI();
        msg += "\nRate of interest is: ";
        msg+=+b.getRateOfInterest();
        msg+=" %";
        System.out.println(msg);
    }
}
