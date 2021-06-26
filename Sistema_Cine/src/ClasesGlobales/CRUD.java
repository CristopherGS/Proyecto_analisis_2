/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesGlobales;

import static ClasesGlobales.ConexionBD.instancia;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CRUD {

    private ConexionBD conexion;
    static CRUD instancia;
    
    private CRUD(){
        System.out.println("crear");
    }
     
    public static CRUD InstanciarCRUD(){
        
        if(instancia == null){
              instancia = new CRUD();
          }
          
        return instancia;
    }

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
    public void llenar_combo(JComboBox combo,String consulta,String parametro){
        ArrayList<String> lista = new ArrayList<String>();
        Statement sentenciaAux;//Objeto que se usa para usar ejecutar sentencias de SQL. Ejecuta una sentencia SQL simple que no tiene ningun parametro.
        ResultSet resultSetAux = null;//Contiene los resultados de una consulta SQL. Mantiene un cursor apuntando a su fila de datos actual. 
        try {
            /*Esto es lo mismo a decir result = sentencia.executeQuery*/
           sentenciaAux =  conexion.ConectarLaBD().getConexion().createStatement(); //se crea un statemet
           resultSetAux = sentenciaAux.executeQuery(consulta);//se relizar la sentencia y se pasan los resultados 
           
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            /*esto hace que cada resultado se agregue, pero se agrega solo los datos de una columna
             se le manda el nombre de la columna, que sera la variable parametro
            */
            while(resultSetAux.next()){
                /*esto es lo mismo a decir lista.add(result.getString*/
                lista.add(resultSetAux.getString(parametro));   
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*Esto es para llenar el combobox con
          los datos que se llenaron en la lista 
        */
        for(String tipo:lista){
            combo.addItem(tipo);
        }
        
    }

}
