/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielsagastume;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form POrincipal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        adminAuto au = new adminAuto("./Autos.txt");
        adminEnsamblador ae = new adminEnsamblador("./Ensambladores.txt");
        au.cargarArchivo();
        ae.cargarArchivo();
        for (Auto temp : au.getAutos()) {
            cb_auto.addItem(String.valueOf(temp.getVin()));
        }
        for (Ensamblador t : ae.getEnsamblador()) {
            cb_ensamblador.addItem(String.valueOf(t.getNombre()));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        auto_crud = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jd_agregar_auto = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        vin = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_material = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        autonomia = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        c_carroceria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        c_maletero = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        s_pantallas = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        i_botones = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        i_material = new javax.swing.JTextField();
        i_volante = new javax.swing.JTextField();
        s_visor = new javax.swing.JTextField();
        s_ancho = new javax.swing.JFormattedTextField();
        a_material = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        a_tipo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        a_masaje = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Ensamblador_crud = new javax.swing.JDialog();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jd_agregar_ensamblador = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        e_id = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        e_nombre = new javax.swing.JTextField();
        e_genero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        edad = new javax.swing.JSpinner();
        jToggleButton1 = new javax.swing.JToggleButton();
        jd_select = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        cb_auto = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cb_ensamblador = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jd_simulacion = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_fallidos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("AGREGAR AUTO");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("MODIFICAR AUTO");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setText("ELIMINAR AUTO");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout auto_crudLayout = new javax.swing.GroupLayout(auto_crud.getContentPane());
        auto_crud.getContentPane().setLayout(auto_crudLayout);
        auto_crudLayout.setHorizontalGroup(
            auto_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auto_crudLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(auto_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        auto_crudLayout.setVerticalGroup(
            auto_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auto_crudLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jd_agregar_auto.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("VIN");
        jd_agregar_auto.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 12, -1, -1));

        vin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jd_agregar_auto.getContentPane().add(vin, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 43, 243, 37));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("COLOR");
        jd_agregar_auto.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 86, -1, -1));
        jd_agregar_auto.getContentPane().add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 111, 243, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("AUTONOMIA");
        jd_agregar_auto.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 169, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Material Bateria");
        jd_agregar_auto.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 258, -1, -1));
        jd_agregar_auto.getContentPane().add(b_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 283, 246, 46));

        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setText("CREAR AUTO");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jd_agregar_auto.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 246, 200));
        jd_agregar_auto.getContentPane().add(autonomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 200, 243, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Capacidad del maletero");
        jd_agregar_auto.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 422, -1, -1));
        jd_agregar_auto.getContentPane().add(c_carroceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 372, 246, 38));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Tipo de carroceria");
        jd_agregar_auto.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 347, -1, -1));

        c_maletero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jd_agregar_auto.getContentPane().add(c_maletero, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 455, 246, 41));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Material mas usado");
        jd_agregar_auto.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Visor");
        jd_agregar_auto.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Cantidad de botones");
        jd_agregar_auto.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        s_pantallas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jd_agregar_auto.getContentPane().add(s_pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 250, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Cantidad de pantallas");
        jd_agregar_auto.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        i_botones.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jd_agregar_auto.getContentPane().add(i_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 250, 40));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Tipo de volante");
        jd_agregar_auto.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("ANCHO DE PANTALLA");
        jd_agregar_auto.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));
        jd_agregar_auto.getContentPane().add(i_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 250, 40));
        jd_agregar_auto.getContentPane().add(i_volante, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 250, 50));
        jd_agregar_auto.getContentPane().add(s_visor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 250, 40));

        s_ancho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jd_agregar_auto.getContentPane().add(s_ancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 250, 40));
        jd_agregar_auto.getContentPane().add(a_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 250, 40));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Material de los asientos");
        jd_agregar_auto.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));
        jd_agregar_auto.getContentPane().add(a_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 250, 40));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Electrico o manual");
        jd_agregar_auto.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));
        jd_agregar_auto.getContentPane().add(a_masaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 250, 40));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Tiene masaje?");
        jd_agregar_auto.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setText("AGREGAR ENSAMBLADOR");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton8.setText("MODIFICAR ENSAMBLADOR");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton9.setText("ELIMINAR ENSAMBLADOR");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ensamblador_crudLayout = new javax.swing.GroupLayout(Ensamblador_crud.getContentPane());
        Ensamblador_crud.getContentPane().setLayout(Ensamblador_crudLayout);
        Ensamblador_crudLayout.setHorizontalGroup(
            Ensamblador_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ensamblador_crudLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(Ensamblador_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        Ensamblador_crudLayout.setVerticalGroup(
            Ensamblador_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ensamblador_crudLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("ID");

        e_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        e_id.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("NOMBRE");

        e_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        e_genero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("GENERO");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Edad");

        edad.setModel(new javax.swing.SpinnerNumberModel(0, null, 120, 1));

        jToggleButton1.setText("Agregar");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_agregar_ensambladorLayout = new javax.swing.GroupLayout(jd_agregar_ensamblador.getContentPane());
        jd_agregar_ensamblador.getContentPane().setLayout(jd_agregar_ensambladorLayout);
        jd_agregar_ensambladorLayout.setHorizontalGroup(
            jd_agregar_ensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregar_ensambladorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_agregar_ensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_agregar_ensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(e_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(e_id, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(e_genero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGroup(jd_agregar_ensambladorLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(41, 41, 41)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jd_agregar_ensambladorLayout.setVerticalGroup(
            jd_agregar_ensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregar_ensambladorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(e_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(e_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(e_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_agregar_ensambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Auto a ensamblar");

        cb_auto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Ensamblador");

        cb_ensamblador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButton10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton10.setText("ENSAMBLAR AUTO");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_selectLayout = new javax.swing.GroupLayout(jd_select.getContentPane());
        jd_select.getContentPane().setLayout(jd_selectLayout);
        jd_selectLayout.setHorizontalGroup(
            jd_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_selectLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jd_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_selectLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jd_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_ensamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(cb_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jd_selectLayout.setVerticalGroup(
            jd_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_selectLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_ensamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parte", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jToggleButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jToggleButton2.setText("ENSAMBLAR");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });

        jToggleButton3.setText("ver autos fallidos");
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_simulacionLayout = new javax.swing.GroupLayout(jd_simulacion.getContentPane());
        jd_simulacion.getContentPane().setLayout(jd_simulacionLayout);
        jd_simulacionLayout.setHorizontalGroup(
            jd_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_simulacionLayout.createSequentialGroup()
                .addGroup(jd_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_simulacionLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_simulacionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jd_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jd_simulacionLayout.setVerticalGroup(
            jd_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_simulacionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jToggleButton3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tabla_fallidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VIN", "Color", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_fallidos);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Examen 2");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setText("CRUD ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("ENSAMBLAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int op = Integer.parseInt(JOptionPane.showInputDialog("1. Crud Auto\n"
                + "2. CRUD Ensamblador"));
        if (op == 1) {
            auto_crud.setModal(true);
            auto_crud.pack();
            auto_crud.setLocationRelativeTo(this);
            auto_crud.setVisible(true);
        } else if (op == 2) {
            Ensamblador_crud.setModal(true);
            Ensamblador_crud.pack();
            Ensamblador_crud.setLocationRelativeTo(this);
            Ensamblador_crud.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // AGREGAR AUTO
        int tiempo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de la bateria en milisegundos y entero"));
        int tiempo1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de la bateria en milisegundos y entero"));
        int tiempo2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de la bateria en milisegundos y entero"));
        int tiempo3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de la bateria en milisegundos y entero"));
        int tiempo4=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de la bateria en milisegundos y entero"));
        
        
        adminAuto ap = new adminAuto("./Autos.txt");
        ap.cargarArchivo();
        ArrayList<Auto> autos_existentes = ap.getAutos();
        boolean existe = false;
        for (Auto temp : autos_existentes) {
            if (temp.getVin() == Integer.parseInt(vin.getText())) {
                existe = true;
            }
        }
        if (existe == true) {
            JOptionPane.showMessageDialog(jd_agregar_auto, "El vin del auto ya existe");
            vin.setText("");
            color.setText("");
            autonomia.setText("");
            b_material.setText("");
            c_carroceria.setText("");
            c_maletero.setText("");
            i_material.setText("");
            i_volante.setText("");
            i_botones.setText("");
            s_pantallas.setText("");
            s_visor.setText("");
            s_ancho.setText("");
            a_material.setText("");
            a_tipo.setText("");
            a_masaje.setText("");

        } else {
            Bateria bateria = new Bateria(Integer.parseInt(autonomia.getText()), b_material.getText(),tiempo);
            Carroceria c = new Carroceria(c_carroceria.getText(), Integer.parseInt(c_maletero.getText()),tiempo1);
            Interior interior = new Interior(i_material.getText(), i_volante.getText(), Integer.parseInt(i_botones.getText()),tiempo2);
            Sistema sistema = new Sistema(Integer.parseInt(s_pantallas.getText()), s_visor.getText(), Integer.parseInt(s_ancho.getText()),tiempo3);
            Asientos asientos = new Asientos(a_material.getText(), a_tipo.getText(), a_masaje.getText(),tiempo4);
            Auto a = new Auto(Integer.parseInt(vin.getText()), color.getText(), bateria, c, interior, sistema, asientos);
            try {
                ap.getAutos().add(a);
                ap.escribirArchivo();
            } catch (IOException ex) {
            }
            vin.setText("");
            color.setText("");
            autonomia.setText("");
            b_material.setText("");
            c_carroceria.setText("");
            c_maletero.setText("");
            i_material.setText("");
            i_volante.setText("");
            i_botones.setText("");
            s_pantallas.setText("");
            s_visor.setText("");
            s_ancho.setText("");
            a_material.setText("");
            a_tipo.setText("");
            a_masaje.setText("");
            JOptionPane.showMessageDialog(jd_agregar_auto, "Auto agregado");
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jd_agregar_auto.setModal(true);
        jd_agregar_auto.pack();
        jd_agregar_auto.setLocationRelativeTo(this);
        jd_agregar_auto.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // MODIFICAR AUTO
        adminAuto ad = new adminAuto("./Autos.txt");
        ad.cargarArchivo();
        ArrayList<Auto> autos_existentes = ad.getAutos();
        String salida = "";
        int i = 0;
        for (Auto t : autos_existentes) {
            salida += i + "- " + t.toString() + "\n";
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                + "Ingrese la posicion del auto que quiere modificar"));
        int part = Integer.parseInt(JOptionPane.showInputDialog("1. Modificar el vin\n"
                + "2. Modificar el color\n"
                + "3. Modificar la bateria\n"
                + "4. Modificar la carroceria\n"
                + "5. Modificar el interior\n"
                + "6. Modificar el sistema de infoentretenimiento\n"
                + "7. Modificar asientos"));
        if (part == 1) {
            int vin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el vin:"));
            ArrayList<Auto> autos_existentes1 = ad.getAutos();
            boolean existe = false;
            for (Auto temp : autos_existentes1) {
                if (temp.getVin() == vin) {
                    existe = true;
                }
            }
            if (existe == true) {
                JOptionPane.showMessageDialog(jd_agregar_auto, "El vin del auto ya existe");
            } else {
                ad.getAutos().get(pos).setVin(vin);
                try {
                    ad.escribirArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(auto_crud, "Auto modificado");
        } else if (part == 2) {
            try {
                String color = JOptionPane.showInputDialog("Ingrese el color");
                ad.getAutos().get(pos).setColor(color);

                ad.escribirArchivo();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(auto_crud, "Auto modificado");
        } else if (part == 3) {
            int autonomia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la autonomia:"));
            String material = JOptionPane.showInputDialog("Ingrese el material de la bateria");
            ad.getAutos().get(pos).getBateria().setAutonomia(autonomia);
            ad.getAutos().get(pos).getBateria().setMaterial(material);
            try {
                ad.escribirArchivo();
            } catch (IOException ex) {

            }
            JOptionPane.showMessageDialog(auto_crud, "Auto modificado");
        } else if (part == 4) {
            String carroceria = JOptionPane.showInputDialog("Ingrese el tipo de carroceria:");
            int autonomia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del maletero:"));
            ad.getAutos().get(pos).getCarroceria().setTipo(carroceria);
            ad.getAutos().get(pos).getCarroceria().setCapacidad(autonomia);
            try {
                ad.escribirArchivo();
            } catch (IOException ex) {
            }
            JOptionPane.showMessageDialog(auto_crud, "Auto modificado");
        } else if (part == 5) {
            String carroceria = JOptionPane.showInputDialog("Ingrese el material mas utilizado");
            String volante = JOptionPane.showInputDialog("Ingrese el tipo de volante:");
            int autonomia1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de botones:"));
            ad.getAutos().get(pos).getInterior().setMaterial(carroceria);
            ad.getAutos().get(pos).getInterior().setTipo_volante(volante);
            ad.getAutos().get(pos).getInterior().setCant_botones(autonomia1);
            try {
                ad.escribirArchivo();
                JOptionPane.showMessageDialog(auto_crud, "Auto modificado");
            } catch (IOException ex) {
            }
        } else if (part == 6) {
            String volante = JOptionPane.showInputDialog("Ingrese Si tiene visor:");
            int autonomia1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pantallas"));
            int autonomia2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la pantalla principal:"));
            ad.getAutos().get(pos).getSistema().setCant_pantallas(autonomia1);
            ad.getAutos().get(pos).getSistema().setVisor(volante);
            ad.getAutos().get(pos).getSistema().setAncho_pantalla(autonomia2);
            try {
                ad.escribirArchivo();
                JOptionPane.showMessageDialog(auto_crud, "Auto modificado");
            } catch (IOException ex) {
            }
        } else if (part == 7) {
            String volante = JOptionPane.showInputDialog("Ingrese El material de los asientos:");
            String volante1 = JOptionPane.showInputDialog("Ingrese si es electrico o manual:");
            String volante2 = JOptionPane.showInputDialog("Ingrese Si tiene para masajes:");
            ad.getAutos().get(pos).getAsientos().setMaterial(volante);
            ad.getAutos().get(pos).getAsientos().setTipo(volante1);
            ad.getAutos().get(pos).getAsientos().setMasaje(volante2);
            try {
                ad.escribirArchivo();
                JOptionPane.showMessageDialog(auto_crud, "Auto modificado");
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            // Eliminar auto
            adminAuto ad = new adminAuto("./Autos.txt");
            ad.cargarArchivo();
            ArrayList<Auto> autos_existentes = ad.getAutos();
            String salida = "";
            int i = 0;
            for (Auto t : autos_existentes) {
                salida += i + "- " + t.toString() + "\n";
            }
            int pos = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                    + "Ingrese la posicion del auto que quiere modificar"));
            ad.getAutos().remove(pos);
            ad.escribirArchivo();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // Abrir ventana de Agregar Ensamblador
        jd_agregar_ensamblador.setModal(true);
        jd_agregar_ensamblador.pack();
        jd_agregar_ensamblador.setLocationRelativeTo(this);
        jd_agregar_ensamblador.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // Modificar Ensamblador
        adminEnsamblador ae = new adminEnsamblador("./Ensambladores.txt");
        ae.cargarArchivo();
        String salida = "";
        int i = 0;
        for (Ensamblador t : ae.getEnsamblador()) {
            salida += i + "- " + t.toString() + "\n";
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                + "Ingrese la posicion del ensamblador que quiere modificar"));
        int op = Integer.parseInt(JOptionPane.showInputDialog("1. Modificar nombre\n"
                + "2. Modificar Nombre\n"
                + "3. Modificar genero\n"
                + "4. Modificar edad\n"
                + "5. Modificar cantidad de vehiculos"));
        if (op == 1) {
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo id:"));
                ae.getEnsamblador().get(pos).setId(id);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(Ensamblador_crud, "Ensamblador modificado");
            } catch (IOException ex) {
            }
        } else if (op == 2) {
            try {
                String genero = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                ae.getEnsamblador().get(pos).setNombre(genero);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(Ensamblador_crud, "Ensamblador modificado");
            } catch (IOException ex) {

            }
        } else if (op == 3) {
            try {
                String genero = JOptionPane.showInputDialog("Ingrese el nuevo genero: ");
                ae.getEnsamblador().get(pos).setGenero(genero);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(Ensamblador_crud, "Ensamblador modificado");
            } catch (IOException ex) {
            }
        } else if (op == 4) {
            try {
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
                ae.getEnsamblador().get(pos).setEdad(edad);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(Ensamblador_crud, "Ensamblador modificado");
            } catch (IOException ex) {
            }
        } else if (op == 5) {
            try {
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos ensamblados:"));
                ae.getEnsamblador().get(pos).setCant_vehiculos(edad);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(Ensamblador_crud, "Ensamblador modificado");
            } catch (IOException ex) {
            }

        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Eliminar ensamblador
        adminEnsamblador ae = new adminEnsamblador("./Ensambladores.txt");
        ae.cargarArchivo();
        String salida = "";
        int i = 0;
        for (Ensamblador t : ae.getEnsamblador()) {
            salida += i + "- " + t.toString() + "\n";
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                + "Ingrese la posicion del ensamblador que quiere eliminar"));
        ae.getEnsamblador().remove(pos);
        JOptionPane.showMessageDialog(Ensamblador_crud, "Ensamblador eliminado");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        try {
            //Agregar ensamblador
            adminEnsamblador ae = new adminEnsamblador("./Ensambladores.txt");
            ae.cargarArchivo();
            Ensamblador ensamblador = new Ensamblador(Integer.parseInt(e_id.getText()), e_nombre.getText(), e_genero.getText(), (Integer) edad.getValue(), 0);
            ae.getEnsamblador().add(ensamblador);
            ae.escribirArchivo();
            e_id.setText("");
            e_nombre.setText("");
            e_genero.setText("");
            JOptionPane.showMessageDialog(jd_agregar_ensamblador, "Ensamblador agregado");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        cb_auto.removeAllItems();
        cb_ensamblador.removeAllItems();
        adminAuto au = new adminAuto("./Autos.txt");
        adminEnsamblador ae = new adminEnsamblador("./Ensambladores.txt");
        au.cargarArchivo();
        ae.cargarArchivo();
        for (Auto temp : au.getAutos()) {
            cb_auto.addItem(String.valueOf(temp.getVin()));
        }
        for (Ensamblador t : ae.getEnsamblador()) {
            cb_ensamblador.addItem(t.getNombre());
        }
        jd_select.setModal(true);
        jd_select.pack();
        jd_select.setLocationRelativeTo(this);
        jd_select.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        adminAuto au = new adminAuto("./Autos.txt");
        adminEnsamblador ae = new adminEnsamblador("./Ensambladores.txt");
        au.cargarArchivo();
        ae.cargarArchivo();
        auto_seleccionado = au.getAutos().get(cb_auto.getSelectedIndex());
        ensamblador_seleccionado = ae.getEnsamblador().get(cb_ensamblador.getSelectedIndex());
        if (ensamblador_seleccionado.getCant_vehiculos() <= 5) {
            probabilidad = 30;
        } else if (ensamblador_seleccionado.getCant_vehiculos() >= 6 && ensamblador_seleccionado.getCant_vehiculos() <= 15) {
            probabilidad = 22;
        } else if (ensamblador_seleccionado.getCant_vehiculos() >= 16 && ensamblador_seleccionado.getCant_vehiculos() <= 30) {
            probabilidad = 13;
        } else {
            probabilidad = 7;
        }
        jd_simulacion.setModal(true);
        jd_simulacion.pack();
        jd_simulacion.setLocationRelativeTo(this);
        jd_simulacion.setVisible(true);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        Hilo hilo = new Hilo(tabla, auto_seleccionado, ensamblador_seleccionado, probabilidad);
        hilo.start();
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseClicked
        // Autos fallidos
        DefaultTableModel dtm = (DefaultTableModel) tabla_fallidos.getModel();
        dtm.setRowCount(0);
        DefaultTableModel model = (DefaultTableModel) tabla_fallidos.getModel();
        adminFallido ad = new adminFallido("./fallidos.txt");
        ad.cargarArchivo();
        for (Auto temp : ad.getFallidos()) {
            Object[] row = {temp.getVin(),
                temp.getColor(),
                "Fallido"
            };
            model.addRow(row);
            tabla_fallidos.setModel(model);
        }

        jDialog1.setModal(true);
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jToggleButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Ensamblador_crud;
    private javax.swing.JTextField a_masaje;
    private javax.swing.JTextField a_material;
    private javax.swing.JTextField a_tipo;
    private javax.swing.JDialog auto_crud;
    private javax.swing.JFormattedTextField autonomia;
    private javax.swing.JTextField b_material;
    private javax.swing.JTextField c_carroceria;
    private javax.swing.JFormattedTextField c_maletero;
    private javax.swing.JComboBox<String> cb_auto;
    private javax.swing.JComboBox<String> cb_ensamblador;
    private javax.swing.JTextField color;
    private javax.swing.JTextField e_genero;
    private javax.swing.JFormattedTextField e_id;
    private javax.swing.JTextField e_nombre;
    private javax.swing.JSpinner edad;
    private javax.swing.JFormattedTextField i_botones;
    private javax.swing.JTextField i_material;
    private javax.swing.JTextField i_volante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JDialog jd_agregar_auto;
    private javax.swing.JDialog jd_agregar_ensamblador;
    private javax.swing.JDialog jd_select;
    private javax.swing.JDialog jd_simulacion;
    private javax.swing.JFormattedTextField s_ancho;
    private javax.swing.JFormattedTextField s_pantallas;
    private javax.swing.JTextField s_visor;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla_fallidos;
    private javax.swing.JFormattedTextField vin;
    // End of variables declaration//GEN-END:variables
Auto auto_seleccionado;
    Ensamblador ensamblador_seleccionado;
    int probabilidad;
}
