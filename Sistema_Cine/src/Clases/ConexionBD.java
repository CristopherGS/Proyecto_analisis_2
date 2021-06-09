/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
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
public class ConexionBD {
    static ConexionBD instancia;
    private Connection conexion;//Se utiliza para instanciar un objeto en el cual se inviara la cadena de conexion
    private Statement sentencia;//Se utiliza para ejecutar la instruccion o consulta
    private ResultSet resultSet;//Se utiliza para recibir los datos resultado de la instruccion o consulta 
    
    private String baseDatos = "bdcine";
    private String puerto ="3305";
    private String usuario = "root";
    private String password = "xela2020";
    private String claseNombre = "com.mysql.jdbc.Driver";
    private String cadenaConexion = "";
    
     private ConexionBD() {
        try {
            cadenaConexion = "jdbc:mysql://localhost"+":"+puerto+"/"+baseDatos;
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
            //JOptionPane.showMessageDialog(null,"Conexion exitosa","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }
    
    public static ConexionBD ConectarLaBD(){
        if(instancia == null){
              instancia = new ConexionBD();
          }
          
        return instancia;
    }
    public void llenarTabla(String[] titulos, JTable tabla, String consulta) {
        Statement sentenciaAux;//Objeto que se usa para usar ejecutar sentencias de SQL. Ejecuta una sentencia SQL simple que no tiene ningun parametro.
        ResultSet resultSetAux;//Contiene los resultados de una consulta SQL. Mantiene un cursor apuntando a su fila de datos actual. 
        ResultSetMetaData rsMd; //Metodo que obtiene el numero, tipo y propiedades de las columnas de un ResultSet.
        int cantidadColumnas;

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);//Instanciamos un nuevo modelo para la tabla, que es la que contiene las filas.
        tabla.setModel(modelo);//Agregamos el modelo a la tabla

        try {
            sentenciaAux = conexion.createStatement(); //Instanciamos el Statement.
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
    
}
