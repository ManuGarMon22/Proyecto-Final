/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author manu
 */
public class Acceso extends JFrame implements ActionListener{
    
    private JPanel base;
    private JButton accesoCliente, accesoAdmin;
    
    public Acceso(){
        
        this.setTitle("Aeropuerto");
        this.setBounds(0,0,600,500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        AgregarComponentes();
        
        
    }
    
    
    private void AgregarComponentes(){
        this.base = new JPanel();
        this.base.setLayout(null);
        this.setBackground(new Color(0,0,0));
        this.getContentPane().add(this.base);
        
        
        ImageIcon fondo = new ImageIcon("Imagenes/Acceso.jpeg");
        JLabel Imagen = new JLabel();
        Imagen.setIcon(fondo);
        Imagen.setLocation(0,0);
        base.add(Imagen);
        
        AgregarEtiquetas();
        AgregarBotones();
    }
    
    
    private void AgregarEtiquetas(){
        
        JLabel logo = new JLabel();        
        JLabel instrucciones = new JLabel("Por favor, haga click en el boton de \nla ventana a la cual desea acceder");
        instrucciones.setLocation(350, 50);
        this.base.add(instrucciones);
    }
    
    private void AgregarBotones(){
        this.accesoCliente = new JButton("Comprar Boleto");
        this.accesoCliente.setBounds(350, 160, 220 , 60);
        this.accesoCliente.addActionListener(this);
        this.base.add(this.accesoCliente);
        
        this.accesoAdmin = new JButton("Manejo de Aeropuertos");
        this.accesoAdmin.setBounds(350, 225, 220 , 60);
        this.accesoAdmin.addActionListener(this);
        this.base.add(this.accesoAdmin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== accesoAdmin){
            OpcionManejadorVuelo mv = new OpcionManejadorVuelo(this, true);
            mv.setVisible(true);
        }else if(e.getSource() == accesoCliente){
            VentanaCompraBoletos boletos = new VentanaCompraBoletos(this);
            boletos.setVisible(true);
            dispose();
        }
    }
    
    
   
}
