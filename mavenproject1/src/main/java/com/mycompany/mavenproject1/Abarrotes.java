/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Abarrotes extends javax.swing.JInternalFrame {
    CConexion bd = new CConexion();
    Connection BD = bd.conectar();
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Aba> listaabarrotes = new ArrayList<Aba>();
    public Abarrotes() {
        initComponents();
        this.setTitle("Registro de Abarrotes");
        modelo.addColumn("MARCA");
        modelo.addColumn("PROVEEDOR");
        modelo.addColumn("PRECIO");
        modelo.addColumn("ID_ABARROTE");
        modelo.addColumn("ID_CATEGORIA");
        refrescarTabla();
    }

    public void refrescarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        } 
        for(Aba abarrotes : listaabarrotes){
            Object a [] = new Object[5];
            a[0] = abarrotes.getMarca();
            a[1] = abarrotes.getProveedor();
            a[2] = abarrotes.getPrecio();
            a[3] = abarrotes.getidAbarrote();
            a[4] = abarrotes.getidCategoria();
            modelo.addRow(a);
        }
        tblDatosAbarrotes.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnPrecio = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbAbarrote = new javax.swing.JComboBox<>();
        cbCategoria = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosAbarrotes = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRO ABARROTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE O MARCA:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel3.setText("PROVEEDOR:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.19999999f), Float.valueOf(0.19999999f), Float.valueOf(9999.0f), Float.valueOf(0.1f)));
        jPanel4.add(spnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 100, -1));
        spnPrecio.getAccessibleContext().setAccessibleParent(this);

        jLabel4.setText("PRECIO-S/:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
        jPanel4.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, -1));
        jPanel4.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 130, -1));

        jLabel5.setText("ID_ABARROTE");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel6.setText("ID_CATEGORIA");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jPanel4.add(cbAbarrote, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jPanel4.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jButton2.setText("NUEVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 530, 250));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, 60));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton3.setText("CANCELAR");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 150, 60));

        jTabbedPane1.addTab("REGISTRAR", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("ABARROTE:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, -1));

        jLabel8.setText("MARCA:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jPanel5.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, -1));

        jLabel9.setText("PROVEEDOR:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jPanel5.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 15, 610, 100));

        tblDatosAbarrotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatosAbarrotes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 590, 150));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 140, 70));

        jTabbedPane1.addTab("VISUALIZAR", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ELIMINAR", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
        String sql = "INSERT INTO abarrote_arroz (nombre, proveedor, precio_unidad, id_Abarrote, id_Categoria) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = BD.prepareStatement(sql)) {
            Aba abarrotes = new Aba();
            abarrotes.setMarca(txtMarca.getText());
            abarrotes.setProveedor(txtProveedor.getText());
            abarrotes.setPrecio(Float.parseFloat(spnPrecio.getValue().toString()));
            abarrotes.setidAbarrote(cbAbarrote.getSelectedItem().toString());
            abarrotes.setidCategoria(cbCategoria.getSelectedItem().toString());

            pstmt.setString(1, abarrotes.getMarca());
            pstmt.setString(2, abarrotes.getProveedor());
            pstmt.setFloat(3, abarrotes.getPrecio());
            pstmt.setString(4, abarrotes.getidAbarrote());
            pstmt.setString(5, abarrotes.getidCategoria());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro exitoso.");
        }

        // Refrescar la tabla si es necesario
            refrescarTabla();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "ERROR AL AGREGAR ABARROTES: " + e.getMessage());
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cbAbarrote.addItem("elegir...");
        cbAbarrote.addItem("1");
        cbAbarrote.addItem("2");
        cbAbarrote.addItem("3");
        cbAbarrote.addItem("4");
        cbCategoria.addItem("3");
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtMarca.setText("");
        txtProveedor.setText("");
        cbCategoria.setSelectedIndex(0);
        cbAbarrote.setSelectedIndex(0);
        spnPrecio.setValue(0.2);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbAbarrote;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTable tblDatosAbarrotes;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarVentana() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
