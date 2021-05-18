/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Modelos.Listas;
import Modelos.Vuelo;
import Enums.*;
import Modelos.Aerolinea;
import Modelos.Avion;
import java.io.FileNotFoundException;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manu
 */
public class VentanaOperador extends JFrame {

    private boolean admin, seleccion; 
    private JFrame acceso, principal;
    private DefaultTableModel listaVuelos = new DefaultTableModel();
    private Vuelo vueloSeleccionado;
    private int numeroVuelo;
    private ListSelectionListener clickTabla;
    private Aerolinea aero;
    
    
    public VentanaOperador(JFrame acceso, boolean admin, Aerolinea aero) {
        initComponents();
        this.principal = acceso;
        this.admin = admin;
        this.acceso = acceso;
        this.jMenuAdmin.setVisible(admin);
        this.jMenuItemAdmin.setVisible(admin);
        this.aero = aero;
        
        if(acceso instanceof VentanaAdmin){
            this.principal = ((VentanaAdmin) acceso).getAcceso();
        }else{
            this.principal = acceso;
        }
        llenarListaVuelos(this.tablaVuelos);
    }
    
    public VentanaOperador(JFrame acceso, JFrame prin, boolean admin, boolean gerente, Aerolinea aero  ) {
        initComponents();
        this.principal = prin;
        this.admin = admin;
        this.acceso = acceso;
        this.jMenuAdmin.setVisible(gerente);
        this.jMenuItemAdmin.setVisible(admin);
        this.aero = aero;
        
        if(acceso instanceof VentanaAdmin){
            this.principal = ((VentanaAdmin) acceso).getAcceso();
        }else{
            this.principal = acceso;
        }
        llenarListaVuelos(this.tablaVuelos);
    }

    
    
    
    private void llenarListaVuelos(JTable tabla){
        listaVuelos = new DefaultTableModel();
        tabla.setModel(listaVuelos);
        tablaVuelos.getSelectionModel().addListSelectionListener(clickTabla);
        
        
        
        listaVuelos.addColumn("Codigo");
        listaVuelos.addColumn("Estado");
        listaVuelos.addColumn("Cod. Avion");
        listaVuelos.addColumn("Aero. Origen");
        listaVuelos.addColumn("Aero. Destino");
        listaVuelos.addColumn("Precio de Boleto");
        listaVuelos.addColumn("Fecha");
        
        
        
        for(Vuelo v: Listas.listaVuelos){
            if(v.getNombreAerolinea().equals(this.aero.getNombre())){
            listaVuelos.addRow(new Object[]{v.getCodigoVuelo(), v.getEstado(), v.getCodigoAvion(), v.getOrigen(), v.getDestino(), v.getPrecio(), v.getDiaVuelo()});            
            }
        }
        
        this.tablaVuelos.setEnabled(true);
        
    }
    
    
    
    private void BuscarVuelo(String numeroVuelo){
        for(Vuelo v: Listas.listaVuelos){
            if(v.getCodigoVuelo().equals(numeroVuelo)){
            vueloSeleccionado = v;
            seleccion = true;
            this.jTextFieldVuelo.setText(vueloSeleccionado.getCodigoVuelo());
            break;
            }
        }
    }

    
    public Avion buscarAvion(String x){
        Avion avion = null;
        for(Avion r: Listas.listaAviones){
            if(r.getCodigo().equals(x)){
            avion = r;
            }
        }
        
        return avion;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        scrollTabla = new javax.swing.JScrollPane();
        tablaVuelos = new javax.swing.JTable();
        jButtonVolar = new javax.swing.JButton();
        jButtonPosponer = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabelAcciones = new javax.swing.JLabel();
        jLabelSeleccion = new javax.swing.JLabel();
        jTextFieldVuelo = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu = new javax.swing.JMenu();
        ItemMenuPrincipal = new javax.swing.JMenuItem();
        ItemSalir = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItemAdmin = new javax.swing.JMenuItem();
        jMenuItemGerencia = new javax.swing.JMenuItem();
        jMenuItemOperador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operador de Vuelos");
        setResizable(false);

        tablaVuelos.setModel(listaVuelos);
        clickTabla = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){

                if(e.getValueIsAdjusting()){
                    numeroVuelo = tablaVuelos.getSelectedRow();

                    String num = (String)listaVuelos.getValueAt(numeroVuelo, 0);
                    String ori = (String)listaVuelos.getValueAt(numeroVuelo, 3);
                    String des = (String)listaVuelos.getValueAt(numeroVuelo, 4);
                    BuscarVuelo(num);

                    jTextFieldVuelo.setText("Vuelo #"+num+" De "+ori+" a "+des);
                }
            }
        };

        scrollTabla.setViewportView(tablaVuelos);

        jButtonVolar.setText("Iniciar");
        jButtonVolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolarActionPerformed(evt);
            }
        });

        jButtonPosponer.setText("Posponer");
        jButtonPosponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPosponerActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButton4.setText("Ver Asientos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabelAcciones.setText("Acciones del Vuelo:");

        jLabelSeleccion.setText("Vuelo Selecionado:");

        jTextFieldVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVueloActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("Crear Un Vuelo");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelSeleccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVuelo))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAcciones)
                            .addComponent(jButtonVolar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jButtonPosponer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
            .addComponent(scrollTabla, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jLabelAcciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPosponer)
                        .addComponent(jButtonCancelar)
                        .addComponent(jButton4))
                    .addComponent(jButtonVolar))
                .addGap(16, 16, 16))
        );

        JMenu.setText("Opciones");

        ItemMenuPrincipal.setText("Volver a Inicio");
        ItemMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuPrincipalActionPerformed(evt);
            }
        });
        JMenu.add(ItemMenuPrincipal);

        ItemSalir.setText("Salir");
        ItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSalirActionPerformed(evt);
            }
        });
        JMenu.add(ItemSalir);

        jMenuBar1.add(JMenu);

        jMenuAdmin.setText("Ventanas");

        jMenuItemAdmin.setText("Adminisitracion");
        jMenuItemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdminActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemAdmin);

        jMenuItemGerencia.setText("Gerencia de Aerolinea");
        jMenuItemGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciaActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemGerencia);

        jMenuItemOperador.setText("Operador de Vuelos");
        jMenuItemOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOperadorActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemOperador);

        jMenuBar1.add(jMenuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuPrincipalActionPerformed
        this.principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItemMenuPrincipalActionPerformed

    private void ItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Vuelva Pronto");
        System.exit(0);
    }//GEN-LAST:event_ItemSalirActionPerformed

    private void jMenuItemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdminActionPerformed
        this.acceso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemAdminActionPerformed

    private void jMenuItemGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciaActionPerformed
        VentanaGerencia geren = new VentanaGerencia(this.acceso, this.principal, admin, this.aero);
        geren.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemGerenciaActionPerformed

    private void jMenuItemOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOperadorActionPerformed
        JOptionPane.showMessageDialog(null, "Ya se encuantre en la ventana seleccionada");
    }//GEN-LAST:event_jMenuItemOperadorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String avion = this.vueloSeleccionado.getCodigoAvion();
        Avion r = this.buscarAvion(avion);
        AsientosImagen asisentos = new AsientosImagen(this, true, r);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonVolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolarActionPerformed
       if(seleccion){
           if(vueloSeleccionado.getEstado()== EstadoVuelo.EN_ESPERA || vueloSeleccionado.getEstado()== EstadoVuelo.RETRASADO){
               
            AnimacionVuelo volar = new AnimacionVuelo();
            volar.setVisible(true);
            volar.hilo.run();
            volar.dispose();
            this.vueloSeleccionado.setEstado(EstadoVuelo.COMPLETADO);
            JOptionPane.showInternalMessageDialog(null, "Vuelo #"+vueloSeleccionado.getCodigoVuelo()+ " completado con exito");
            seleccion =false;
            }else if(vueloSeleccionado.getEstado() == EstadoVuelo.CANCELADO){
                JOptionPane.showInternalMessageDialog(null, "No se puede iniciar un vuelo cancelado");
            }else{
            JOptionPane.showInternalMessageDialog(null, "No se puede iniciar un vuelo completado");     
            }
       }else{
           JOptionPane.showInternalMessageDialog(null, "no se ha seleccionado un vuelo aun. por favor elija ");
       }
       this.llenarListaVuelos(tablaVuelos);
       this.tablaVuelos.setModel(listaVuelos);
       this.tablaVuelos.setEnabled(true);
        
    }//GEN-LAST:event_jButtonVolarActionPerformed

    private void jTextFieldVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVueloActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        CrearVuelo vuelo = new CrearVuelo(this, true);
        vuelo.setVisible(true);

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonPosponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPosponerActionPerformed
       if(seleccion){
           if(vueloSeleccionado.getEstado()== EstadoVuelo.EN_ESPERA){
            this.vueloSeleccionado.setEstado(EstadoVuelo.RETRASADO);
            JOptionPane.showInternalMessageDialog(null, "Vuelo #"+vueloSeleccionado.getCodigoVuelo()+ " retrasado con exito");
            seleccion =false;
            }else if(vueloSeleccionado.getEstado() == EstadoVuelo.CANCELADO){
                JOptionPane.showInternalMessageDialog(null, "No se puede retrasar un vuelo cancelado");
            }else if(vueloSeleccionado.getEstado() == EstadoVuelo.RETRASADO){
                JOptionPane.showInternalMessageDialog(null, "No se puede retrasar un vuelo retrasado");
            }else{
            JOptionPane.showInternalMessageDialog(null, "No se puede retrasar un vuelo completado");     
            }
       }else{
           JOptionPane.showInternalMessageDialog(null, "no se ha seleccionado un vuelo aun. por favor elija ");
       }
    }//GEN-LAST:event_jButtonPosponerActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       if(seleccion){
           if(vueloSeleccionado.getEstado()== EstadoVuelo.EN_ESPERA || vueloSeleccionado.getEstado()== EstadoVuelo.RETRASADO){
            this.vueloSeleccionado.setEstado(EstadoVuelo.CANCELADO);
            JOptionPane.showInternalMessageDialog(null, "Vuelo #"+vueloSeleccionado.getCodigoVuelo()+ " cancelado con exito");
            seleccion =false;
            }else if(vueloSeleccionado.getEstado() == EstadoVuelo.CANCELADO){
                JOptionPane.showInternalMessageDialog(null, "No se puede cancelar un vuelo cancelado");
            }else{
            JOptionPane.showInternalMessageDialog(null, "No se puede cancelar un vuelo completado");     
            }
       }else{
           JOptionPane.showInternalMessageDialog(null, "no se ha seleccionado un vuelo aun. por favor elija ");
       }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOperador(null, true, null).setVisible(true);
            }
        });
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuPrincipal;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JMenu JMenu;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPosponer;
    private javax.swing.JButton jButtonVolar;
    private javax.swing.JLabel jLabelAcciones;
    private javax.swing.JLabel jLabelSeleccion;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAdmin;
    private javax.swing.JMenuItem jMenuItemGerencia;
    private javax.swing.JMenuItem jMenuItemOperador;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldVuelo;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tablaVuelos;
    // End of variables declaration//GEN-END:variables
}
