/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelicula;

import ClasesGlobales.Registro;
import ClasesInterfaz.TitulosSala;
import Interfaz.DefinirTitulos;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PeliculaClass extends Registro {

    private String nombrepelicula, fecha_estreno, duracion, imagen, Categoria,
            Clasificacion, Idioma;

    public PeliculaClass() {

        this.setParametros("nombre, fecha_estreno, duracion, imagen, Categoria, Clasificacion, Idioma");
        this.setNombre("pelicula");

    }

    public void setNombrePeli(String nombre) {
        this.nombrepelicula = nombre;
    }

    public void setFechaEstreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }

    public void setClasificacion(String clasificacion) {
        this.Clasificacion = clasificacion;
    }

    public void setIdioma(String idioma) {
        this.Idioma = idioma;
    }

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public String getIdioma() {
        return Idioma;
    }
    
    
        @Override
    public void actualizarValues(){
       this.setValues("values('"+nombrepelicula+"','"+fecha_estreno+"','"+duracion+"', '"+imagen+"', '"+Categoria+"', '"+Clasificacion+"', '"+Idioma+"')");
    }

}

