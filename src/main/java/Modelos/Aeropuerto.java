/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author manu
 */
public class Aeropuerto implements Serializable {
    
    private String Nombre, Ciudad, Pais;
    private ArrayList<Aerolinea> aerolineas;

    public Aeropuerto(String Nombre, String Ciudad, String Pais) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Pais = Pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }


    public String getPais() {
        return Pais;
    }

    public ArrayList<Aerolinea> getAerolineas() {
        return aerolineas;
    }
    
    @Override
    public String toString(){
        return (this.getNombre());
    }
    
    
    
    
    
}
