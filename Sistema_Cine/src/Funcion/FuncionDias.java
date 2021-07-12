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
public class FuncionDias extends Registro{
    private int idFuncion, idDia;
    public FuncionDias(){
        this.setNombre("detalle_funcion_dias");
        this.setParametros("funcion_idHorario,dias_iddias_funcion");
        
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public int getIdDia() {
        return idDia;
    }

    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }
    @Override
    public void actualizarValues(){
       this.setValues("values("+idFuncion+","+idDia+")");
    }
}
