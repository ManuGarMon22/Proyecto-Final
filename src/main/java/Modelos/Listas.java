/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Modelos.ArticulosDeViaje.*;
import Modelos.Persona.*;
import java.util.ArrayList;

/**
 *
 * @author manu
 */
public class Listas {
    public static ArrayList<Aeropuerto> listaAeropuetos = new ArrayList<Aeropuerto>();
    public static ArrayList<Aerolinea> listaAerolineas = new ArrayList<Aerolinea>(); 
    public static ArrayList<Avion> listaAviones = new ArrayList<Avion>();
    public static ArrayList<Reservacion> listaReservaciones = new ArrayList<Reservacion>();
    public static ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();
    public static ArrayList<Boleto> listaBoletos = new ArrayList<Boleto>(); 
    public static ArrayList<Trabajador> listaOperadores = new ArrayList<Trabajador>();
    public static ArrayList<Trabajador> listaAdministradores = new ArrayList<Trabajador>();
    public static ArrayList<Trabajador> listaGerentes = new ArrayList<Trabajador>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    public static ArrayList<String> CiudadesOrigen = new ArrayList<String>();
    public static ArrayList<String> CiudadesDestino = new ArrayList<String>();
    public static ArrayList<Tarjeta> listaTarjetas = new ArrayList<Tarjeta>();
    public static ArrayList<Pasaporte> pasaportes = new ArrayList<Pasaporte>(); 
    public static ArrayList<String> listaPaises = new ArrayList<String>();

    public static ArrayList<Aeropuerto> getListaAeropuetos() {
        return listaAeropuetos;
    }

    public static ArrayList<Aerolinea> getListaAerolineas() {
        return listaAerolineas;
    }

    public static ArrayList<Avion> getListaAviones() {
        return listaAviones;
    }

    public static ArrayList<Reservacion> getListaReservaciones() {
        return listaReservaciones;
    }

    public static ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public static ArrayList<Boleto> getListaBoletos() {
        return listaBoletos;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static ArrayList<String> getCiudadesOrigen() {
        return CiudadesOrigen;
    }
    
    public static void llenarPaises(){
        
        Listas.listaPaises.add("Afganistán");
        Listas.listaPaises.add("Albania");
        Listas.listaPaises.add("Alemania");
        Listas.listaPaises.add("Andorra");
        Listas.listaPaises.add("Angola");
        Listas.listaPaises.add("Antigua y Barbuda");
        Listas.listaPaises.add("Arabia Saudita");
        Listas.listaPaises.add("Argelia");
        Listas.listaPaises.add("Argentina");
        Listas.listaPaises.add("Armenia");
        Listas.listaPaises.add("Australia");
        Listas.listaPaises.add("Austria");
        Listas.listaPaises.add("Azerbaiyán");
        Listas.listaPaises.add("Bahamas");
        Listas.listaPaises.add("Bangaldes");
        Listas.listaPaises.add("Barbados");
        Listas.listaPaises.add("Baréin");
        Listas.listaPaises.add("Bélgica");
        Listas.listaPaises.add("Belice");
        Listas.listaPaises.add("Benín");
        Listas.listaPaises.add("Bielorrusia");
        Listas.listaPaises.add("Birmania");
        Listas.listaPaises.add("Bolivia");
        Listas.listaPaises.add("Bosnia y Herzegovina");
        Listas.listaPaises.add("Botsuana");
        Listas.listaPaises.add("Brasil");
        Listas.listaPaises.add("Brunéi");
        Listas.listaPaises.add("Bulgaria");
        Listas.listaPaises.add("Burkina Faso");
        Listas.listaPaises.add("Burundi");
        Listas.listaPaises.add("Bután");
        Listas.listaPaises.add("Cabo Verde");
        Listas.listaPaises.add("Camboya");
        Listas.listaPaises.add("Camerún");
        Listas.listaPaises.add("Canadá");
        Listas.listaPaises.add("Catar");
        Listas.listaPaises.add("Chad");
        Listas.listaPaises.add("Chile");
        Listas.listaPaises.add("China");
        Listas.listaPaises.add("Chipre");
        Listas.listaPaises.add("Ciudad de Vaticano");
        Listas.listaPaises.add("Colombia");
        Listas.listaPaises.add("Comoras");
        Listas.listaPaises.add("Corea del Norte");
        Listas.listaPaises.add("Corea del Sur");
        Listas.listaPaises.add("Costa de Marfil");
        Listas.listaPaises.add("Costa Rica");
        Listas.listaPaises.add("Croacia");
        Listas.listaPaises.add("Cuba");
        Listas.listaPaises.add("Dinamarca");
        Listas.listaPaises.add("Dominicana");
        Listas.listaPaises.add("Ecuador");
        Listas.listaPaises.add("Egipto");
        Listas.listaPaises.add("El Salvador");
        Listas.listaPaises.add("Emiratos Árabes Unidos");
        Listas.listaPaises.add("Eritrea");
        Listas.listaPaises.add("Eslovaquia");
        Listas.listaPaises.add("Eslovenia");
        Listas.listaPaises.add("España");
        Listas.listaPaises.add("Estados Unidos");
        Listas.listaPaises.add("Estonia");
        Listas.listaPaises.add("Etiopía");
        Listas.listaPaises.add("Filipinas");
        Listas.listaPaises.add("Finlandia");
        Listas.listaPaises.add("Fiyi");
        Listas.listaPaises.add("Francia");
        Listas.listaPaises.add("Gabón");
        Listas.listaPaises.add("Gambia");
        Listas.listaPaises.add("Georgia");
        Listas.listaPaises.add("Ghana");
        Listas.listaPaises.add("Granada");
        Listas.listaPaises.add("Grecia");
        Listas.listaPaises.add("Guatemala");
        Listas.listaPaises.add("Guyana");
        Listas.listaPaises.add("Guinea");
        Listas.listaPaises.add("Guinea Ecuatorial");
        Listas.listaPaises.add("Guinea-Bisáu");
        Listas.listaPaises.add("Haití");
        Listas.listaPaises.add("Honduras");
        Listas.listaPaises.add("Hungria");
        Listas.listaPaises.add("India");
        Listas.listaPaises.add("Indonesia");
        Listas.listaPaises.add("Irak");
        Listas.listaPaises.add("Irán");
        Listas.listaPaises.add("Irlanda");
        Listas.listaPaises.add("Islandia");
        Listas.listaPaises.add("Islas Marshall");
        Listas.listaPaises.add("Islas Salomón");
        Listas.listaPaises.add("Israel");
        Listas.listaPaises.add("Italia");
        Listas.listaPaises.add("Jamaica");
        Listas.listaPaises.add("Japón");
        Listas.listaPaises.add("Jordania");
        Listas.listaPaises.add("Kazajistán");
        Listas.listaPaises.add("Kenia");
        Listas.listaPaises.add("Kirguistán");
        Listas.listaPaises.add("Kiribati");
        Listas.listaPaises.add("Kuwait");
        Listas.listaPaises.add("Laos");
        Listas.listaPaises.add("Lesoto");
        Listas.listaPaises.add("Letonia");
        Listas.listaPaises.add("Líbano");
        Listas.listaPaises.add("Liberia");
        Listas.listaPaises.add("Libia");
        Listas.listaPaises.add("Liechtenstein");
        Listas.listaPaises.add("Lituania");
        Listas.listaPaises.add("Luxemburgo");
        Listas.listaPaises.add("Macedonia del Norte");
        Listas.listaPaises.add("Madagascar");
        Listas.listaPaises.add("Malasia");
        Listas.listaPaises.add("Malaui");
        Listas.listaPaises.add("Maldivas");
        Listas.listaPaises.add("Malí");
        Listas.listaPaises.add("Malta");
        Listas.listaPaises.add("Marruecos");
        Listas.listaPaises.add("Mauricio");
        Listas.listaPaises.add("Mauritania");
        Listas.listaPaises.add("México");
        Listas.listaPaises.add("Micronesia");
        Listas.listaPaises.add("Moldavia");
        Listas.listaPaises.add("Mónaco");
        Listas.listaPaises.add("Mongolia");
        Listas.listaPaises.add("Montenegro");
        Listas.listaPaises.add("Mozambique");
        Listas.listaPaises.add("Namibia");
        Listas.listaPaises.add("Nauru");
        Listas.listaPaises.add("Nepal");
        Listas.listaPaises.add("Nicaragua");
        Listas.listaPaises.add("Níger");
        Listas.listaPaises.add("Nigeria");
        Listas.listaPaises.add("Noruega");
        Listas.listaPaises.add("Nueva Zelanda");
        Listas.listaPaises.add("Omán");
        Listas.listaPaises.add("Paises Bajos");
        Listas.listaPaises.add("Pakistán");
        Listas.listaPaises.add("Palaos");
        Listas.listaPaises.add("Panamá");
        Listas.listaPaises.add("Papúa Nueva Guinea");
        Listas.listaPaises.add("Paraguay");
        Listas.listaPaises.add("Perú");
        Listas.listaPaises.add("Polonia");
        Listas.listaPaises.add("Portugal");
        Listas.listaPaises.add("Reino Unido");
        Listas.listaPaises.add("Republica Centroafricana");
        Listas.listaPaises.add("República Checa");
        Listas.listaPaises.add("República del Congo");
        Listas.listaPaises.add("República Democrática del Congo");
        Listas.listaPaises.add("República Dominicana");
        Listas.listaPaises.add("Ruanda");
        Listas.listaPaises.add("Rumania");
        Listas.listaPaises.add("Rusia");
        Listas.listaPaises.add("Samoa");
        Listas.listaPaises.add("San Cristóbal y Nieves");
        Listas.listaPaises.add("San Marino");
        Listas.listaPaises.add("San Vicente y las Granadinas");
        Listas.listaPaises.add("Santa Lucía");
        Listas.listaPaises.add("Santo Tomé y Príncipe");
        Listas.listaPaises.add("Senegal");
        Listas.listaPaises.add("Serbia");
        Listas.listaPaises.add("Seychelles");
        Listas.listaPaises.add("Sierra Leona");
        Listas.listaPaises.add("Singapur");
        Listas.listaPaises.add("Siria");
        Listas.listaPaises.add("Somalia");
        Listas.listaPaises.add("Sri Lanka");
        Listas.listaPaises.add("Suazilandia");
        Listas.listaPaises.add("Sudáfrica");
        Listas.listaPaises.add("Sudán");
        Listas.listaPaises.add("Sudán del Sur");
        Listas.listaPaises.add("Suecia");
        Listas.listaPaises.add("Suiza");
        Listas.listaPaises.add("Surinam");
        Listas.listaPaises.add("Tailandia");
        Listas.listaPaises.add("Tanzania");
        Listas.listaPaises.add("Tayikistán");
        Listas.listaPaises.add("Timor Oriental");
        Listas.listaPaises.add("Togo");
        Listas.listaPaises.add("Tonga");
        Listas.listaPaises.add("Trinidad y Tobago");
        Listas.listaPaises.add("Túnez");
        Listas.listaPaises.add("Turkmenistán");
        Listas.listaPaises.add("Turquía");
        Listas.listaPaises.add("Tuvalu");
        Listas.listaPaises.add("Ucrania");
        Listas.listaPaises.add("Uganda");
        Listas.listaPaises.add("Uruguay");
        Listas.listaPaises.add("Uzbekistán");
        Listas.listaPaises.add("Vanuatu");
        Listas.listaPaises.add("Venezuela");
        Listas.listaPaises.add("Vietnam");
        Listas.listaPaises.add("Yemen");
        Listas.listaPaises.add("Yibuti");
        Listas.listaPaises.add("Zambia");
        Listas.listaPaises.add("Zimbabue");
        
        
        
    }
    
    
    
}
