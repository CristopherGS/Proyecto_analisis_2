/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVenta;

import ClasesGlobales.Registro;

/**
 *
 * @author CRISTOPHERGUERRA
 */
public class Asiento extends Registro {

    private String idAsiento;
    private boolean disponible;

    public Asiento() {

        this.setParametros("idAsiento, disponible");
        this.setNombre("asiento");
    }

    public String getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(String idAsiento) {
        this.idAsiento = idAsiento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    

    @Override
    public void actualizarValues() {
        this.setValues("values('" + idAsiento + "','"  + disponible + "')");
    }
}
