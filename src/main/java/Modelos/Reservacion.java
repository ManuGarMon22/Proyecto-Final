/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Modelos.ArticulosDeViaje.*;
import java.io.Serializable;

/**
 *
 * @author manu
 */
public class Reservacion implements Serializable{
    
    private Pasaporte pasaporte;
    private Vuelo vuelo;
    private Tarjeta tarjeta;
    private Asiento asiento;
    
    public Reservacion(){
    
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaportes) {
        this.pasaporte = pasaportes;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
    
    public String getNoPasaporte(){
        return this.getPasaporte().getNumero();
    }
    
    
    
    
}
