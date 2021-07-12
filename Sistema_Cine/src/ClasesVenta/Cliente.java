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
    public String Nombrec, Telefono;
    public String NIT; 

    public Cliente() {
        this.setParametros("nombre, nit, telefono");
        this.setNombre("cliente");
    }

    public String getNombrec() {
        return Nombrec;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    

    public void setNombrec(String Nombre) {
        this.Nombrec = Nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public void existeCliente() {

    }

    public void insertarCliente() {

    }

    @Override
    public void actualizarValues() {
        this.setValues("values('" + Nombrec + "','" + NIT + "','"+Telefono+"')");
    }
}
