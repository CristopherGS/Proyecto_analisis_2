/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import ImplemetInterface.TitulosSala;
import Interface.DefinirTitulos;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SalaClass extends Registro {
    
   
    private DefinirTitulos titulosGestion;

    public SalaClass() {
        titulosGestion = new TitulosSala();
        this.setTitulo(titulosGestion.DefinirTitulos());
        this.setParametros("num_sala,columnas,filas,num_asientos");
        this.setTabla("sala");
 
        System.out.println(this.getTitulo().length);
       
    }

    @Override
    public String getConsulta(String  texto) {
        if (texto.length() == 0) {//si no hay nada en la caja de texto para buscar 
            setWhere(" where 1 = 1"); //esto funciona como un true 
        } else {
            /*si hay texto se le agrega al where el identificador y cual registro
              se quiere encontrar, que en este caso sera texto
            */
            
            try {
                // verificamos que lo que se esta buscando es un numero entero
                int id_numSala = Integer.parseInt(texto); 
                setWhere ("where idSala = "+id_numSala+" or num_sala="+id_numSala);  
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de ingresar un numero entero","Error",JOptionPane.ERROR_MESSAGE);
            }
           
        }
        setQuery("select * from sala " + getWhere());
        return getQuery();
    }
    
    public int validacionDeDatos(JTextField num_sala,JTextField txtcolumnas,JTextField txtfilas){
        int num_asientos = 0;
        //Verificamos que los capos no este vacios
        if(num_sala.getText().length()>0&&txtcolumnas.getText().length()>0&&txtfilas.getText().length()>0){
            //con esto comprobamos que sean valores enteros 
            try {
                int num_sala_int = Integer.parseInt(num_sala.getText());
               
                int columnas = Integer.parseInt(txtcolumnas.getText());
                int filas = Integer.parseInt(txtfilas.getText());
                
                //verificamos que las columnas y filas sean mayores a cero
                if(columnas>0 && filas >0){
                    if(filas<=27){
                        num_asientos = filas*columnas;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El numero de filas debe de ser menor a 27","Error",JOptionPane.ERROR_MESSAGE);
                         txtfilas.setText("");
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Las filas y columnas debe de ser mayor a cero","Errro",JOptionPane.ERROR_MESSAGE);
                    txtcolumnas.setText("");
                    txtfilas.setText("");
                }
                        
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de ingresar numero enteros","Error",JOptionPane.ERROR_MESSAGE);
                 num_sala.setText("");
                 txtcolumnas.setText("");
                 txtfilas.setText("");
            }     
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return num_asientos;
    }
    

}
