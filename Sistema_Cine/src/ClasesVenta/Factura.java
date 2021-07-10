/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVenta;

import java.util.ArrayList;

/**
 *
 * @author CRISTOPHERGUERRA
 */
public class Factura {

    public int idFactura;

    public float total;

    public Cliente cliente;
    
    public ArrayList<FuncionesSQL> FuncionesSQL;
    
    public Empleado empleado;

    public Factura(float total, Cliente cliente) {
        this.total = total;
        this.cliente = cliente;
    }
      public void GenerarFactura() {
  }
}
