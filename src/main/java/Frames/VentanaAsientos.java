/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Modelos.Asiento;
import Modelos.Avion;
import java.awt.*;
import javax.swing.*;



/**
 *
 * @author manu
 */
public class VentanaAsientos extends JPanel  {
    
    private Avion avion;
    
    private int  grama =0, agua=0, desierto=0;
    private int casillasHabilitadas, casillasCreadas;
    private JButton botones[]; // arreglo de botones
    
    private GridLayout cuadricula; 
   

    // constructor
    public VentanaAsientos(Avion j){
        this.avion = j;
        this.setLayout(null);
        this.setBounds(0,0, 650, 630 ); // establece el tamaño del marco
        
        
        
        ColocarBotones();
        HabilitarCasillasIniciales();
    } 
    
    private void ColocarBotones(){
        Asiento asientos[]= avion.getAsientos();
        int x = this.avion.getFilas();
        int y = this.avion.getColumnas();
        int total = x*y;
        int recorrido; 
        
        cuadricula = new GridLayout((x+1), y ); 
        setLayout( cuadricula );         
        botones = new JButton[total]; // crea arreglo de objetos JButton
        for ( int i = 0; i < 60; i++ ){
            botones[i] = new JButton();     
            botones[i].setEnabled(true);
            this.add( botones[i] ); // agrega boton a objeto JFrame
        } // fin de for
    }
    
    
    
    public void HabilitarCasillasIniciales(){
        for (int i = 0; i < 25; i++) {
            botones[i].setEnabled(true);
            
        }
        this.casillasHabilitadas = 25;
    }
    
    public void Superficie(int x, int asiento){
        
    }
  
    
}
