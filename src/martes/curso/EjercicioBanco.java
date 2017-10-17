/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes.curso;

/**
 *
 * @author HP
 */
interface Mensaje{
        public void tedigo();
    }
class Banco{
    void Banco(){
        
    }
    public float tasaInteres(){
        return 5f;
    }
    
}
class SBI extends Banco implements Mensaje{
    public void tedigo(){
        System.out.println("SBI dice...");
    }
    public float tasaInteres(){
        return 1.5f;
    }
    public float getRateOfinterest(){
        return 5;
    }
}
class ICICI extends Banco implements Mensaje{
    public void tedigo(){
        System.out.println("ICICI dice...");
    }
    public float tasaInteres(){
        return 1.4f;
    }
    public float getRateOfinterest(){
        return 9.8f;
    }
}
class AXIS extends Banco implements Mensaje{
    public void tedigo(){
        System.out.println("AXIS dice...");
    }
    public float tasaInteres(){
        return 1.4f;
    }
    public float getRateOfinterest(){
        return 85.6f;
    }
}
public class EjercicioBanco {
    public static void main(String[] agrs){
    SBI sbi = new SBI();
    sbi.tedigo();
    System.out.println("SBI: "+sbi.getRateOfinterest());
    System.out.println("Tasa de interes SBI: "+sbi.tasaInteres());
    ICICI icici = new ICICI();
    icici.tedigo();
    System.out.println("ICICI: "+icici.getRateOfinterest());
    System.out.println("Tasa de interes ICICI: "+icici.tasaInteres());
    AXIS axis = new AXIS();
    axis.tedigo();
    System.out.println("AXIS: "+axis.getRateOfinterest());
    System.out.println("Tasa de interes AXIS: "+axis.tasaInteres());
    System.out.println("Polimorfismo");
    Banco b=new Banco();
    b = new SBI();
    System.out.println("Tasa de interes SBI: "+b.tasaInteres());
    b = new ICICI();
    System.out.println("Tasa de interes ICICI: "+b.tasaInteres());
    b = new AXIS();
    System.out.println("Tasa de interes AXIS: "+b.tasaInteres());
    }
}
 