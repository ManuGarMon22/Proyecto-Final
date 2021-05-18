/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Modelos.Persona.Trabajador;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author manu
 */
public class Aerolinea implements Serializable{
    
    private Trabajador operador, gerente;
    private String aeropuerto;
    private String nombre; 
    private ArrayList<Avion> aviones = new ArrayList<Avion>(); 

    public Aerolinea(String nombreAeropuerto, String nombre) {
        this.nombre = nombre;
        aeropuerto= nombreAeropuerto;
        this.operador = null;
        this.gerente = null;
    }
    
    public void AgregarAvion(Avion avion){
        this.getAviones().add(avion);
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  

    public ArrayList<Avion> getAviones() {
        return aviones;
    }
    
    @Override
    public String toString(){
        return (this.getNombre());
    }

    public Trabajador getOperador() {
        return operador;
    }

    public void setOperador(Trabajador operador) {
        this.operador = operador;
    }

    public Trabajador getGerente() {
        return gerente;
    }

    public void setGerente(Trabajador gerente) {
        this.gerente = gerente;
    }
    
  
    
}