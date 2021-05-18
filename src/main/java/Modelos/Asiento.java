/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Enums.EstadoAsiento;

/**
 *
 * @author manu
 */
public class Asiento {
    
    private String numero;
    private EstadoAsiento estado; 
    

    public Asiento(String numero) {
        this.numero = numero;
        this.estado = estado.DESOCUPADO;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public EstadoAsiento getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }    

    @Override
    public String toString() {
        return numero;
    }
    
    
    
}
