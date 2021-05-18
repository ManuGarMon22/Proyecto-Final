/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Enums.EstadoAsiento;
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
    private JButton botones[]; // arreglo de botones
    private JLabel pasillo[];
    
    private GridLayout cuadricula; 
   

    // constructor
    public VentanaAsientos(Avion j){
        this.avion = j;
        ColocarBotones();
        this.setBounds(0,0, 450, 550);
    } 
    
    private void ColocarBotones(){
        Asiento asientos[]= avion.getAsientos();
        int x = 50;
        int y = 5;
        int totalAsientos = asientos.length;
        int asientosColocados=0; 
        cuadricula = new GridLayout(x, y); 
        this.setLayout( cuadricula );         
 
        botones = new JButton[totalAsientos];
        pasillo = new JLabel[50];
        // crea arreglo de objetos JButton
        for ( int i = 0; i < 50; i++ ){
            for(int j = 0; j <2 ; j++){
                if(asientosColocados<totalAsientos){
                    botones[asientosColocados] = new JButton("No. "+(asientosColocados+1));
                    superficie(asientos[asientosColocados],botones[asientosColocados]);
                    botones[asientosColocados].setEnabled(true);
                    this.add( botones[asientosColocados] ); // agrega boton a objeto JFrame
                    asientosColocados+=1;
                }
            }
            if(asientosColocados<totalAsientos){
                pasillo[i] = new JLabel("pasillo");
                
                this.add(pasillo[i]);
            }
            for(int j = 0; j <2 ; j++){
                if(asientosColocados<totalAsientos){
                    botones[asientosColocados] = new JButton("No. "+(asientosColocados+1));
                    botones[asientosColocados].setText("No." +asientosColocados);
                    superficie(asientos[asientosColocados],botones[asientosColocados]);
                    botones[asientosColocados].setEnabled(true);
                    this.add( botones[asientosColocados] ); // agrega boton a objeto JFrame
                    asientosColocados +=1;
                }
            }
                               
        } // fin de for
    }
    
    
    public void superficie(Asiento a, JButton b){
        if(!a.getEstado()){
            b.setBackground(Color.RED);
        }else  
        if(a.getEstado()){
            b.setBackground(Color.GREEN);
    }
    }     
    
}
