/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesGlobales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ConexionAuxiliar {
 
    private Connection conexion;//Se utiliza para instanciar un objeto en el cual se inviara la cadena de conexion      
    private String baseDatos;
    private String puerto;
    private String usuario;
    private String password ;
    private String claseNombre;
    private String cadenaConexion = "";
    
     public Connection getConexion() {
        obtenerDatosBD();//con esto obtenemos los datos de base de datos
         try {
            cadenaConexion = "jdbc:mysql://localhost"+":"+puerto+"/"+baseDatos;
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
            
            //JOptionPane.showMessageDialog(null,"Conexion exitosa","Mensaje",JOptionPane.INFORMATION_MESSAGE);
             System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
         return conexion;
    }
    

    public void obtenerDatosBD(){
        String linea;
        try {  
            FileReader fr = new FileReader("src/Fichero/datosBD.txt");
            BufferedReader br = new BufferedReader(fr);
     
            int conta = 0;
            while((linea=br.readLine())!=null){
                if(conta ==0){
                    this.baseDatos = linea;
                } 
                if(conta ==1){
                     this.puerto = linea;
                } 
                if(conta ==2){
                     this.usuario = linea;
                } 
                if(conta ==3){
                    this.password = linea;
                }
                if(conta ==4){
                    this.claseNombre = linea;
                }
                conta++;
               
            }
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
