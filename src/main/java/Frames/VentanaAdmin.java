/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Archivos.LeerArchivosTexto;
import Archivos.CreadorDeBinarios;
import Archivos.SubirArchivos;
import Modelos.Listas;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author manu
 */
public class VentanaAdmin extends javax.swing.JFrame {

    private LeerArchivosTexto leerTxt = new LeerArchivosTexto();   
    private CreadorDeBinarios crearBinario = new CreadorDeBinarios();
    private SubirArchivos subirArchivos = new SubirArchivos();
    private JFrame acceso;
    
    public VentanaAdmin(JFrame acceso) {
        initComponents();
        this.acceso = acceso;
        this.setBounds(0,0,525, 320);
        this.setLocationRelativeTo(null);
    }

    
    private String[] llenarComboBox(){
        String [] opciones = new String[3];
        
        opciones[0] = "Administrador";
        opciones[1] = "Gerente de Aerolinea";
        opciones[2] = "Operador de Vuelo";
        
        return opciones;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonTrabajador = new javax.swing.JButton();
        jButtonAvion = new javax.swing.JButton();
        jButtonAeropuerto = new javax.swing.JButton();
        jButtonSubirArchivos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArchivo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu = new javax.swing.JMenu();
        ItemMenuPrincipal = new javax.swing.JMenuItem();
        ItemSalir = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItemAdmin = new javax.swing.JMenuItem();
        jMenuItemGerencia = new javax.swing.JMenuItem();
        jMenuItemOperador = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemReporteAvion = new javax.swing.JMenuItem();
        jMenuItemReporteVuelos = new javax.swing.JMenuItem();
        jMenuItemReportePasajeros = new javax.swing.JMenuItem();
        jMenuItemAerolineas = new javax.swing.JMenuItem();
        jMenuItemAeropuertos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adminisitraci??n");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel3.setPreferredSize(new java.awt.Dimension(525, 230));
        jPanel3.setLayout(null);

        jLabel1.setText("Crear nuevo:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 15, 91, 15);

        jButtonTrabajador.setText("Trabajador");
        jButtonTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrabajadorActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTrabajador);
        jButtonTrabajador.setBounds(20, 40, 120, 53);

        jButtonAvion.setText("Avi??n");
        jButtonAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvionActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAvion);
        jButtonAvion.setBounds(150, 40, 90, 53);

        jButtonAeropuerto.setText("Aeropuerto");
        jButtonAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAeropuertoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAeropuerto);
        jButtonAeropuerto.setBounds(250, 40, 130, 53);

        jButtonSubirArchivos.setText("Subir Archivos");
        jButtonSubirArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubirArchivosActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSubirArchivos);
        jButtonSubirArchivos.setBounds(20, 180, 150, 48);

        jTextArchivo.setColumns(20);
        jTextArchivo.setRows(5);
        jScrollPane1.setViewportView(jTextArchivo);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(190, 110, 310, 130);

        jButton1.setText("Aerolinea");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(390, 40, 120, 50);

        JMenu.setText("Opciones");

        ItemMenuPrincipal.setText("Menu Principal");
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

        jMenu1.setText("Reportes");

        jMenuItemReporteAvion.setText("Avion");
        jMenuItemReporteAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReporteAvionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemReporteAvion);

        jMenuItemReporteVuelos.setText("Vuelos");
        jMenuItemReporteVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReporteVuelosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemReporteVuelos);

        jMenuItemReportePasajeros.setText("Pasajeros");
        jMenu1.add(jMenuItemReportePasajeros);

        jMenuItemAerolineas.setText("Aerolineas");
        jMenu1.add(jMenuItemAerolineas);

        jMenuItemAeropuertos.setText("Aeropuertos");
        jMenu1.add(jMenuItemAeropuertos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Vuelva Pronto");
        System.exit(0);
    }//GEN-LAST:event_ItemSalirActionPerformed

    private void jMenuItemGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciaActionPerformed
        EleccionAerolinea r = new EleccionAerolinea(this, true);
        r.setVisible(true);
        VentanaGerencia geren = new VentanaGerencia(this, true, r.getAerolineaSeleccionada()); 
        geren.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemGerenciaActionPerformed

    private void jMenuItemOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOperadorActionPerformed
        EleccionAerolinea r = new EleccionAerolinea(this, true);
        r.setVisible(true);
        VentanaOperador op = new VentanaOperador(this, true, r.getAerolineaSeleccionada());
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemOperadorActionPerformed

    private void ItemMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuPrincipalActionPerformed
        this.acceso.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItemMenuPrincipalActionPerformed

    private void jMenuItemReporteVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReporteVuelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemReporteVuelosActionPerformed

    private void jMenuItemReporteAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReporteAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemReporteAvionActionPerformed

    private void jMenuItemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdminActionPerformed
        JOptionPane.showMessageDialog(null, "Ya se encuantre en la ventana seleccionada");
    }//GEN-LAST:event_jMenuItemAdminActionPerformed

    private void jButtonSubirArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubirArchivosActionPerformed
         JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //aqui selecciono y guardo el FILE que va a utilizar el FileReader
            File fichero = fileChosser.getSelectedFile();
            try {
                ArrayList<Object> objetos = this.leerTxt.leerFichero(fichero, this.jTextArchivo);
                this.crearBinario.guardarObjeto(objetos);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonSubirArchivosActionPerformed

    private void jButtonTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrabajadorActionPerformed
        CrearTrabajador nuevo = new CrearTrabajador(this, true);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jButtonTrabajadorActionPerformed

    private void jButtonAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvionActionPerformed
       CrearAvion avion = new CrearAvion(this, true);
       avion.setVisible(true);
    }//GEN-LAST:event_jButtonAvionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearAerolinea a = new CrearAerolinea(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAeropuertoActionPerformed
        CrearAeropuerto aeropuerto = new CrearAeropuerto(this, true);
        aeropuerto.setVisible(true);
    }//GEN-LAST:event_jButtonAeropuertoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdmin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuPrincipal;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JMenu JMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAeropuerto;
    private javax.swing.JButton jButtonAvion;
    private javax.swing.JButton jButtonSubirArchivos;
    private javax.swing.JButton jButtonTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAdmin;
    private javax.swing.JMenuItem jMenuItemAerolineas;
    private javax.swing.JMenuItem jMenuItemAeropuertos;
    private javax.swing.JMenuItem jMenuItemGerencia;
    private javax.swing.JMenuItem jMenuItemOperador;
    private javax.swing.JMenuItem jMenuItemReporteAvion;
    private javax.swing.JMenuItem jMenuItemReportePasajeros;
    private javax.swing.JMenuItem jMenuItemReporteVuelos;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArchivo;
    // End of variables declaration//GEN-END:variables

    public JFrame getAcceso() {
        return acceso;
    }



}


