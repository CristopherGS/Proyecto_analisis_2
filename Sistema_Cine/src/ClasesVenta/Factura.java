/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVenta;

import ClasesGlobales.Registro;
import java.util.ArrayList;

/**
 *
 * @author CRISTOPHERGUERRA
 */
public class Factura extends Registro {

    private float total;

    private String detalle;

    public Factura() {
        this.setParametros("total, Detalle");
        this.setNombre("factura");
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public void actualizarValues() {
        this.setValues("values('" + total + "','" + detalle + "')");
    }
}
