/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Enums.EstadoAsiento;
import java.io.Serializable;

/**
 *
 * @author manu
 */
public class Asiento implements Serializable {
    
    private String numero;
    private boolean disponible; 
    

    public Asiento(String numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean getEstado() {
        return disponible;
    }

    public void setEstado(boolean estado) {
        this.disponible = estado;
    }    

    @Override
    public String toString() {
        return numero;
    }
    
    
    
}
