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
public class Artista {
    private String nombre;
    private String instrumento;
    private String img;
    private char sexo;
    private String genero;
    private int integrantes;
    private int edad;
    
    public Artista(){}
    public Artista( String nombre, String genero, String instrumento){
        this.nombre = nombre;
        this.genero = genero;
        this.instrumento=instrumento;
    }
    public Artista( String nombre, String genero, String instrumento,String img,char sexo,int edad, int integrantes){
        this.nombre = nombre;
        this.genero = genero;
        this.instrumento=instrumento;
        this.img=img;
        this.edad = edad;
        this.sexo=sexo;
        this.integrantes=integrantes;
    }
    public String getNombre(){return nombre;}
    public String getImg(){return img;}
    public String getInstrumento(){return instrumento;}
    public String getGenero(){return genero;}
    public char getSexo(){return sexo;}
    public int getEdad(){return edad;}
    public int getIntegrantes(){return integrantes;}
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setImg(String img){
        if(!img.isEmpty()){
            this.img = img;
            return true;
        }else
            return false;
    }
    public boolean setInstrumento(String instrumento){
        if(!instrumento.isEmpty()){
            this.instrumento = instrumento;
            return true;
        }else
            return false;
    }
    public boolean setSexo(char sexo){
        if(sexo != ' '){
            this.sexo = sexo;
            return true;
        }else
            return false;
    }
    public boolean setEdad(int edad){
        if(edad >0){
            this.edad = edad;
            return true;
        }else
            return false;
    }
    public boolean setIntegrantes(int integrantes){
        if(integrantes >0){
            this.integrantes = integrantes;
            return true;
        }else
            return false;
    }
}
