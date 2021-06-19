/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesGlobales;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AdministracionConsulta {
    private String query, where;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }
    
    public String queryInsertar(String values,String parametros, String nombre){
        this.query = "insert into " + nombre + "(" +parametros + ") " +values;
        return this.query;
    }
    
    public String queryModificar(String nombre,String set){
        this.query = "update " + nombre + " set " + set + " " + this.where;
        return this.query;
    }
    
    public String queryEliminar(){
        return"";
    }   
    
}
