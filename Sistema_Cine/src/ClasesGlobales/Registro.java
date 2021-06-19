/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesGlobales;

import Interfaz.DefinirTitulos;
import javax.swing.JTable;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Registro {


    private String parametros, nombre,values;
    private int desicion;
    private AdministracionConsulta adminConsulta;
    
    public Registro(){
        adminConsulta = new AdministracionConsulta();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
        
   
    public int getDesicion() {
        return desicion;
    }

    public void setDesicion(int desicion) {
        this.desicion = desicion;
    }
    
    public void actualizarValues(){
        
    }

    public AdministracionConsulta getAdminConsulta() {
        return adminConsulta;
    }

    public void setAdminConsulta(AdministracionConsulta adminConsulta) {
        this.adminConsulta = adminConsulta;
    }
    

    public String getConsulta(String texto) {
        return null;
    }



}
