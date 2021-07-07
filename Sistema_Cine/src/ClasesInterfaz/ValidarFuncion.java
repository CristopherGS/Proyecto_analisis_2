/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesInterfaz;
import Interfaz.*;
import javax.lang.model.SourceVersion;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

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

   

}
