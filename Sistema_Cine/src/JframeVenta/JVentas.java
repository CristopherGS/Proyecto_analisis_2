/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JframeVenta;

import Cartelera.ObtenerPeliculas;
import ClasesGlobales.CRUD;
import ClasesVenta.Cliente;
import ClasesVenta.ClientesSQL;
import ClasesVenta.Factura;
import ClasesVenta.FuncionesSQL;
import Funcion.FuncionClass;
import Pelicula.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class JVentas extends javax.swing.JInternalFrame {

    private CRUD c;
    private ClientesSQL obtener;
    private Factura factura;
    private ArrayList<Cliente> clientes;
    private Cliente cliente;
    private FuncionClass funcion;

    public JVentas() {
        initComponents();
        setTitle("Peliculas");
        c = c.InstanciarCRUD();
        //se le manda el combo, la consulta, y el nombre de la columna 
        c.InstanciarCRUD().llenar_combo(JPelicula, "SELECT p.nombre FROM funcion AS f \n"
                + "INNER JOIN sala AS s ON s.idSala = f.Sala_idSala\n"
                + "INNER JOIN pelicula AS p ON p.idPelicula = f.Pelicula_idPelicula GROUP BY p.nombre;", "nombre");
        c.InstanciarCRUD().llenar_combo(Jsala, "SELECT s.num_sala FROM funcion AS f \n"
                + "INNER JOIN sala AS s ON s.idSala = f.Sala_idSala\n"
                + "INNER JOIN pelicula AS p ON p.idPelicula = f.Pelicula_idPelicula GROUP BY s.num_sala;", "num_sala");
        rcliente.setVisible(false);
        factura = new Factura();
        cliente = new Cliente();
    }

    public void generarFactura(String nombre, String detalle) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");
        Image imagen = Image.getInstance("C:\\Users\\CRISTOPHER GUERRA\\Desktop\\Proyecto_analisis_2\\Sistema_Cine\\src\\img\\barcode.png");
        Document documento = new Document();
        PdfWriter.getInstance(documento, archivo);
        documento.open();

        Paragraph parrafo = new Paragraph("COMPROBANTE");
        parrafo.setAlignment(1);
        imagen.setAlignment(Element.ALIGN_CENTER);
        documento.add(parrafo);
        documento.add(new Paragraph(detalle));
        documento.add(imagen);
        documento.close();

    }

    public void abrir(String name) throws IOException {
        File path = new File(name + ".pdf");
        Desktop.getDesktop().open(path);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelGeneral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        facturacion = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        nit = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        Jsala = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        JPelicula = new javax.swing.JComboBox<>();
        asiento = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        rcliente = new javax.swing.JButton();
        validarcliente = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Salas = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelGeneral.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(30, 95, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facturacion.setBackground(new java.awt.Color(243, 234, 232));
        facturacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Telefono:");
        facturacion.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, 20));

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nombre:");
        facturacion.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, 20));

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Nit:");
        facturacion.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 20));

        telefono.setEditable(false);
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        facturacion.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, -1));

        nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitActionPerformed(evt);
            }
        });
        facturacion.add(nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, -1));

        nombre.setEditable(false);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        facturacion.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, -1));

        Jsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsalaActionPerformed(evt);
            }
        });
        facturacion.add(Jsala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 30));

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Sala:");
        facturacion.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel24.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Pelicula:");
        facturacion.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        JPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPeliculaActionPerformed(evt);
            }
        });
        facturacion.add(JPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 200, 30));

        asiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asientoActionPerformed(evt);
            }
        });
        facturacion.add(asiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 90, 30));

        total.setBackground(new java.awt.Color(102, 102, 102));
        total.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(102, 102, 102));
        total.setText("#000");
        facturacion.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 80, 40));

        rcliente.setBackground(new java.awt.Color(226, 235, 240));
        rcliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        rcliente.setForeground(new java.awt.Color(0, 0, 0));
        rcliente.setText("Registrar Cliente");
        rcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rclienteActionPerformed(evt);
            }
        });
        facturacion.add(rcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 140, 40));

        validarcliente.setBackground(new java.awt.Color(226, 235, 240));
        validarcliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        validarcliente.setForeground(new java.awt.Color(0, 0, 0));
        validarcliente.setText("Validar NIT");
        validarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarclienteActionPerformed(evt);
            }
        });
        facturacion.add(validarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 110, 40));

        cancelar.setBackground(new java.awt.Color(226, 235, 240));
        cancelar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 0, 0));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        facturacion.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 130, 40));

        aceptar.setBackground(new java.awt.Color(255, 255, 255));
        aceptar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        aceptar.setForeground(new java.awt.Color(0, 0, 0));
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        facturacion.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 130, 40));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Asiento No.");
        facturacion.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Total:");
        facturacion.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 50, 40));

        jPanel1.add(facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 500, 430));

        Salas.setBackground(new java.awt.Color(30, 95, 116));

        javax.swing.GroupLayout SalasLayout = new javax.swing.GroupLayout(Salas);
        Salas.setLayout(SalasLayout);
        SalasLayout.setHorizontalGroup(
            SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        SalasLayout.setVerticalGroup(
            SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(Salas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 700, 230));

        panelGeneral.add(jPanel1, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(panelGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsalaActionPerformed
        String seleccionSala = (String) Jsala.getSelectedItem();
        if ("1".equals(seleccionSala)) {
            Sala1 s1 = new Sala1();
            s1.setSize(710, 240);
            s1.setLocation(5, 5);

            Salas.removeAll();
            Salas.add(s1, BorderLayout.CENTER);
            Salas.revalidate();
            Salas.repaint();

        } else if ("2".equals(seleccionSala)){
            Sala2 s2 = new Sala2();
            s2.setSize(710, 240);
            s2.setLocation(5, 5);

            Salas.removeAll();
            Salas.add(s2, BorderLayout.CENTER);
            Salas.revalidate();
            Salas.repaint();
        }
    }//GEN-LAST:event_JsalaActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void asientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asientoActionPerformed

    private void rclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rclienteActionPerformed
        if (nit.getText().equals("") || nombre.getText().equals("") || telefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String query;
            cliente.setNIT(nit.getText());
            cliente.setNombrec(nombre.getText());
            cliente.setTelefono(telefono.getText());
            cliente.actualizarValues();

            query = cliente.getAdminConsulta().queryInsertar(cliente.getValues(), cliente.getParametros(), cliente.getNombre());
            c.InstanciarCRUD().EjecutarInstruccion(query);
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente");
            nombre.setText("");
            telefono.setText("");
            asiento.setEditable(true);
        }
    }//GEN-LAST:event_rclienteActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed

    }//GEN-LAST:event_nitActionPerformed

    private void validarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarclienteActionPerformed
        if (nit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Paraemtros invalidos");
        } else {
            obtener = new ClientesSQL();
            System.out.println(nit.getText());
            this.clientes = obtener.obtenerClientes("SELECT c.nombre, c.nit, c.telefono FROM cliente AS c WHERE c.nit = '" + nit.getText() + "';");
            System.out.println(clientes.size() + "valio");
            int size = clientes.size();
            if (size != 0) {
                for (int i = 0; i < clientes.size(); i++) {
                    nombre.setText(clientes.get(i).getNombrec());
                    telefono.setText(clientes.get(i).getTelefono());

                }
            } else {
                asiento.setEditable(false);
                nombre.setEditable(true);
                telefono.setEditable(true);
                rcliente.setVisible(true);
                JOptionPane.showMessageDialog(null, "No existe el cliente, Registre al nuevo cliente");
            }
        }
    }//GEN-LAST:event_validarclienteActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();

    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if (nit.getText().equals("") || nombre.getText().equals("") || telefono.getText().equals("") || asiento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        } else {
            String query;
            String seleccionSala = (String) Jsala.getSelectedItem();
            String seleccionPelicula = (String) JPelicula.getSelectedItem();
            factura.setTotal((float) 0.00);
            factura.setDetalle("NIT: " + nit.getText() + " \n"
                    + "Cliente: " + nombre.getText() + " \n"
                    + "Sala: " + seleccionSala
                    + "Pelicula: " + seleccionPelicula
                    + "Asiento: " + asiento.getText());
            String detalle = "NIT: " + nit.getText() + " \n"
                    + "Cliente: " + nombre.getText() + " \n"
                    + "Sala: " + seleccionSala
                    + "\nPelicula: " + seleccionPelicula
                    + "\nAsiento: " + asiento.getText();
            factura.actualizarValues();
            query = factura.getAdminConsulta().queryInsertar(factura.getValues(), factura.getParametros(), factura.getNombre());
            c.InstanciarCRUD().EjecutarInstruccion(query);
            try {
                generarFactura(nit.getText(), detalle);
            } catch (DocumentException | IOException ex) {
                Logger.getLogger(JVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
            nombre.setText("");
            telefono.setText("");
            asiento.setText("");
            try {
                abrir(nit.getText());
            } catch (IOException ex) {
                Logger.getLogger(JVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void JPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPeliculaActionPerformed
        String seleccionPelicula = (String) JPelicula.getSelectedItem();
        total.setText(c.InstanciarCRUD().getValor("select f.Precio from funcion as f\n"
                + "inner join sala as s on s.idSala = f.Sala_idSala\n"
                + "inner join pelicula as p on p.idPelicula = f.Pelicula_idPelicula\n"
                + "WHERE p.nombre = '" + seleccionPelicula + "';", "Precio"));
        System.out.println(seleccionPelicula);
    }//GEN-LAST:event_JPeliculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JPelicula;
    private javax.swing.JComboBox<String> Jsala;
    public static javax.swing.JPanel Salas;
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField asiento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JPanel facturacion;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JButton rcliente;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel total;
    private javax.swing.JButton validarcliente;
    // End of variables declaration//GEN-END:variables
}
