/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Enums.EstadoAvion;
import java.io.Serializable;

/**
 *
 * @author manu
 */
public class Avion implements Serializable{
    
    
    private double gasMax, consumoXMilla;
    private EstadoAvion estado;
    private String ubicacion, codigo, aerolinea;
    private Asiento[] asientos;
    private int filas, columnas;

    public Avion(String aerolinea, String ubicacion, String codigo, int capacidad, double gasMax, double consumoXMilla) {
        this.aerolinea = aerolinea;
        this.codigo = codigo;
        this.gasMax = gasMax;
        this.consumoXMilla = consumoXMilla;
        this.ubicacion = ubicacion;
        this.asientos = new Asiento[capacidad];
        this.estado = EstadoAvion.SIN_VUELO;
        this.llenarAsientos();
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public double getGasMax() {
        return gasMax;
    }

    public double getConsumoXMilla() {
        return consumoXMilla;
    }

    public EstadoAvion getEstado() {
        return estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    public void llenarAsientos(){
        for(int i =0; i < this.asientos.length; i++){
            String n = ""+i; 
            asientos[i] = new Asiento(n);
        }
    }
    
    
    
    
    
    
    
    
}
