/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Modelos.*;
import Modelos.ArticulosDeViaje.*;
import Modelos.Persona.*;
/**
 *
 * @author manu
 */
public class CreadorDeBinarios {
    
    public static final File  FILE_AEROPUERTO= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Aeropuertos");
    public static final File  FILE_AEROLINEA= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Aerolineas"); 
    public static final File  FILE_AVION= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Aviones"); 
    public static final File  FILE_VUELO= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Vuelos");
    public static final File  FILE_PASAPORTE= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Pasaportes");
    public static final File  FILE_TARJETA= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Tarjetas");
    public static final File  FILE_RESERVACION= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Reservaciones");
    public static final File  FILE_DISTANCIAS= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Distancias");
    public static final File  FILE_TRABAJADOR= new File("/home/manu/NetBeansProjects/Aeropuerto/ArchivosBinarios/Trabajadores");
    
    
     
    public void guardarObjeto(ArrayList<Object> lista) throws IOException,FileNotFoundException{
        FileOutputStream fileOutput; 
        ObjectOutputStream salida;
        for (Object objetos : lista) {
            if(objetos instanceof Aeropuerto ){
                fileOutput = new FileOutputStream(FILE_AEROPUERTO+"/"+((Aeropuerto) objetos).getNombre());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Aerolinea ){
                fileOutput = new FileOutputStream(FILE_AEROLINEA+"/"+((Aerolinea)objetos).getNombre());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Avion ){
                fileOutput = new FileOutputStream(FILE_AVION+"/"+((Avion) objetos).getCodigo());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Vuelo){
                fileOutput = new FileOutputStream(FILE_VUELO+"/"+((Vuelo)objetos).getCodigoVuelo());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Pasaporte ){
                fileOutput = new FileOutputStream(FILE_PASAPORTE+"/"+((Pasaporte) objetos).getNumero());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Reservacion ){
                fileOutput = new FileOutputStream(FILE_RESERVACION+"/"+((Reservacion) objetos).getPasaporte());
                salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Tarjeta ){
                fileOutput = new FileOutputStream(FILE_TARJETA+"/"+((Tarjeta) objetos).getNumero());
                salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Trabajador ){
                fileOutput = new FileOutputStream(FILE_TRABAJADOR+"/"+((Trabajador) objetos).getNombre());
                salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(objetos);
            salida.close();
            }else if(objetos instanceof Distancia){
                fileOutput = new FileOutputStream(FILE_DISTANCIAS+"/"+((Distancia) objetos).getDestino());
                salida = new ObjectOutputStream(fileOutput);
            //salida.writeObject(objetos);
            salida.close();
            
            }else{
                
            }
            
            
        }
    }
}
