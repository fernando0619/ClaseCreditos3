/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1061729826
 */
public class Pelicula {
    private String titulo;
    private int anio;
    private List<Genero> generos = new ArrayList<>();//inicializamos la lista

    public Pelicula() {
    }

    public Pelicula(String t, int a) {
        this.titulo = t;
        this.anio = a;
    }
    
    //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setAnio(int a) {
        this.anio = a;
    }

    public void setGeneros(List<Genero> genero) {
        this.generos = genero;
    }
    
    
}
