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
    private int Numero, CVC, numeroPasaporteVinculado; 
    private double dinero; 

    public Tarjeta(int Numero, int numeroPasaporteVinculado, double dinero,  int CVC) {
        this.Numero = Numero;
        this.CVC = CVC;
        this.numeroPasaporteVinculado = numeroPasaporteVinculado;
        this.dinero = dinero;
        this.estado = estado.ACTIVADA;
    }
    
    
    

    public EstadoTarjeta getEstado() {
        return estado;
    }

    public int getNumero() {
        return Numero;
    }

    public int getCVC() {
        return CVC;
    }

    public int getNumeroPasaporteVinculado() {
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


