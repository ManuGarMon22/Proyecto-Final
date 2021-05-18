/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Enums.EstadoVuelo;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author manu
 */
public class Vuelo implements Serializable{
    
    private String codigoVuelo, origen, destino, nombreAerolinea, CodigoAvion, textEstado;
    private double precio; 
    private LocalDate diaVuelo;
    private EstadoVuelo estado;

    public Vuelo(String codigoVuelo, String codigoAvion, String origen, String destino, double precio, LocalDate diaVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        Listas.CiudadesOrigen.add(origen);
        this.destino = destino;
        Listas.CiudadesDestino.add(destino);
        this.CodigoAvion = codigoAvion;
        this.precio = precio;
        this.diaVuelo = diaVuelo;
        this.estado = EstadoVuelo.EN_ESPERA;
        this.buscarAero(codigoAvion);
    }

    
    public void buscarAero(String codigo){
        this.nombreAerolinea = null;
        for(Avion a: Listas.listaAviones){
            if(a.getCodigo().equals(codigo)){
                this.nombreAerolinea = a.getAerolinea();
            }
        }
    }
    
    
    
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
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

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public String getCodigoAvion() {
        return CodigoAvion;
    }

    public void setCodigoAvion(String CodigoAvion) {
        this.CodigoAvion = CodigoAvion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getDiaVuelo() {
        return diaVuelo;
    }

    public void setDiaVuelo(LocalDate diaVuelo) {
        this.diaVuelo = diaVuelo;
    }

    public EstadoVuelo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVuelo estado) {
        this.estado = estado;
    }
    
    
    
    public String[] getDatos(){
        String datos[] = new String[7];
        datos[0]= this.codigoVuelo;
     
        datos[2]= this.CodigoAvion;
        
        return datos;
    }
    
    
    private void textoEstado(){
       switch(this.estado){
            case EN_ESPERA:
                this.textEstado="En espera";
            case COMPLETADO:
                this.textEstado="Completado";
            case CANCELADO:
                this.textEstado="";
            case RETRASADO:
                this.textEstado="En espera";
        }}
    
}
