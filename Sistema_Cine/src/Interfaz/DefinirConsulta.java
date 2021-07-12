/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ClasesGlobales.Registro;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface DefinirConsulta {
   
    public String getConsulta(String  text,Registro registro);
    public String getConsulta(String text,Registro registro,int tipo);
    
}
