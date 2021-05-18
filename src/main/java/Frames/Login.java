
package Frames;

import Modelos.Aerolinea;
import Modelos.Listas;
import Modelos.Persona.Trabajador;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JDialog implements ActionListener{
    
    private JPanel fondo;
    private JButton iniciar, cancelar;
    private JFrame vPrincipal; 
    private JTextField fieldUsuario;
    private JPasswordField fieldContraseña;
    private String usuario, contraseña;
    private int opcionboton; //1 = amin, 2 = gerencia, 3= operador, 0= login persona 
    private char[] tempContrasenia;
    
    public Login (JFrame vPrincipal, boolean opcion, int boton){
        super(vPrincipal, opcion);
        this.vPrincipal= vPrincipal;
        this.opcionboton = boton;
        this.setBounds(0,0,350, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null); 
        
        
       AgregarComponentes();
    }
    
    private void AgregarComponentes(){
        
        AgregarPanel();
        AgregarFields();
        AgregarLabels();
        AgregarBotones();
    }
    
    
    private void AgregarPanel(){
        
        fondo = new JPanel();//(LayoutManager) new ImageIcon(getClass().getResource("/main/java/Imagenes/login.jpg")));
        fondo.setBounds(0,0,350, 500);
        fondo.setLayout(null);
        add(fondo);
        
        
        
    }
    
    private void AgregarFields(){
        fieldUsuario = new JTextField("");
        fieldUsuario.setBounds(160, 150, 150, 40 );
        fondo.add(fieldUsuario);
        
        fieldContraseña = new JPasswordField("");
        fieldContraseña.setBounds(160, 200, 150, 40 );
        fondo.add(fieldContraseña);
    }
    
    private void AgregarLabels() {
        JLabel usu = new JLabel("Usuario:");
        usu.setBounds(50, 150, 70, 50);
        fondo.add(usu);
        
        JLabel con = new JLabel("Contraseña:");
        con.setBounds(50, 200, 120, 50);
        fondo.add(con);
    }
    
    private void AgregarBotones(){
        
            iniciar = new JButton("Aceptar");
            iniciar.setBounds(200, 400, 100, 50);
            iniciar.addActionListener(this);
            fondo.add(iniciar);

            cancelar = new JButton("Cancelar");
            cancelar.setBounds(70, 400, 100, 50);
            cancelar.addActionListener(this);
            fondo.add(cancelar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== cancelar){
            dispose();
            OpcionManejadorVuelo n = new OpcionManejadorVuelo(vPrincipal, false);
            n.setVisible(true);
            
        }else if(e.getSource() == iniciar){
            if(this.verificarUsuario()){
                if(this.contraseñaCorrecta(this.tempContrasenia)){
                AbrirVentana();
                    dispose();
                    vPrincipal.dispose();
                }else{
                    JOptionPane.showInternalMessageDialog(null, "Contraseña incorrecta. Por favor vuelva a intentarlo");
                    this.limpiarLabels();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nombre de usuario invalido");
                this.limpiarLabels();
            }
        }
    }
    
    private boolean verificarUsuario(){
        boolean existente = false;
            switch(this.opcionboton){
                case 1:
                    for(Trabajador t: Listas.listaAdministradores){
                        if(t.getNombre().equals(this.fieldUsuario.getText())){
                            existente = true;
                            this.tempContrasenia=t.getContrasenia();
                            break;
                        }
                    }
                    break;
                case 2:
                    for(Trabajador t: Listas.listaGerentes){
                        if(t.getNombre().equals(this.fieldUsuario.getText())){
                            existente = true;
                            this.tempContrasenia=t.getContrasenia();
                            break;
                        }
                    }
                    break;
                case 3:
                    for(Trabajador t: Listas.listaOperadores){
                        if(t.getNombre().equals(this.fieldUsuario.getText())){
                            existente = true;
                            this.tempContrasenia = t.getContrasenia();
                            break;
                        }
                    }
                    break;
            }
        
            
        
        return existente;
    }
    
    private boolean contraseñaCorrecta(char[] temp){
        boolean contra = true;
            char[] compara = this.fieldContraseña.getPassword();
            for(int i = 0; i< temp.length; i++ ){
                if(temp[i]!=compara[i]){
                    contra = false;
                    break;
                }
            }
      
        return contra;
    };

    private void AbrirVentana(){
        switch(this.opcionboton){
            case 1: 
                VentanaAdmin admin = new VentanaAdmin(this.vPrincipal);
                admin.setVisible(true);
                dispose();
                this.vPrincipal.dispose();
                break;
            case 2: 
                VentanaGerencia geren = new VentanaGerencia(this.vPrincipal  , false, buscarAerolinea(this.fieldUsuario.getText()));
                geren.setVisible(true);
                dispose();
                this.vPrincipal.dispose();
                break;
            case 3: 
                VentanaOperador opera = new VentanaOperador(this.vPrincipal, false, buscarAerolinea(this.fieldUsuario.getText()));
                opera.setVisible(true);
                dispose();
                this.vPrincipal.dispose();
                break;
            default:
        }
    
    }
    
    private void limpiarLabels(){
        this.fieldUsuario.setText("");
        this.fieldContraseña.setText("");
    }
    
    private Aerolinea buscarAerolinea(String usuario){
        Aerolinea r = null;
        for(Aerolinea t:Listas.listaAerolineas){
            if(this.opcionboton == 2){
            if(t.getGerente().getNombre().equals(usuario) && this.contraseñaCorrecta(this.tempContrasenia)){
                r = t;
                break;
            }}else if (this.opcionboton == 3){
            if(t.getOperador().getNombre().equals(usuario)&&this.contraseñaCorrecta(this.tempContrasenia)){
                r = t;
                break;
            }}
        }
        return r;
    }
    
}