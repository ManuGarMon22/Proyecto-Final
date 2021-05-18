/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimacionVuelo extends JDialog {
    private int x = 10; // posicion inicial para el avion en el eje x
    private int y = 250;// posicion inicial para el avion en el eje y
    private JPanel p1; // panel de fondo para el desplazamiento
    private JLabel avion; // etiquetal que lleva la imagen del avion en la animacion
    private JLabel partida; // etiqueta que tiene la imagen del punto de partida del avion en la animacion
    private JLabel destino; // etiqueta que tiene la imagen del punto de destino para la animacion |
    //final ImageIcon av = new ImageIcon(getClass().getResource("/Imagenes/Avion.png")); // imagen del avion a desplazar
    //final ImageIcon par = new ImageIcon(getClass().getResource("/Imagenes/partida.png")); // imagen del punto de partida
    //final ImageIcon lleg = new ImageIcon(getClass().getResource("/Imagenes/llegada.png")); // imagen del punto de llegada

    //constructor
    public AnimacionVuelo(){
        
        this.setSize(700,400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        componentes();
    }

    // iniciador de partes de la animacion
    public void componentes(){
    pa();
    desplazado();
    punto1();
    punto2();
    }

    // iniciador del panel principal de la animacion
    public void pa(){
        p1 = new panel();
        p1.setLayout(null);
        p1.setSize(this.getWidth(),this.getHeight());
        p1.setVisible(true);
        this.add(p1);
    }

    // panel con la imagen de fondo para la animacion del vuelo
    public class panel extends JPanel{
        private Image imagen;

        // creacion de la imagen de fondo del panel de la animacion usando paint
    public void paint(Graphics g){
      /* imagen = new ImageIcon(getClass().getResource("/Imagenes/Cielo.jpg")).getImage();
       g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
       setOpaque(false);// opacidad de la imagen desactivada para que sea visible
       super.paint(g);// llamado del metodo paint para poder dibujar la imagen
*/
        }
    }

    // hilo para controlar el desplazamiento del avion
    class vuelo implements Runnable{

        @Override
        public void run() {
            for(int i = 0; i< 31; i++){
                avion.setLocation(x,y);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null,"algo salio horriblemente mal xd ");
                }
                if(x < 295){
                x= x+ 19;
                y= y -10;
                }
                else{
                    x= x+ 19;
                    y = y+10;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimacionVuelo.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }
    Runnable r1 = new vuelo();
    Thread hilo = new Thread(r1);
    

    @Override
    public void dispose() {
        super.dispose(); //To change body of generated methods, choose Tools | Templates.
    }

    // etiqueta que se desplazara con la imagen del avion
    public void desplazado(){
        avion = new JLabel();
        avion.setHorizontalAlignment(SwingConstants.RIGHT);
        avion.setBounds(x,y,100,50);
        avion.setBackground(new Color(12,32,32));
        //avion.setIcon(new ImageIcon(av.getImage().getScaledInstance(avion.getWidth(),avion.getHeight(),Image.SCALE_SMOOTH)));
        p1.add(avion);
        hilo.start();
    }

    // etiqueta de punto de partida del avion
     public void punto1(){
        partida = new JLabel();
        partida.setHorizontalAlignment(SwingConstants.RIGHT);
        partida.setBounds(10,300,50,50);
        partida.setBackground(new Color(120,45,132));
        //partida.setIcon(new ImageIcon(par.getImage().getScaledInstance(partida.getWidth(),partida.getHeight(),Image.SCALE_SMOOTH)));
        p1.add(partida); // añadiendo etiqueta al panel
    }


    // indicador del punto a donde debe llegar al avion
    public void punto2(){
        destino = new JLabel();
        destino.setBounds(640,300,50,50);
        destino.setBackground(new Color(10,222,50));
       // destino.setIcon(new ImageIcon(lleg.getImage().getScaledInstance(destino.getWidth(),destino.getHeight(),Image.SCALE_SMOOTH)));
        p1.add(destino); // añadiendo etiqueta al panel
    }

}