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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SalaClass extends Registro {
    
   
    private String num_sala;
    private int tipo;
    

    public SalaClass() {
    
        this.setParametros("num_sala,TipoSala_idTipoSala");
        this.setNombre("sala");
     
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    public String getNum_sala() {
        return num_sala;
    }
    

  
    @Override
    public void actualizarValues(){
       this.setValues("values("+num_sala+","+tipo+")");
    }
    @Override
    public void actualizarSet(){
       this.setSet("set num_sala="+num_sala+",TipoSala_idTipoSala="+tipo);
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
        "inner join tiposala as ts on ts.idTipoSala = s.TipoSala_idTipoSala " + getAdminConsulta().getWhere()+" ORDER BY s.idSala ASC");
        return getAdminConsulta().getQuery();
    }
    
    public int validacionDeDatos(JTextField num_sala,JComboBox combo){
        int validar = 0;
        //Verificamos que los capos no este vacios
        if(num_sala.getText().length()>0){
            //con esto comprobamos que sean valores enteros 
            try {
                int num_sala_int = Integer.parseInt(num_sala.getText());
                validar = 1;    
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de ingresar un numero entero","Error",JOptionPane.ERROR_MESSAGE);
                num_sala.setText("");
                
            }     
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return validar;
    }
    

}
