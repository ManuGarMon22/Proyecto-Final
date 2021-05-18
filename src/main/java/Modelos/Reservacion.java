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
    
    private String pasaporte, vuelo, tarjeta, asiento;

    public Reservacion(String pasaporte, String vuelo, String tarjeta, String asiento) {
        this.pasaporte = pasaporte;
        this.vuelo = vuelo;
        this.tarjeta = tarjeta;
        this.asiento = asiento;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    
   

   
    
    
    
    
}
