/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.ArticulosDeViaje;


import Modelos.Persona.Persona;
import java.io.Serializable;
import java.time.LocalDate;


/**
 *
 * @author manu
 */
public class Pasaporte implements Serializable{
    
    private Persona dueño;
    private LocalDate vencimiento, emision, nacimiento;    
    private String pasiActual, numero;
    private final String nacionalidad;
    private double millasRecorridas;
    private char [] contrasenia;
    
    public Pasaporte(String numero, char[] contrasenia, LocalDate nacimiento, String nacionalidad, String EstadoCivil ,String Nombre,String Apellido, String Sexo, LocalDate Vencimiento, LocalDate emision, String PaisActual, double MillasRecorridas){
        this.numero = numero;
        this.contrasenia = contrasenia;
        this.nacionalidad = nacionalidad;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public LocalDate getEmision() {
        return emision;
    }

    public void setEmision(LocalDate emision) {
        this.emision = emision;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPasiActual() {
        return pasiActual;
    }

    public void setPasiActual(String pasiActual) {
        this.pasiActual = pasiActual;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getMillasRecorridas() {
        return millasRecorridas;
    }

    public void setMillasRecorridas(double millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }

    

    public char[] getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(char[] contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    

    
    
    
    
}
