/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesInterfaz;

import ClasesGlobales.Registro;
import Interfaz.DefinirConsulta;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DefinirConsultaFuncion implements DefinirConsulta{

    @Override
    public String getConsulta(String text, Registro registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getConsulta(String texto, Registro registro, int tipo) {
     if (texto.length() == 0) {//si no hay nada en la caja de texto para buscar 
            registro.getAdminConsulta().setWhere(" where 1 = 1"); //esto funciona como un true 
        } else {
            /*si hay texto se le agrega al where el identificador y cual registro
              se quiere encontrar, que en este caso sera texto
            */
            
            try {
                // verificamos que lo que se esta buscando es un numero entero
                int id_numSala = Integer.parseInt(texto); 
                registro.getAdminConsulta().setWhere ("where num_sala= "+id_numSala);  
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de ingresar un numero entero","Error",JOptionPane.ERROR_MESSAGE);
            }   
        }
        registro.getAdminConsulta().setQuery("select f.Precio,f.Horario,s.num_sala,p.nombre from funcion as f\n"
                + "inner join sala as s on s.idSala = f.Sala_idSala\n"
                + "inner join pelicula as p on p.idPelicula = f.Pelicula_idPelicula " + registro.getAdminConsulta().getWhere());
        return registro.getAdminConsulta().getQuery();
    }

}
