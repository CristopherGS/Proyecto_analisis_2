/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

import ClasesGlobales.Registro;
import ClasesInterfaz.TitulosSala;
import Interfaz.DefinirTitulos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SalaClass extends Registro {
    
   
    private String num_sala, columnas,filas,num_asientos;
    

    public SalaClass() {
    
        this.setParametros("num_sala,columnas,filas,num_asientos");
        this.setNombre("sala");
     
    }

    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    public void setColumnas(String columnas) {
        this.columnas = columnas;
    }

    public void setFilas(String filas) {
        this.filas = filas;
    }

    public void setNum_asientos(String num_asientos) {
        this.num_asientos = num_asientos;
    }
  
    @Override
    public void actualizarValues(){
       this.setValues("values("+num_sala+","+columnas+","+filas+","+num_asientos+")");
    }
    @Override
    public void actualizarSet(){
       this.setSet("set num_sala="+num_sala+",columnas="+columnas+",filas="+filas+",num_asientos="+num_asientos);
       this.getAdminConsulta().setWhere("where idSala = "+this.getId());
    }

    @Override
    public String getConsulta(String  texto) {
        if (texto.length() == 0) {//si no hay nada en la caja de texto para buscar 
            getAdminConsulta().setWhere(" where 1 = 1"); //esto funciona como un true 
        } else {
            /*si hay texto se le agrega al where el identificador y cual registro
              se quiere encontrar, que en este caso sera texto
            */
            
            try {
                // verificamos que lo que se esta buscando es un numero entero
                int id_numSala = Integer.parseInt(texto); 
                getAdminConsulta().setWhere ("where num_sala= "+id_numSala);  
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de ingresar un numero entero","Error",JOptionPane.ERROR_MESSAGE);
            }   
        }
        getAdminConsulta().setQuery("select s.num_sala, ts.nombre,ts.asientos  from sala as s \n" +
        "inner join tiposala as ts on ts.idTipoSala = s.TipoSala_idTipoSala " + getAdminConsulta().getWhere());
        return getAdminConsulta().getQuery();
    }
    
    public int validacionDeDatos(JTextField num_sala){
        int num_asientos = 0;
        //Verificamos que los capos no este vacios
        if(num_sala.getText().length()>0){
            //con esto comprobamos que sean valores enteros 
            try {
                int num_sala_int = Integer.parseInt(num_sala.getText());
                
                
                        
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de ingresar numero enteros","Error",JOptionPane.ERROR_MESSAGE);
                num_sala.setText("");
                
            }     
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return num_asientos;
    }
    

}
