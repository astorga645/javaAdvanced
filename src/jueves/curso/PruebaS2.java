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
public class PruebaS2 {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        
        r.addShutdownHook(new Thread(){
            public void run(){
                System.out.println("No main, press ctrl+c to exit");
                try{
                    Thread.sleep(5000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        
        
    }
}
