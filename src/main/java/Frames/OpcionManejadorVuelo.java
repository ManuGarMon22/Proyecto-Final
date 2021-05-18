/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author manu
 */
public class OpcionManejadorVuelo extends JDialog implements ActionListener {
    
    private JPanel fondo; 
    private JFrame principal;
    private JButton administracion, gerencia, operador;
    
    public OpcionManejadorVuelo(JFrame parent, boolean modal){
        super(parent, modal);
        this.principal = parent;
        this.setBounds(0,0,520, 130);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        AgregarComponentes();
    }
    
    private void AgregarComponentes(){
        AgregarPanel();
        AgregarBotones();
    }
        
    
    private void AgregarPanel(){
        fondo = new JPanel();
        fondo.setLayout(null);
        fondo.setBounds(0,0,520, 130);
        
        add(fondo);
        
        
        
    }
    
    private void AgregarBotones(){
        administracion = new JButton("Administracion");
        administracion.setBounds(20, 20, 150, 50);
        administracion.addActionListener(this);
        fondo.add(administracion);
        
        gerencia = new JButton("Gerencia");
        gerencia.setBounds(185, 20, 150, 50);
        gerencia.addActionListener(this);
        fondo.add(gerencia);
        
        operador = new JButton("Operador");
        operador.setBounds(350, 20, 150, 50);
        operador.addActionListener(this);
        fondo.add(operador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==administracion ){
            dispose();
            Login log = new Login(principal, false, 1);
            log.setVisible(true);
        }else if(e.getSource()==gerencia ){
            dispose();
            Login log = new Login(principal, false, 2);
            log.setVisible(true);
        }else if(e.getSource()==operador ){
            dispose();
            Login log = new Login(principal, false, 3);
            log.setVisible(true);
        }
    }
    
     
}

