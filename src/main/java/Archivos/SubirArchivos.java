/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelos.*;
import Modelos.ArticulosDeViaje.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author manu
 */
public class SubirArchivos {
    
    public ArrayList<Object> leerObjetos() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Object> objetos = new ArrayList<>();
        String[]  archivos= CreadorDeBinarios.FILE_VUELO.list();
        ObjectInputStream lector;   
        System.out.println("Archivos:"+archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            String archivo = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(CreadorDeBinarios.FILE_VUELO+"/"+archivo));
            Vuelo v = (Vuelo)lector.readObject();
            objetos.add(v);
            lector.close();
        }
        archivos= CreadorDeBinarios.FILE_AVION.list();   
        System.out.println("Archivos:"+archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            String archivo = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(CreadorDeBinarios.FILE_AVION+"/"+archivo));
            Avion a = (Avion)lector.readObject();
            objetos.add(a);
            lector.close();
        }
        archivos= CreadorDeBinarios.FILE_AEROLINEA.list();   
        System.out.println("Archivos:"+archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            String archivo = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(CreadorDeBinarios.FILE_AEROLINEA+"/"+archivo));
            Aerolinea a = (Aerolinea)lector.readObject();
            objetos.add(a);
            lector.close();
        }
        archivos= CreadorDeBinarios.FILE_AEROPUERTO.list();   
        System.out.println("Archivos:"+archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            String archivo = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(CreadorDeBinarios.FILE_AEROPUERTO+"/"+archivo));
            Aeropuerto a = (Aeropuerto)lector.readObject();
            objetos.add(a);
            lector.close();
        }
        archivos= CreadorDeBinarios.FILE_PASAPORTE.list();   
        System.out.println("Archivos:"+archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            String archivo = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(CreadorDeBinarios.FILE_PASAPORTE+"/"+archivo));
            Pasaporte a = (Pasaporte)lector.readObject();
            objetos.add(a);
            lector.close();
        }
        
        return objetos;
        
    }
    
    
    
    
}
