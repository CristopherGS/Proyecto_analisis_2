/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesGlobales;

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
    private String password = "ljrp";
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

    public Connection getConexion() {
        return conexion;
    }

    public Statement getSentencia() {
        return sentencia;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    } 
    
    
}
