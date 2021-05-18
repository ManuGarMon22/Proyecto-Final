/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author manu
 */
public class Distancia {
    
    String origen, destino, millas;

    public Distancia(String origen, String destino, String millas) {
        this.origen = origen;
        this.destino = destino;
        this.millas = millas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMillas() {
        return millas;
    }

    public void setMillas(String millas) {
        this.millas = millas;
    }
    
}
