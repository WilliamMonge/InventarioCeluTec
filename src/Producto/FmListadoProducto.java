/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Empleados.FmListadoBDDEmpleados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class FmListadoProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FmListadoProducto
     */
    Connection com = null;
    DefaultTableModel Producto = new DefaultTableModel();
    public FmListadoProducto() {
        initComponents();
        Producto.addColumn("Codigo");
        Producto.addColumn("Marca");
        Producto.addColumn("Modelo");
        Producto.addColumn("Precio");
        Producto.addColumn("Memoria");
        Producto.addColumn("Resolucion");
        Producto.addColumn("Color");
        Producto.addColumn("Sistema Operativo");
        Producto.addColumn("Hora y Fecha de Registro");
        try {
            com=DriverManager.getConnection("jdbc:derby://localhost:1527/BDD_CeluTec","william","1234");
               
            MostrarTabla2();
            
        } catch (SQLException ex) {
            Logger.getLogger(FmListadoProducto.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JTbl_Productos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Listado de Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/portapapeles.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1360, 400));

        JTbl_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTbl_Productos);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTbl_Productos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void MostrarTabla2(){
         try {
           Statement sl = com.createStatement();
           ResultSet rs=sl.executeQuery("select * from WILLIAM.PRODUCTO");
            while(rs.next()){ 
                String[] fila={rs.getString(1).toString(),
                    rs.getString(2).toString(),
                    rs.getString(3).toString(),
                    rs.getString(4).toString(),
                    rs.getString(5).toString(),
                    rs.getString(6).toString(),
                    rs.getString(7).toString(),
                    rs.getString(8).toString(),
                    rs.getString(9).toString()};
            Producto.addRow(fila);
            JTbl_Productos.setEnabled(false);
            }
             JTbl_Productos.setModel(Producto);
             }catch (SQLException ex) {
            Logger.getLogger(FmListadoBDDEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
