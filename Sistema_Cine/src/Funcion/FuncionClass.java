/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

import ClasesGlobales.Registro;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FuncionClass extends Registro{
    private float precio;
    private String horario;
    private int idSala,idPelicula;
    public FuncionClass(){
        this.setNombre("funcion");
        this.setParametros("Precio,Horario,Sala_idSala,Pelicula_idPelicula");
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }
    @Override
    public void actualizarValues(){
       this.setValues("values("+precio+",'"+horario+"',"+idSala+","+idPelicula+")");
    }
}

