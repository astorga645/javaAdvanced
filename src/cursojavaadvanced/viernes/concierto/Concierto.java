/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.viernes.concierto;

import java.io.IOException;
import martes.curso.Artista;

/**
 *
 * @author HP
 */
public interface Concierto{
    public void iniciar(final Artista art)throws IOException, InterruptedException;
    public Artista registraArtista(String ruta);
}
