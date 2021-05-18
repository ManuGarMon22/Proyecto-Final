/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Persona;

import Enums.*;

/**
 *
 * @author manu
 */
public class Trabajador extends Persona {
    public static final String ADMIN = "ADMINISTRADOR";
    public static final String OPERADOR = "OPERADOR";
    public static final String GERENTE = "GERENTE";

    private TipoTrabajador trabajador;
    private char [] contrasenia;
    
    public Trabajador(String tipo,String nombre, String apellido, char[] contrasenia ) {
        super(nombre, apellido,2, 2021, "Octubre" );
        this.contrasenia = contrasenia;
        establecerTipo(tipo);
    }

    private void establecerTipo(String tipo) {
        switch(tipo){
            case ADMIN: this.trabajador= TipoTrabajador.ADMINISTRADOR;
                break;
            case OPERADOR: this.trabajador= TipoTrabajador.GERENTE_DE_AEROLINEA;
                break;
            case GERENTE: this.trabajador= TipoTrabajador.OPERADOR_DE_VUELO;
                break;
        }
    }

    public TipoTrabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TipoTrabajador trabajador) {
        this.trabajador = trabajador;
    }

    public char[] getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(char[] contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
}
