/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SalaClass extends Registro {
    
    private CRUD crud;

    public SalaClass() {
        super(3);//Es para inicializar el constructor del padre
        this.getTitulo()[0] = "Id";
        this.getTitulo()[1] = "No. Asientos";
        this.getTitulo()[2] = "No. Sala";
        crud = new CRUD();

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
    
    public void insertarRegistro(JTextField num_sala,JTextField num_asientos){
        String consulta = "";
        if(num_asientos.getText().length()>0&&num_sala.getText().length()>0){
            try {
                int num_sala_int = Integer.parseInt(num_sala.getText());
                int num_aseintos_int = Integer.parseInt(num_asientos.getText());
                
                if(!crud.Existe(getConsulta(num_sala.getText()), num_sala.getText(),"num_sala")){
                    crud.EjecutarInstruccion("insert into sala(num_asientos,num_sala) values("+num_asientos.getText()+","+num_sala.getText()+")");    
                }
                else{
                    JOptionPane.showMessageDialog(null,"El numero de sala ya existe ingrese uno diferente","Error",JOptionPane.ERROR_MESSAGE);
                   
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de ingresar numero enteros","Error",JOptionPane.ERROR_MESSAGE);
                 num_sala.setText("");
                 num_asientos.setText("");
            }     
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
       
    }
    

}
