/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.pruebas;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;
import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author 1061729826
 */
public class AppMain {
    
    public static void main (String[] arg){
        Pelicula terminator = new Pelicula ("terminator", 1985);
        Pelicula insideOut = new Pelicula("InsideOut", 2015);
        
        Pelicula titanic = new Pelicula();
        titanic.setTitulo("Titanic");
        titanic.setAnio(1996);
        
        Genero accion = new Genero ("Accion");
        Genero comedia = new Genero ("Comedia");
        Genero animada = new Genero ("Animada");
        Genero sifi = new Genero ("Ciencia ficcion");
        
        terminator.getGeneros().add(sifi);
        terminator.getGeneros().add(accion);
        //terminator.getGeneros().remove(sifi);//remover el genero
        
        insideOut.getGeneros().add(animada);
        titanic.getGeneros().add(accion);
        
        Gson gson = new Gson();
        String json = gson.toJson(terminator);
        
        System.out.println(json);
        
        
    }
}
