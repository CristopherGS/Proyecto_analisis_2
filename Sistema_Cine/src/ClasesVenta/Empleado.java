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
public class Empleado extends Registro {

    private String Nombre, Apellido, Correo,Edad, Direccion, Sexo, DPI, Telefono;
    private int idPuesto;

    public Empleado() {

        this.setParametros("Nombre, Apellido, Correo, Direccion, Edad, Sexo, DPI, Telefono, Puesto_idPuesto");
        this.setNombre("empleado");

    }

    @Override
    public void actualizarValues() {
        this.setValues("values('" + Nombre + "','" + Apellido + "','" + Correo + "', '" + Direccion + "', '" + Edad + "', '" + Sexo + "', '" + DPI +"', '" + Telefono + "', '"+ idPuesto +"', '"+"')");
    }
}
