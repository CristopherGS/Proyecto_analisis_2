/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CRUD {

    private ConexionBD conexion;

    public void EjecutarInstruccion(String Instruccion) {
        int filas = 0;
        Statement sentenciaAux;
        try {
            
            //preStare = conexion.prepareStatement(Instruccion);
            sentenciaAux = conexion.ConectarLaBD().getConexion().createStatement();//Se crea el objeto sentencia que es el encargado de inviar la instruccion
            sentenciaAux.executeUpdate(Instruccion);//Se enviar la instruccion y el resultSet guarda los datos. Se debe de enviar el Update que se utiliza para: INSERT, DELETE, UPDATE, REPLACE y TRUNCATE
            //preStare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Instruccion ejecutada correctamente", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            //sentencia.close();
            //El .executeUpdate devuelve el numero de registros modificados. 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }

    public void llenarTabla(String[] titulos, JTable tabla, String consulta) {
        Statement sentenciaAux;//Objeto que se usa para usar ejecutar sentencias de SQL. Ejecuta una sentencia SQL simple que no tiene ningun parametro.
        ResultSet resultSetAux;//Contiene los resultados de una consulta SQL. Mantiene un cursor apuntando a su fila de datos actual. 
        ResultSetMetaData rsMd; //Metodo que obtiene el numero, tipo y propiedades de las columnas de un ResultSet.
        int cantidadColumnas;

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);//Instanciamos un nuevo modelo para la tabla, que es la que contiene las filas.
        tabla.setModel(modelo);//Agregamos el modelo a la tabla

        try {
            // .createStatement(); //Instanciamos el Statement.
            sentenciaAux = conexion.ConectarLaBD().getConexion().createStatement();
            resultSetAux = sentenciaAux.executeQuery(consulta); //Instanciamos el resultSet, en donde se guardan los resultados de la sentencia.
            rsMd = resultSetAux.getMetaData(); //Instanciamos el ResultSetMetaData con la informacion del ResultSet.
            cantidadColumnas = rsMd.getColumnCount();//Obtenemos el numero de columnas de la tabla. 

            while (resultSetAux.next()) {//con el while se recorren las filas. Se mueve verticalmente  
                Object[] fila = new Object[cantidadColumnas];//Se hace un array para guardar los datos de la fila 
                for (int i = 0; i < cantidadColumnas; i++) {//con el for se recorren las columnas. Se mueve horizontalmente
                    fila[i] = resultSetAux.getObject(i + 1); // Se guarda cada dato en el array del ciclo
                }
                modelo.addRow(fila);//Se agrega la fila del ciclo en el modelo. 
            }

            sentenciaAux.close();
            resultSetAux.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public boolean Existe(String consulta, String parametro, String columna) {
        Statement sentenciaAux;//Objeto que se usa para usar ejecutar sentencias de SQL. Ejecuta una sentencia SQL simple que no tiene ningun parametro.
        ResultSet resultSetAux;//Contiene los resultados de una consulta SQL. Mantiene un cursor apuntando a su fila de datos actual. 
        
        boolean existe = false;
        String parametroExistente = "";
        try {            
            sentenciaAux = conexion.ConectarLaBD().getConexion().createStatement();
            resultSetAux = sentenciaAux.executeQuery(consulta);
            while (resultSetAux.next()) {//Se van recorriendo las filas de la consulta con el while
                
                parametroExistente = resultSetAux.getString(columna); //se consulta el dato que tenga esa fila en una columna determinada, y se pasa el resultado a una variable
                if (parametroExistente.equals(parametro)) {//Se evalua que el parametro actual coincide con el que se quiere encontrar 
                    existe = true;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
        return existe;
    }

}
