/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesInterfaz;
import ClasesGlobales.CRUD;
import Funcion.Funcion;
import Funcion.FuncionClass;
import Interfaz.*;
import javax.lang.model.SourceVersion;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ValidarFuncion implements Validar{

    @Override
    public int ValidarDatos(String precio) {
       int validar = -1;
       float precio_;
        try {
            precio_ =Float.valueOf(precio);
            validar = 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"EL precio debe de ser una cifra","Error",JOptionPane.ERROR_MESSAGE);
        }
       return validar;
    }
    public String FormarHora(JSpinner hora, JSpinner minutos){
        String horaFinal ="";
        try {
             horaFinal = horaFinal+hora.getValue().toString()+":"+minutos.getValue().toString()+":"+"00";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo convertir la hora","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        return horaFinal;
    }
    public void obtenerId(FuncionClass funcion,JTable tablaFuncion,int fila,CRUD crud){
          funcion.getAdminConsulta().setWhere("where f.Precio =" + String.valueOf(tablaFuncion.getValueAt(fila, 0)) + " and s.num_sala =" + String.valueOf(tablaFuncion.getValueAt(fila, 2))
                    + " and p.nombre ='" + String.valueOf(tablaFuncion.getValueAt(fila, 3)) + "' and f.Horario='" + String.valueOf(tablaFuncion.getValueAt(fila, 1)) + "'");
            
            funcion.getAdminConsulta().setQuery("select f.idFuncion as id from funcion as f\n"
                    + "inner join sala as s on s.idSala = f.Sala_idSala\n"
                    + "inner join pelicula as p on p.idPelicula = f.Pelicula_idPelicula " + funcion.getAdminConsulta().getWhere());

            // System.out.println(funcion.getAdminConsulta().getQuery());
            funcion.setId(crud.InstanciarCRUD().getValor(funcion.getAdminConsulta().getQuery(), "id"));
    }

   

}
