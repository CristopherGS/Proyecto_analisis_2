/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartelera;

import JframeVenta.JVentas;
import Pelicula.PeliculaClass;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Shaddow
 */
public class Cartelera extends javax.swing.JInternalFrame {

    private int contador = 0;
    private ObtenerPeliculas obtener;
    private ArrayList<PeliculaClass> peliculas;
    private JDesktopPane panelprincipal;

    public Cartelera(JDesktopPane panelPrincipal) {
        initComponents();
        obtener = new ObtenerPeliculas();
        this.panelprincipal = panelPrincipal;
        this.peliculas = obtener.ObtenerPelis("select * from pelicula");
        labelNombre.setText(this.peliculas.get(contador).getNombrepelicula());
        labelCategoria.setText(this.peliculas.get(contador).getCategoria());
        labelFecha.setText(this.peliculas.get(contador).getFecha_estreno());
        labelClasificacion.setText(this.peliculas.get(contador).getClasificacion());
        labelDuracion.setText(this.peliculas.get(contador).getDuracion());
        labelIdioma.setText(this.peliculas.get(contador).getIdioma());
        //System.out.println(this.peliculas.get(contador).getImagen());
        cargarImagen(this.peliculas.get(contador).getImagen());
    }

    public void cargarImagen(String enlace) {
        Image imagen = null;
        try {
            //Inicializar y asignar url de la imagen a mostrar
            URL url = new URL(enlace);
            //Asignacion de url a la imagen
            imagen = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
//ImageIcon icono = new ImageIcon(imagen.getScaledInstance(paraimagen.getWidth(), paraimagen.getHeight(), Image.SCALE_DEFAULT));

        ImageIcon icono = new ImageIcon(imagen.getScaledInstance(280, 450, Image.SCALE_DEFAULT));
        paraimagen.setIcon(icono);        // TODO add your handling code here:
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paraimagen = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelClasificacion = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelIdioma = new javax.swing.JLabel();
        anterior = new javax.swing.JLabel();
        siguiente = new javax.swing.JLabel();
        botonComprar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(30, 95, 116));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        paraimagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("Nombre");

        labelDuracion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDuracion.setForeground(new java.awt.Color(255, 255, 255));
        labelDuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDuracion.setText("Duración");
        labelDuracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("Fecha");
        labelFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText("Hora");
        labelHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelClasificacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelClasificacion.setForeground(new java.awt.Color(255, 255, 255));
        labelClasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClasificacion.setText("Clasificación");
        labelClasificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCategoria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        labelCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCategoria.setText("Categoría");
        labelCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelIdioma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelIdioma.setForeground(new java.awt.Color(255, 255, 255));
        labelIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIdioma.setText("Idioma");
        labelIdioma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior.png"))); // NOI18N
        anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiaranterior(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siguiente.png"))); // NOI18N
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarsiguiente(evt);
            }
        });

        botonComprar.setBackground(new java.awt.Color(226, 235, 240));
        botonComprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonComprarMouseExited(evt);
            }
        });
        botonComprar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shop.png"))); // NOI18N
        jLabel2.setText("COMPRAR");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        botonComprar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anterior)
                .addGap(47, 47, 47)
                .addComponent(paraimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(siguiente)
                .addGap(425, 425, 425))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(botonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(paraimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(siguiente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(anterior)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(labelHora)
                    .addComponent(labelDuracion)
                    .addComponent(labelClasificacion)
                    .addComponent(labelCategoria)
                    .addComponent(labelIdioma))
                .addGap(27, 27, 27)
                .addComponent(botonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarsiguiente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarsiguiente
        contador++;
        labelNombre.setText(this.peliculas.get(contador).getNombrepelicula());
        labelCategoria.setText(this.peliculas.get(contador).getCategoria());
        labelFecha.setText(this.peliculas.get(contador).getFecha_estreno());
        labelClasificacion.setText(this.peliculas.get(contador).getClasificacion());
        labelDuracion.setText(this.peliculas.get(contador).getDuracion());
        labelIdioma.setText(this.peliculas.get(contador).getIdioma());

        cargarImagen(this.peliculas.get(contador).getImagen());
    }//GEN-LAST:event_cambiarsiguiente

    private void cambiaranterior(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiaranterior
        if (contador == 0) {
            System.out.println("error");
        } else {
            contador--;
            labelNombre.setText(this.peliculas.get(contador).getNombrepelicula());
            labelCategoria.setText(this.peliculas.get(contador).getCategoria());
            labelFecha.setText(this.peliculas.get(contador).getFecha_estreno());
            labelClasificacion.setText(this.peliculas.get(contador).getClasificacion());
            labelDuracion.setText(this.peliculas.get(contador).getDuracion());
            labelIdioma.setText(this.peliculas.get(contador).getIdioma());

            cargarImagen(this.peliculas.get(contador).getImagen());
        }
    }//GEN-LAST:event_cambiaranterior

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JVentas funcion = new JVentas();
        this.panelprincipal.add(funcion);
        funcion.show();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void botonComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseEntered
        Color color = new Color(161, 196, 253);
        this.botonComprar.setBackground(color);
    }//GEN-LAST:event_botonComprarMouseEntered

    private void botonComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseExited
        Color color = new Color(226, 235, 240);
        this.botonComprar.setBackground(color);
    }//GEN-LAST:event_botonComprarMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        Color color = new Color(161, 196, 253);
        this.botonComprar.setBackground(color);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        Color color = new Color(226, 235, 240);
        this.botonComprar.setBackground(color);
    }//GEN-LAST:event_jLabel2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anterior;
    private javax.swing.JPanel botonComprar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelClasificacion;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelIdioma;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel paraimagen;
    private javax.swing.JLabel siguiente;
    // End of variables declaration//GEN-END:variables

}
