/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTable;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Registro {

    private String[] titulo;
    private String where ="",query="";


    public String[] getTitulo() {
        return titulo;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
   

    public void setTitulo(String[] titulo) {
        this.titulo = titulo;
    }
    
     public String getConsulta(String texto) {
        return null;
    }
    
     public String getInstruccion(String texto){
         return null;
     }
     public String getInstruccion(String texto,String texto2){
         return null;
     }
  

}
