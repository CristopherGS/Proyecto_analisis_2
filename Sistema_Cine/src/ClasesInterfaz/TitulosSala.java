/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesInterfaz;

import Interfaz.DefinirTitulos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TitulosSala implements DefinirTitulos{
    
    private String[] titulos;

    @Override
    public String[] DefinirTitulos() {
        titulos = new String[5];
        titulos[0] = "ID";
        titulos[1] = "No. Sala";
        titulos[2] = "Columnas";
        titulos[3] = "Filas";
        titulos[4] = "No. Asientos";
        return titulos;
    } 

}
