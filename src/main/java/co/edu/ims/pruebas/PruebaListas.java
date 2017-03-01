/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 1061729826
 */
public class PruebaListas {
    
    public static void main (String[] arg){
        List<String> lista = new ArrayList<>();
        String actor1 = "Chespirito";
        String actor2 = "Audrey Tatoo";
        String actor3 = "Megan Fox";
        String actor4 = "Arnold Scharzenegger";
        
        lista.add(actor1);
        lista.add(actor2);
        lista.add(actor3);
        lista.add(actor4);
        lista.add(actor1);
        lista.add(actor3);
        
        Collections.sort(lista);//ordena la lista
        System.out.println(lista);
        System.out.println("Tamaño: "+lista.size());//que tamaño tiene la lista
    }
}
