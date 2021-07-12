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
        titulos = new String[3];
        titulos[0] = "No. Sala";
        titulos[1] = "Tipo";
        titulos[2] = "Asientos";
        return titulos;
    } 

}
