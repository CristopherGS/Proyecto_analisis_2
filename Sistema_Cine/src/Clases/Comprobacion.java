/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Comprobacion {
    private CRUD crud;
    public boolean existeRegistro(Registro registro,String datoEvaluar, String columnas){
        boolean existe = crud.InstanciarCRUD().Existe(registro.getConsulta(""), datoEvaluar, columnas);
        return existe;
        
                }
}
