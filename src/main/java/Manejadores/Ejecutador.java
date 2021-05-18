/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import Frames.*;
import Modelos.*;
import Modelos.Persona.Trabajador;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author manu
 */
public class Ejecutador {
    

    
    public void Inicio(){
        
        Listas.llenarPaises();
        double precio = 12.4;
        
        Vuelo x= new Vuelo("E23", "a43","Guatemala", "Barcelonaa", precio  , dia() );
        Vuelo y= new Vuelo("E13", "213","Guatemala", "Madrid", precio  , dia() );
        Listas.listaVuelos.add(x);
        Listas.listaVuelos.add(y);
        
        char[]contrasenia = {'w','r'};
        Trabajador admin = new Trabajador("1", "wr", "Garcia",contrasenia);
        Listas.listaAdministradores.add(admin);
        
        Acceso acceso = new Acceso();
        acceso.setVisible(true);
    }
    
    LocalDate dia(){
        return LocalDate.of(2021, 12, 13);
    }
}
