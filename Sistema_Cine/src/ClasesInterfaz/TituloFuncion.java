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
public class TituloFuncion implements DefinirTitulos{
    private String[] titulos;

    @Override
    public String[] DefinirTitulos() {
        titulos = new String[4];
        titulos[0] = "Precio";
        titulos[1] = "Horario";
        titulos[2] = "No. sala";
        titulos[3] = "Pelicula";
        return titulos;
    }

}
