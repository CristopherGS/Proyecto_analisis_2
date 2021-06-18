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
    private String parametros;
    private String tabla;
    private int desicion;
    private String where = "", query = "";

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

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public int getDesicion() {
        return desicion;
    }

    public void setDesicion(int desicion) {
        this.desicion = desicion;
    }

    public void setTitulo(String[] titulo) {
        this.titulo = titulo;
    }

    public String getConsulta(String texto) {
        return null;
    }

    public String queryInsertar(String datos) {
        this.query = "insert into " + this.tabla + "(" + this.parametros + ")" + " values(" + datos + ")";
        return this.query;
    }

    public String queryModificar(String set) {
        this.query = "update " + this.tabla + " set " + set + " " + this.where;
        return this.query;
    }

}
