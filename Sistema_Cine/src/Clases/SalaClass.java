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
public class SalaClass extends Registro {

    private String consulta, where;

    public SalaClass() {
        super(3);//Es para inicializar el constructor del padre
        this.getTitulo()[0] = "Id";
        this.getTitulo()[1] = "No. Sala";
        this.getTitulo()[2] = "No. Asientos";

    }

    public String getConsulta(int sizeTexto) {
        if (sizeTexto == 0) {
            where = " where 1 = 1";
            consulta = "select * from sala " + where;
        } else {

        }
        return consulta;
    }

}
