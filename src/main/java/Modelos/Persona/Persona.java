/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Persona;


import java.io.Serializable;

/**
 *
 * @author manu
 */
public abstract class Persona implements Serializable {
    
    private String nombre, apellido, estadoCivil, sexo; 

    private int diaNacimiento, añoNacimiento; 
    private String mesNacimiento;

    public Persona(String nombre, String apellido, int diaNacimiento, int añoNacimiento, String mesNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.añoNacimiento = añoNacimiento;
        this.mesNacimiento = mesNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
 