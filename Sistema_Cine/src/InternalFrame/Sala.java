/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrame;

import Clases.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sala extends javax.swing.JInternalFrame {

    private ConexionBD conexion;
    private SalaClass sala;

    public Sala() {
        initComponents();
        setTitle("Salas");
        this.conexion.ConectarLaBD();//Realizamos la conexion con la base de datos, con el patron singleton
        //configuraciones de jdialog de nueva sala
        NuevaSala.setTitle("Nueva Sala");
        NuevaSala.setSize(510,430);
        NuevaSala.setLocationRelativeTo(Sala.this);//el relativo respecto al internal frame
        NuevaSala.setUndecorated(true);//Le quita el boron de cerrar
        
        sala = new SalaClass();//Instanciamos la clase de la sala
        
        //Llenamos la tabla de salas
        this.conexion.ConectarLaBD().getCrud().llenarTabla(sala.getTitulo(), tablaSalas,sala.getConsulta(txtBusqueda.getText()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioButton = new javax.swing.ButtonGroup();
        NuevaSala = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNumSala = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        txtFilas = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelCancelarNuevo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panelAceptarNuevo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelGeneral = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        panelNuevaSala = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelEliminarRegistro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelModificarRegistro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        panelinicial = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSalas = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        panelBuscarRegistro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        NuevaSala.setModal(true);

        jPanel1.setBackground(new java.awt.Color(19, 59, 92));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(30, 95, 116));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero de sala");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Columnas");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumSala, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(new java.awt.Color(30, 95, 116));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelCancelarNuevo.setBackground(new java.awt.Color(30, 95, 116));
        panelCancelarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarNuevaSala(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarPanelDialogo(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirPanelDialogo(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N

        javax.swing.GroupLayout panelCancelarNuevoLayout = new javax.swing.GroupLayout(panelCancelarNuevo);
        panelCancelarNuevo.setLayout(panelCancelarNuevoLayout);
        panelCancelarNuevoLayout.setHorizontalGroup(
            panelCancelarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        panelCancelarNuevoLayout.setVerticalGroup(
            panelCancelarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelAceptarNuevo.setBackground(new java.awt.Color(30, 95, 116));
        panelAceptarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAceptar(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarPanelDialogo(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirPanelDialogo(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar.png"))); // NOI18N

        javax.swing.GroupLayout panelAceptarNuevoLayout = new javax.swing.GroupLayout(panelAceptarNuevo);
        panelAceptarNuevo.setLayout(panelAceptarNuevoLayout);
        panelAceptarNuevoLayout.setHorizontalGroup(
            panelAceptarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        panelAceptarNuevoLayout.setVerticalGroup(
            panelAceptarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(panelAceptarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCancelarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCancelarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAceptarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(30, 95, 116));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nueva Sala");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout NuevaSalaLayout = new javax.swing.GroupLayout(NuevaSala.getContentPane());
        NuevaSala.getContentPane().setLayout(NuevaSalaLayout);
        NuevaSalaLayout.setHorizontalGroup(
            NuevaSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NuevaSalaLayout.setVerticalGroup(
            NuevaSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);

        panelGeneral.setLayout(new java.awt.BorderLayout());

        panelSuperior.setBackground(new java.awt.Color(29, 45, 80));

        panelNuevaSala.setBackground(new java.awt.Color(29, 45, 80));
        panelNuevaSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickNuevo(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarPanel(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirPanel(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo_registro.png"))); // NOI18N

        javax.swing.GroupLayout panelNuevaSalaLayout = new javax.swing.GroupLayout(panelNuevaSala);
        panelNuevaSala.setLayout(panelNuevaSalaLayout);
        panelNuevaSalaLayout.setHorizontalGroup(
            panelNuevaSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelNuevaSalaLayout.setVerticalGroup(
            panelNuevaSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva sala");

        panelEliminarRegistro.setBackground(new java.awt.Color(29, 45, 80));
        panelEliminarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarPanel(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirPanel(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar_registro.png"))); // NOI18N

        javax.swing.GroupLayout panelEliminarRegistroLayout = new javax.swing.GroupLayout(panelEliminarRegistro);
        panelEliminarRegistro.setLayout(panelEliminarRegistroLayout);
        panelEliminarRegistroLayout.setHorizontalGroup(
            panelEliminarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEliminarRegistroLayout.setVerticalGroup(
            panelEliminarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar sala");

        panelModificarRegistro.setBackground(new java.awt.Color(29, 45, 80));
        panelModificarRegistro.setPreferredSize(new java.awt.Dimension(100, 80));
        panelModificarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarPanel(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirPanel(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar_registro.png"))); // NOI18N

        javax.swing.GroupLayout panelModificarRegistroLayout = new javax.swing.GroupLayout(panelModificarRegistro);
        panelModificarRegistro.setLayout(panelModificarRegistroLayout);
        panelModificarRegistroLayout.setHorizontalGroup(
            panelModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelModificarRegistroLayout.setVerticalGroup(
            panelModificarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar sala");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelNuevaSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelModificarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(174, 174, 174)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(panelEliminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addComponent(panelNuevaSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelModificarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelEliminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );

        panelGeneral.add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelCentral.setLayout(new java.awt.CardLayout());

        panelinicial.setBackground(new java.awt.Color(30, 95, 116));

        tablaSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tablaSalas);

        panelBuscarRegistro.setBackground(new java.awt.Color(30, 95, 116));
        panelBuscarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBuscarRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarPanel(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirPanel(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(30, 95, 116));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_registro.png"))); // NOI18N

        javax.swing.GroupLayout panelBuscarRegistroLayout = new javax.swing.GroupLayout(panelBuscarRegistro);
        panelBuscarRegistro.setLayout(panelBuscarRegistroLayout);
        panelBuscarRegistroLayout.setHorizontalGroup(
            panelBuscarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );
        panelBuscarRegistroLayout.setVerticalGroup(
            panelBuscarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel8.setText("Buscar por ID o por numero de sala");

        javax.swing.GroupLayout panelinicialLayout = new javax.swing.GroupLayout(panelinicial);
        panelinicial.setLayout(panelinicialLayout);
        panelinicialLayout.setHorizontalGroup(
            panelinicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinicialLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelinicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelinicialLayout.createSequentialGroup()
                        .addGroup(panelinicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelinicialLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)))
                        .addGap(18, 18, 18)
                        .addComponent(panelBuscarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelinicialLayout.setVerticalGroup(
            panelinicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelinicialLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(panelinicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelinicialLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBuscarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        panelCentral.add(panelinicial, "card2");

        panelGeneral.add(panelCentral, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(panelGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBuscarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarRegistroMouseClicked
        this.conexion.ConectarLaBD().getCrud().llenarTabla(sala.getTitulo(), tablaSalas,sala.getConsulta(txtBusqueda.getText()));
    }//GEN-LAST:event_panelBuscarRegistroMouseClicked

    private void EntrarPanel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarPanel
        if (evt.getSource() == panelNuevaSala) {
            panelNuevaSala.setBackground(new Color(30, 95, 116));
            panelNuevaSala.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (evt.getSource() == panelModificarRegistro) {
            panelModificarRegistro.setBackground(new Color(30, 95, 116));
            panelModificarRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (evt.getSource() == panelEliminarRegistro) {
            panelEliminarRegistro.setBackground(new Color(30, 95, 116));
            panelEliminarRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (evt.getSource() == panelBuscarRegistro){
            panelBuscarRegistro.setBackground(new Color(29, 45, 80));
            panelBuscarRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_EntrarPanel

    private void SalirPanel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirPanel
        if (evt.getSource() == panelNuevaSala) {
            panelNuevaSala.setBackground(new Color(29, 45, 80));
            
        }
        if (evt.getSource() == panelModificarRegistro) {
            panelModificarRegistro.setBackground(new Color(29, 45, 80));
        }
        if (evt.getSource() == panelEliminarRegistro) {
            panelEliminarRegistro.setBackground(new Color(29, 45, 80));
        }
        if (evt.getSource() == panelBuscarRegistro){
            panelBuscarRegistro.setBackground(new Color(30, 95, 116));
        }
    }//GEN-LAST:event_SalirPanel

    private void clickNuevo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNuevo
        NuevaSala.setVisible(true);
    }//GEN-LAST:event_clickNuevo

    private void cancelarNuevaSala(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarNuevaSala
       NuevaSala.dispose();
       txtColumnas.setText("");
       txtFilas.setText("");
       txtNumSala.setText("");
    }//GEN-LAST:event_cancelarNuevaSala

    private void EntrarPanelDialogo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarPanelDialogo
       if (evt.getSource() == panelAceptarNuevo){
            panelAceptarNuevo.setBackground(new Color(29, 45, 80));
            panelAceptarNuevo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
       if (evt.getSource() == panelCancelarNuevo){
            panelCancelarNuevo.setBackground(new Color(29, 45, 80));
            panelCancelarNuevo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_EntrarPanelDialogo

    private void SalirPanelDialogo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirPanelDialogo
        if (evt.getSource() == panelAceptarNuevo){
            panelAceptarNuevo.setBackground(new Color(30, 95, 116));
            panelAceptarNuevo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        if (evt.getSource() == panelCancelarNuevo){
            panelCancelarNuevo.setBackground(new Color(30, 95, 116));
            panelCancelarNuevo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_SalirPanelDialogo

    private void clickAceptar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAceptar
        //con esta condicion verificamos que se cumplan todos los requisitos para la nueva sala 
        //si reportno un numero mayot a cero todo esta bien, este numero es el numero de asientos que tendra la sala
        int num_asientos = sala.validacionDeDatos(txtNumSala, txtColumnas, txtFilas);
        if(num_asientos>0){
           //con esta condicion comprobamos que no exista una sala con el mismo numero
            if(!this.conexion.ConectarLaBD().getCrud().Existe(sala.getConsulta(txtNumSala.getText()),txtNumSala.getText(),"num_sala")){
                  //ingresamos la nueva sala
                  this.conexion.ConectarLaBD().getCrud().EjecutarInstruccion("insert into sala(num_sala,columnas,filas,num_asientos) values("+txtNumSala.getText()+","+txtColumnas.getText()+","+txtFilas.getText()+","+num_asientos+")");    
                  //volvemos a llenar la tabla, ya con los datos actualizados
                  this.conexion.ConectarLaBD().getCrud().llenarTabla(sala.getTitulo(), tablaSalas,sala.getConsulta(""));
                  //Limpiamos los campos de texto
                  txtNumSala.setText("");
                  txtColumnas.setText("");
                  txtFilas.setText("");
                  //Cerramos la ventana emergente de nueva sala 
                  NuevaSala.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"El numero de sala ya existe ingrese uno diferente","Error",JOptionPane.ERROR_MESSAGE);
                    txtNumSala.setText("");
                }
            
        }
    }//GEN-LAST:event_clickAceptar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog NuevaSala;
    private javax.swing.ButtonGroup grupoRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAceptarNuevo;
    private javax.swing.JPanel panelBuscarRegistro;
    private javax.swing.JPanel panelCancelarNuevo;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelEliminarRegistro;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelModificarRegistro;
    private javax.swing.JPanel panelNuevaSala;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelinicial;
    private javax.swing.JTable tablaSalas;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextField txtNumSala;
    // End of variables declaration//GEN-END:variables
}
