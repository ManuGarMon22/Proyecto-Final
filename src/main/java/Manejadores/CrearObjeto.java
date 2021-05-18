/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import Archivos.CreadorDeBinarios;
import Modelos.*;
import Modelos.ArticulosDeViaje.*;
import Modelos.Persona.Trabajador;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author manu
 */
public class CrearObjeto {
    
    public static final String ADMIN = "ADMINISTRADOR";
    public static final String OPERADOR = "OPERADOR";
    public static final String GERENTE = "GERENTE";
    
    
    public static Vuelo vueloNuevo(String datos[]){
        Vuelo vuelo = null;
        if(datos.length == 6){
        double precio = Double.parseDouble(datos[4]);
        if(validacionVuelo(datos) && precio >=0){
            vuelo = new Vuelo(datos[0],datos[1],datos[2],datos[3], precio, darFormatoAFecha(datos[5]));        
        }
        }
        return vuelo;
    }
    
    public static Trabajador trabajadorNuevo(String[] datos, char[] contrasenia){
        Trabajador tra = null;
        if(datos.length == 3){
        tra = new Trabajador(datos[0], datos[1], datos[2], contrasenia);
        }
        return tra; 
    } 
    
    public static LocalDate darFormatoAFecha(String fechaCadena){
        String[] fechaDividida=fechaCadena.split("/");
        int dia = Integer.valueOf(fechaDividida[0]);
        int mes = Integer.valueOf(fechaDividida[1]);
        int anio = Integer.valueOf(fechaDividida[2]);
        return LocalDate.of(anio, mes, dia);
    }
    
    public static Avion avionNuevo(String [] datos){
        Avion avion = null;
        if(datos.length ==6){
            int capacidad = Integer.parseInt(datos[3]);
            double gasMax = Double.parseDouble(datos[4]);
            double gasM = Double.parseDouble(datos[5]);
            if(gasMax>gasM){
                avion =new Avion(datos[0],datos[1],datos[2],capacidad,gasMax,gasM);        
            }    
        }
        
        return avion;
    }

    public static Aeropuerto aeropuertoNuevo(String[] campos) {
        Aeropuerto aeropuerto = null;
        if(campos.length ==3){
        aeropuerto = new Aeropuerto(campos[0], campos[1], campos[2]);
        }
        return aeropuerto;
    }

    public static Aerolinea aerolineaNueva(String[] campos) {
        Aerolinea aero = null;
        if(campos.length == 2 ){
            if (buscarAeropuerto(campos[0])){
            aero = new Aerolinea(campos[0], campos[1]);
            }
        }
        return aero;
    }

    public static Tarjeta tarjetaNueva(String[] campos) {
        Tarjeta tar = null;
             if(campos.length ==4){
                double dinero = Double.parseDouble(campos[3]);
                tar = new Tarjeta(campos[1], campos[2], dinero, campos[4]);
                 
             }
                
         return tar;       
    }

    public static Pasaporte pasaporteNuevo(String[] campos) {
        Pasaporte pasa = null;
        
        if(campos.length == 12){
        double millas = Double.parseDouble(campos[11]);
        
        if(!coincidenciaPasaporte(campos[0])&& millas >=0){
        pasa = new Pasaporte(campos[0], convercionDeContraseña(campos[1]), darFormatoAFecha(campos[2]), campos[3], campos[4], campos[5], campos[6], campos[7], darFormatoAFecha(campos[8]),darFormatoAFecha(campos[9]), campos[10], millas);
        }else if(coincidenciaPasaporte(campos[0])){
            JOptionPane.showMessageDialog(null, "pasaporte no."+campos[0]+" no fue creado porque ya existe un pasaporte con ese numero");
        }
        }
        return pasa;
    }

    public static Reservacion reservacionNueva(String[] campos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void renovarPasaporte(String[] campos) throws IOException{
        if(campos.length ==2){
            for (Pasaporte p: Listas.pasaportes){
                if(p.getNumero().equals(campos[0])){
                    p.setVencimiento(darFormatoAFecha(campos[1]));
                    CreadorDeBinarios crear = new CreadorDeBinarios();
                    crear.guardarObjeto((ArrayList<Object>)(Object)Listas.pasaportes);
                    System.out.println(p.getVencimiento());
                }
            }
        } else{
            JOptionPane.showMessageDialog(null, "No se renovo el pasaporte");
        }
    }
    
    
    public static boolean buscarAeropuerto(String nombreAeropuerto){
        boolean x = false;
        for(Aeropuerto a : Listas.listaAeropuetos){
            if(nombreAeropuerto.equals(a.getNombre())){
            x = true;
            break;        
            }
        }
        return x;
    }

    public static boolean validacionVuelo(String[] datos){
        boolean x =true;
        for(Vuelo v : Listas.listaVuelos){
            if(datos[0].equals(v.getCodigoVuelo())){
            x = false;
            break;
            }
            if(datos[1].equals(v.getCodigoAvion())){
            x = false;
            break;
            }
        }
        return x;
    }
    
    public static char[] convercionDeContraseña(String contraseña){
        char[] nueva = new char[contraseña.length()];
        
        for(int i = 0; i <contraseña.length(); i++){
            nueva[i]= contraseña.charAt(i);
        }
                
        return nueva;
        
    }
    
    public static boolean coincidenciaPasaporte(String x){
       boolean w = false;
       
       for(Pasaporte p: Listas.pasaportes){
           if(x.equals(p.getNumero())){ // si un numero de pasaporte coincide 
            w = true;//volver el booleano verdadero
            break;                   //detern for
           }
       }
       return w; 
    }
    
}
