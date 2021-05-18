/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.ArticulosDeViaje;

import Enums.EstadoTarjeta;
import java.io.Serializable;

/**
 *
 * @author manu
 */
public class Tarjeta implements Serializable {
    
    private EstadoTarjeta estado; 
    private String Numero, CVC, numeroPasaporteVinculado; 
    private double dinero; 

    public Tarjeta(String Numero, String numeroPasaporteVinculado, double dinero,  String CVC) {
        this.Numero = Numero;
        this.CVC = CVC;
        this.numeroPasaporteVinculado = numeroPasaporteVinculado;
        this.dinero = dinero;
        this.estado = estado.ACTIVADA;
    }
    
    
    

    public EstadoTarjeta getEstado() {
        return estado;
    }

    public String getNumero() {
        return Numero;
    }

    public String getCVC() {
        return CVC;
    }

    public String getNumeroPasaporteVinculado() {
        return numeroPasaporteVinculado;
    }

    public double getDinero() {
        return dinero;
    }

    public void setEstado(EstadoTarjeta estado) {
        this.estado = estado;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
  
}


