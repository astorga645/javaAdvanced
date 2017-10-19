/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves.curso;

/**
 *
 * @author HP
 */
class MThread extends Thread{
    public void run(){
        System.out.println("Shutdouwn tarea");
    }
}
public class PruebaS{
    
    public static void main(String[] args)throws Exception {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MThread());
        
        System.out.println("No main ... .. Press ctrl+c");
        try{
        Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
