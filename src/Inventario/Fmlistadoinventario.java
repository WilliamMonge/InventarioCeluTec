/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

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
public class Fmlistadoinventario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Fmlistadoinventario
     */
    Connection com = null;
    DefaultTableModel inventario = new DefaultTableModel();
    public Fmlistadoinventario() {
        initComponents();
        inventario.addColumn("Clave");
        inventario.addColumn("Provedor");
        inventario.addColumn("Codigo del Celular");
        inventario.addColumn("Cantidad");
        inventario.addColumn("Hora y Fecha de Registro");
        try {
            com=DriverManager.getConnection("jdbc:derby://localhost:1527/BDD_CeluTec","william","1234");
               
            MostrarTabla1();
            
        } catch (SQLException ex) {
            Logger.getLogger(Fmlistadoinventario.class.getName()).log(Level.SEVERE, null, ex);
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
        tbllistadoinv = new javax.swing.JTable();

        setClosable(true);
        setTitle("Inventario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/portapapeles.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 400));

        tbllistadoinv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbllistadoinv);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbllistadoinv;
    // End of variables declaration//GEN-END:variables
private void MostrarTabla1(){
         try {
           Statement sl = com.createStatement();
           ResultSet rs=sl.executeQuery("select * from WILLIAM.PROVEDORPRODUCTO");
            while(rs.next()){ 
                String[] fila={rs.getString(1).toString(),
                    rs.getString(2).toString(),
                    rs.getString(3).toString(),
                    rs.getString(4).toString(),
                    rs.getString(5).toString()};
            inventario.addRow(fila);
            tbllistadoinv.setEnabled(false);
            }
             tbllistadoinv.setModel(inventario);
             }catch (SQLException ex) {
            Logger.getLogger(Fmlistadoinventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
