package Inventario;

import java.sql.Connection;
import Proveedor.FmListadoProveedor;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class FmImventario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FmImventario
     */
    Connection con=null;
    ArrayList<String> Provedores;
    ArrayList<String> Producto;
    String prov="";
    String Prod="";
    public FmImventario() {
        initComponents();
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/BDD_CeluTec","william","1234");
            SelecioneProvedor();
            SelecioneProducto();
        } catch (SQLException ex) {
            Logger.getLogger(FmImventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        princpal = new javax.swing.JPanel();
        cboProveedor = new javax.swing.JComboBox<>();
        cboCodigoCelu = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setIconifiable(true);
        setTitle("Registro Inventario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cel.png"))); // NOI18N

        princpal.setBackground(new java.awt.Color(204, 204, 255));
        princpal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProveedorItemStateChanged(evt);
            }
        });
        princpal.add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, 20));

        cboCodigoCelu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCodigoCeluItemStateChanged(evt);
            }
        });
        princpal.add(cboCodigoCelu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, 20));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        princpal.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 20));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("Provedor:");
        princpal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Codigo de Celular:");
        princpal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad:");
        princpal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setText("Registro Del Inventario");
        princpal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpar.setBackground(new java.awt.Color(153, 255, 204));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Limpiar.png"))); // NOI18N
        btnLimpar.setText("  LIMPIAR");
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 50));

        btnGrabar.setBackground(new java.awt.Color(153, 255, 204));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Grabar.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setToolTipText("");
        btnGrabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrabar.setPreferredSize(new java.awt.Dimension(79, 49));
        btnGrabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 50));

        btnEliminar.setBackground(new java.awt.Color(153, 255, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPreferredSize(new java.awt.Dimension(79, 49));
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 100, 50));

        btnCancelar.setBackground(new java.awt.Color(153, 255, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 50));

        princpal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 450, 90));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Codigo:");
        princpal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        princpal.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));

        getContentPane().add(princpal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProveedorItemStateChanged
        if(cboProveedor.getSelectedItem()!= "Seleccionar"){
        prov=Provedores.get(cboProveedor.getSelectedIndex()-1);
        }
    }//GEN-LAST:event_cboProveedorItemStateChanged

    private void cboCodigoCeluItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCodigoCeluItemStateChanged
        if(cboCodigoCelu.getSelectedItem()!= "Seleccionar"){
        Prod=Producto.get(cboCodigoCelu.getSelectedIndex()-1);
        }
    }//GEN-LAST:event_cboCodigoCeluItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cboProveedor.setSelectedItem("Seleccionar");
        cboCodigoCelu.setSelectedItem("Seleccionar");
        txtCantidad.setText("");
        txtcodigo.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        Statement sl;
        if(txtCantidad.getText().isEmpty()||(txtcodigo.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Ingresar Dato", "Error", JOptionPane.WARNING_MESSAGE);
        }else if(txtcodigo.getText().length()>4){
            JOptionPane.showMessageDialog(null, "Codigo fuero del rango", "Adevrtencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                sl = con.createStatement();
                sl.execute("Insert into WILLIAM.PROVEDORPRODUCTO values("
                    +Integer.parseInt(txtcodigo.getText())+",'"+ cboProveedor.getSelectedItem().toString()+ "','"
                    + cboCodigoCelu.getSelectedItem().toString() + "',"
                    + Integer.parseInt(txtCantidad.getText())+ ",'"
                    +Fechaderegistro2()+"')");
                JOptionPane.showMessageDialog(null, "Elemento Guradado con exito", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                //Logger.getLogger(FmProductos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ESTE DATO YA EXISTE EN LA BASE DE DATOS", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Statement sl;
            try {
                sl = con.createStatement();
                sl.execute("delete from WILLIAM.PROVEDORPRODUCTO where clave_prodprov="+Integer.parseInt(txtcodigo.getText())+"");
                JOptionPane.showMessageDialog(null, "Elemento Eliminado con exito", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(FmImventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
            //txtCedula.setText("Ingresar solo numeros");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        char c2=evt.getKeyChar();
        if(Character.isLetter(c2)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
            //txtCedula.setText("Ingresar solo numeros");
        }
    }//GEN-LAST:event_txtcodigoKeyTyped


    private void SelecioneProvedor(){
          Statement sl=null;
          ResultSet rs=null;
        try {
            sl=con.createStatement();
            rs=sl.executeQuery("SELECT nombre_prov,RUC_prov FROM WILLIAM.PROVEEDOR");
            cboProveedor.addItem("Seleccionar");
            Provedores=new ArrayList<String>();
            while(rs.next()){
            cboProveedor.addItem(rs.getString("nombre_prov"));
            Provedores.add(rs.getString("nombre_prov"));
            } 
        }catch (Exception ex) {
        }
}
        private void SelecioneProducto(){
          Statement sl=null;
          ResultSet rs=null;
        try {
            sl=con.createStatement();
            rs=sl.executeQuery("SELECT codigo_prod,Codigo_prod FROM WILLIAM.PRODUCTO");
            cboCodigoCelu.addItem("Seleccionar");
            Producto=new ArrayList<String>();
            while(rs.next()){
            cboCodigoCelu.addItem(rs.getString("Codigo_prod"));
            Producto.add(rs.getString("Codigo_prod"));
            } 
        }catch (Exception ex) {
        }
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cboCodigoCelu;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel princpal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
private String Fechaderegistro2(){
    Date d = new Date();
    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss - dd/MM/yyyy");
    String FechaIngreso = hourdateFormat.format(d);
    return FechaIngreso;
}
}
