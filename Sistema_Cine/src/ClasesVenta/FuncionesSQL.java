/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVenta;

import ClasesGlobales.ConexionBD;
import Funcion.FuncionClass;
import Pelicula.PeliculaClass;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTOPHERGUERRA
 */
public class FuncionesSQL {

    private ConexionBD conexion;

    public ArrayList obtenerFunciones(String consulta) {
        Statement sentenciaAux;//Objeto que se usa para usar ejecutar sentencias de SQL. Ejecuta una sentencia SQL simple que no tiene ningun parametro.
        ResultSet resultSetAux;//Contiene los resultados de una consulta SQL. Mantiene un cursor apuntando a su fila de datos actual. 
        ResultSetMetaData rsMd; //Metodo que obtiene el numero, tipo y propiedades de las columnas de un ResultSet.
        int cantidadColumnas; //cantidad de columnas de la tabla consulta
        ArrayList<FuncionClass> funciones = new ArrayList<>(); // arraylist para obtener todas las funciones para la factura

        try {
            // .createStatement(); //Instanciamos el Statement.
            sentenciaAux = ConexionBD.ConectarLaBD().getConexion().createStatement();
            resultSetAux = sentenciaAux.executeQuery(consulta); //Instanciamos el resultSet, en donde se guardan los resultados de la sentencia.
            rsMd = resultSetAux.getMetaData(); //Instanciamos el ResultSetMetaData con la informacion del ResultSet.
            cantidadColumnas = rsMd.getColumnCount();//Obtenemos el numero de columnas de la tabla. 

            while (resultSetAux.next()) {//con el while se recorren las filas. Se mueve verticalmente  

                FuncionClass funcion = new FuncionClass();
                for (int i = 0; i < cantidadColumnas; i++) {//con el for se recorren las columnas. Se mueve horizontalmente
                    if (i == 0) {
                        funcion.setPrecio(resultSetAux.getFloat(i + 1));
                    }
                    if (i == 1) {
                        funcion.setHorario(resultSetAux.getString(i + 1));
                    }
                    if (i == 2) {
                        funcion.setNoSala(resultSetAux.getString(i + 1));
                    }
                    if (i == 3) {
                        funcion.setNombrePelicula(resultSetAux.getString(i + 1));
                    }
                }
                funciones.add(funcion);

            }

            sentenciaAux.close();
            resultSetAux.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

        return null;
    }
}
