/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVenta;

import ClasesGlobales.ConexionBD;
import ClasesGlobales.Registro;

/**
 *
 * @author CRISTOPHERGUERRA
 */
public class Cliente extends Registro {

    private ConexionBD conexion;
    public String Nombrec;
    public int NIT;

    public Cliente() {
        this.setParametros("nombre, nit");
        this.setNombre("cliente");
    }

    public String getNombrec() {
        return Nombrec;
    }

    public void setNombrec(String Nombre) {
        this.Nombrec = Nombre;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public void existeCliente() {

    }

    public void insertarCliente() {

    }

    @Override
    public void actualizarValues() {
        this.setValues("values('" + Nombrec + "','" + NIT + "')");
    }
}
