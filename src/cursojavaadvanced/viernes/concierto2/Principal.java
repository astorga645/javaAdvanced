/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto2;

import cursojavaadvanced.viernes.concierto.ConciertoGrupoRunnable;
import cursojavaadvanced.viernes.concierto2.IO.RegistraArtista;
import cursojavaadvanced.viernes.concierto2.hilos.Escenario;
import java.io.File;
import martes.curso.Artista;

/**
 *
 * @author HP
 */
public class Principal {
    public static void main(String[] args) {
        
        Escenario concierto=new Escenario();
        RegistraArtista registrar=new RegistraArtista();
        String srt= registrar.registra(new File (".").getAbsolutePath ()+""
                    + "\\manejoArchivos\\artistas.txt");
        String[] arts=srt.split("-");
        
        for(int i=0;i<)
        concierto.registraArtista(arts[0]);
    }
        
}
