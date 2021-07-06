/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cartelera;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ClasesGlobales.*;
import Pelicula.PeliculaClass;
import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ObtenerPeliculas {
    private ConexionBD conexion;
    
    public ArrayList  ObtenerPelis( String consulta) {
        Statement sentenciaAux;//Objeto que se usa para usar ejecutar sentencias de SQL. Ejecuta una sentencia SQL simple que no tiene ningun parametro.
        ResultSet resultSetAux;//Contiene los resultados de una consulta SQL. Mantiene un cursor apuntando a su fila de datos actual. 
        ResultSetMetaData rsMd; //Metodo que obtiene el numero, tipo y propiedades de las columnas de un ResultSet.
        int cantidadColumnas;
        ArrayList<PeliculaClass> peliculas = new ArrayList<PeliculaClass>(); //creamos el array de peliculas


        try {
            // .createStatement(); //Instanciamos el Statement.
            sentenciaAux = conexion.ConectarLaBD().getConexion().createStatement();
            resultSetAux = sentenciaAux.executeQuery(consulta); //Instanciamos el resultSet, en donde se guardan los resultados de la sentencia.
            rsMd = resultSetAux.getMetaData(); //Instanciamos el ResultSetMetaData con la informacion del ResultSet.
            cantidadColumnas = rsMd.getColumnCount();//Obtenemos el numero de columnas de la tabla. 
            
            
            while (resultSetAux.next()) {//con el while se recorren las filas. Se mueve verticalmente  
               
                PeliculaClass pelicula = new PeliculaClass();
                for (int i = 0; i < cantidadColumnas; i++) {//con el for se recorren las columnas. Se mueve horizontalmente
                    if(i == 0){
                       pelicula.setId(resultSetAux.getString(i + 1));
                    }
                    if(i == 1){
                       pelicula.setNombrePeli(resultSetAux.getString(i + 1)); 
                    }
                    if(i == 2){
                        pelicula.setFechaEstreno(resultSetAux.getString(i + 1));
                    }
                    if(i == 3){
                         pelicula.setHoraInicio(resultSetAux.getString(i + 1));
                    }
                    if(i == 4){
                        pelicula.setDuracion(resultSetAux.getString(i + 1));
                    }
                    if(i == 5){
                        pelicula.setImagen(resultSetAux.getString(i + 1));
                    }
                    if(i == 6){
                        pelicula.setCategoria(resultSetAux.getString(i + 1));
                    }
                    if(i == 7){
                         pelicula.setClasificacion(resultSetAux.getString(i + 1));
                    }
                    if(i == 8){
                         pelicula.setIdioma(resultSetAux.getString(i + 1));
                    }
                }
                peliculas.add(pelicula);
              
            }

            sentenciaAux.close();
            resultSetAux.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
       return peliculas;
    }

}
