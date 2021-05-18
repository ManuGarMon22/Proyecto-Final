/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelos.*;
import Manejadores.CrearObjeto;
import Modelos.ArticulosDeViaje.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author manu
 */
public class LeerArchivosTexto {
    
    public static final String VUELO = "VUELO";
    public static final String AVION = "AVION";
    public static final String AEROLINEA = "AEROLINEA";
    public static final String AEROPUERTO = "AEROPUERTO";
    public static final String PASAPORTE = "PASAPORTE";
    public static final String RESERVACION = "RESERVACION";
    public static final String DISTANCIA = "DISTANCIA";
    public static final String TARJETA = "TARJETA";
    public static final String RENOVACION_PASAPORTE = "RENOVACION_PASAPORTE";
    
    
    private  ArrayList<Object> objetos;
   
    public ArrayList<Object> leerFichero(File archivo,JTextArea text) throws FileNotFoundException, IOException {
        objetos = new ArrayList<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
            CrearObjeto(linea);
            //pasamos el texto a objeto
            text.append("\n"+linea);
        }
        fr.close(); 
        return objetos;
    }
    
    public void CrearObjeto(String linea){
    String[] lineaDividida = new String[9];
            lineaDividida[0]= linea.substring(0, VUELO.length());
            lineaDividida[1]= linea.substring(0, AVION.length());
            lineaDividida[2]= linea.substring(0,AEROPUERTO.length());
            lineaDividida[3]= linea.substring(0,AEROLINEA.length());
            lineaDividida[4]= linea.substring(0,TARJETA.length());
            lineaDividida[5]= linea.substring(0,PASAPORTE.length());
            lineaDividida[6]= linea.substring(0,DISTANCIA.length());
            lineaDividida[7]= linea.substring(0,RENOVACION_PASAPORTE.length());
            lineaDividida[8]= linea.substring(0,RESERVACION.length());
            
            System.out.println(lineaDividida[0] );
                    
            
        System.out.println(lineaDividida[0]);
        if (lineaDividida[0].equals(VUELO)){
            String[] campos = separarCampos(6, linea);
            Vuelo vuelo = CrearObjeto.vueloNuevo(campos);
            if (vuelo != null){
            Listas.listaVuelos.add(vuelo);
            objetos.add(vuelo);
            }
            
        }else if (lineaDividida[1].equals(AVION)){
            String[] campos = separarCampos(6 , linea);
            Avion avion = CrearObjeto.avionNuevo(campos);
            if (avion != null){
            Listas.listaAviones.add(avion);
            objetos.add(avion);
            }
        }else if (lineaDividida[2].equals(AEROPUERTO)){
            String[] campos = separarCampos(11 , linea);
            Aeropuerto aeropuerto = CrearObjeto.aeropuertoNuevo(campos);
            if (aeropuerto != null){
            Listas.listaAeropuetos.add(aeropuerto);
            objetos.add(aeropuerto);
            }
        }else if (lineaDividida[3].equals(AEROLINEA)){
            String[] campos = separarCampos(10 , linea);
            Aerolinea aerolinea = CrearObjeto.aerolineaNueva(campos);
            if (aerolinea != null){
            Listas.listaAerolineas.add(aerolinea);
            objetos.add(aerolinea);
            }
        }else if (lineaDividida[4].equals(TARJETA)){
            String[] campos = separarCampos(TARJETA.length()+1 , linea);
            Tarjeta tarjeta = CrearObjeto.tarjetaNueva(campos);
            if (tarjeta != null){
            Listas.listaTarjetas.add(tarjeta);
            objetos.add(tarjeta);
            }
        }else if (lineaDividida[5].equals(PASAPORTE)){
            String[] campos = separarCampos(PASAPORTE.length()+1 , linea);
            Pasaporte pasaporte = CrearObjeto.pasaporteNuevo(campos);
            if (pasaporte != null){
            Listas.pasaportes.add(pasaporte);
            objetos.add(pasaporte);
            }
        }else if (lineaDividida[6].equals(DISTANCIA)){
            String[] campos = separarCampos(DISTANCIA.length()+1 , linea);
            Aeropuerto distancia = CrearObjeto.aeropuertoNuevo(campos);
            objetos.add(distancia);
        }else if (lineaDividida[7].equals(RENOVACION_PASAPORTE)){
            String[] campos = separarCampos(RENOVACION_PASAPORTE.length()+1 , linea);
            
        try {
            CrearObjeto.renovarPasaporte(campos);
        } catch (IOException ex) {
            Logger.getLogger(LeerArchivosTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        }else if (lineaDividida[8].equals(RESERVACION)){
            String[] campos = separarCampos(RESERVACION.length()+1 , linea);
            
            Reservacion reservacion = CrearObjeto.reservacionNueva(campos);
            if (reservacion != null){
            Listas.listaReservaciones.add(reservacion);
            objetos.add(reservacion);
            }
            
        }
        
    
        
    }
    
    public String[] separarCampos(int cantidadLetras, String linea){
        String lineaDeCampos = linea.substring(cantidadLetras, (linea.length()-1));
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
    
    void buscarAeropuerto(){
    }
    
    void renovarPasaporte(){
        
    }
}
