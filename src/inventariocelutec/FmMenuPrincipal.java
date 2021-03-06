/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariocelutec;

import Clases.Fondo_Panel;
import Producto.FmProductos;
import Inventario.Fmlistadoinventario;
import Producto.FmListadoProducto;
import Proveedor.FmProvedor;
import Proveedor.FmListadoProveedor;
import Empleados.FmListadoBDDEmpleados;
import Empleados.FmiEmpleados;
import Inventario.FmImventario;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author user
 */
public class FmMenuPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form FmMenuPrincipal
     */
    
    public FmMenuPrincipal() {
        initComponents();
        panEscritorio.setBorder(new Fondo_Panel());
        this.setExtendedState(MAXIMIZED_BOTH);
        getIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MeReg_Buscador = new javax.swing.JMenu();
        MeInventario = new javax.swing.JMenu();
        MeIventario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MeInv_Tienda = new javax.swing.JMenu();
        MeItReg_Producto = new javax.swing.JMenuItem();
        MeEmpleado = new javax.swing.JMenuItem();
        MeItReg_Provedor = new javax.swing.JMenuItem();
        MeListado = new javax.swing.JMenu();
        MeItReg_LisProdcuto = new javax.swing.JMenuItem();
        MeItReg_LisProvedor = new javax.swing.JMenuItem();
        MeItReg_LisEmpleados = new javax.swing.JMenuItem();
        MeSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1384, 750));
        setSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout panEscritorioLayout = new javax.swing.GroupLayout(panEscritorio);
        panEscritorio.setLayout(panEscritorioLayout);
        panEscritorioLayout.setHorizontalGroup(
            panEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        panEscritorioLayout.setVerticalGroup(
            panEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        getContentPane().add(panEscritorio, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        MeReg_Buscador.setBackground(new java.awt.Color(0, 0, 0));
        MeReg_Buscador.setForeground(new java.awt.Color(204, 0, 0));
        MeReg_Buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar2.png"))); // NOI18N
        MeReg_Buscador.setText("Buscador");
        MeReg_Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MeReg_BuscadorMouseClicked(evt);
            }
        });
        jMenuBar1.add(MeReg_Buscador);

        MeInventario.setForeground(new java.awt.Color(204, 0, 0));
        MeInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menuu.png"))); // NOI18N
        MeInventario.setText("Inventario");

        MeIventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/celu.png"))); // NOI18N
        MeIventario.setText("Regisro Inventario");
        MeIventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeIventarioActionPerformed(evt);
            }
        });
        MeInventario.add(MeIventario);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/portapapeles.png"))); // NOI18N
        jMenuItem2.setText("Listado del Invetario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MeInventario.add(jMenuItem2);

        jMenuBar1.add(MeInventario);

        MeInv_Tienda.setForeground(new java.awt.Color(204, 0, 0));
        MeInv_Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario-hombre.png"))); // NOI18N
        MeInv_Tienda.setText("Registros");
        MeInv_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeInv_TiendaActionPerformed(evt);
            }
        });

        MeItReg_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/celu.png"))); // NOI18N
        MeItReg_Producto.setText("Registros Producto");
        MeItReg_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeItReg_ProductoActionPerformed(evt);
            }
        });
        MeInv_Tienda.add(MeItReg_Producto);

        MeEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/equipo.png"))); // NOI18N
        MeEmpleado.setText("Registro Empleado");
        MeEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeEmpleadoActionPerformed(evt);
            }
        });
        MeInv_Tienda.add(MeEmpleado);

        MeItReg_Provedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/empresa.png"))); // NOI18N
        MeItReg_Provedor.setText("Registro Proveedore");
        MeItReg_Provedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeItReg_ProvedorActionPerformed(evt);
            }
        });
        MeInv_Tienda.add(MeItReg_Provedor);

        jMenuBar1.add(MeInv_Tienda);

        MeListado.setForeground(new java.awt.Color(204, 0, 0));
        MeListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Listado.png"))); // NOI18N
        MeListado.setText("Listados");

        MeItReg_LisProdcuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/portapapeles.png"))); // NOI18N
        MeItReg_LisProdcuto.setText("Productos");
        MeItReg_LisProdcuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeItReg_LisProdcutoActionPerformed(evt);
            }
        });
        MeListado.add(MeItReg_LisProdcuto);

        MeItReg_LisProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/portapapeles.png"))); // NOI18N
        MeItReg_LisProvedor.setText("Provedores");
        MeItReg_LisProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeItReg_LisProvedorActionPerformed(evt);
            }
        });
        MeListado.add(MeItReg_LisProvedor);

        MeItReg_LisEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/portapapeles.png"))); // NOI18N
        MeItReg_LisEmpleados.setText("Empleados");
        MeItReg_LisEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeItReg_LisEmpleadosActionPerformed(evt);
            }
        });
        MeListado.add(MeItReg_LisEmpleados);

        jMenuBar1.add(MeListado);

        MeSalir.setForeground(new java.awt.Color(204, 0, 0));
        MeSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/entrar.png"))); // NOI18N
        MeSalir.setText("Salir");
        MeSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MeSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(MeSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MeSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeSalirMouseClicked
        FmContrae??a_Usuario fuc = new FmContrae??a_Usuario();
        fuc.show();
        dispose();
    }//GEN-LAST:event_MeSalirMouseClicked

    private void MeInv_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeInv_TiendaActionPerformed

    }//GEN-LAST:event_MeInv_TiendaActionPerformed

    private void MeEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeEmpleadoActionPerformed
        FmiEmpleados fe = new FmiEmpleados();
        panEscritorio.add(fe);
        fe.show();
    }//GEN-LAST:event_MeEmpleadoActionPerformed

    private void MeItReg_LisEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeItReg_LisEmpleadosActionPerformed
        FmListadoBDDEmpleados fl = new FmListadoBDDEmpleados();
        panEscritorio.add(fl);
        fl.show();
    }//GEN-LAST:event_MeItReg_LisEmpleadosActionPerformed

    private void MeItReg_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeItReg_ProductoActionPerformed
        FmProductos fp = new FmProductos();
        panEscritorio.add(fp);
        fp.show();
    }//GEN-LAST:event_MeItReg_ProductoActionPerformed

    private void MeReg_BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeReg_BuscadorMouseClicked
       FmBuscador fb = new FmBuscador();
        panEscritorio.add(fb);
        fb.show();
    }//GEN-LAST:event_MeReg_BuscadorMouseClicked

    private void MeItReg_LisProdcutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeItReg_LisProdcutoActionPerformed
        FmListadoProducto flp =new FmListadoProducto();
        panEscritorio.add(flp);
        flp.show();
    }//GEN-LAST:event_MeItReg_LisProdcutoActionPerformed

    private void MeItReg_ProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeItReg_ProvedorActionPerformed
        FmProvedor fmpv = new FmProvedor();
        panEscritorio.add(fmpv);
        fmpv.show();
    }//GEN-LAST:event_MeItReg_ProvedorActionPerformed

    private void MeItReg_LisProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeItReg_LisProvedorActionPerformed
        FmListadoProveedor flpv = new FmListadoProveedor();
        panEscritorio.add(flpv);
        flpv.show();
    }//GEN-LAST:event_MeItReg_LisProvedorActionPerformed

    private void MeIventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeIventarioActionPerformed
       FmImventario fmi = new FmImventario();
       panEscritorio.add(fmi);
       fmi.show();
    }//GEN-LAST:event_MeIventarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Fmlistadoinventario fmin=new Fmlistadoinventario();
        panEscritorio.add(fmin);
        fmin.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MeEmpleado;
    private javax.swing.JMenu MeInv_Tienda;
    private javax.swing.JMenu MeInventario;
    private javax.swing.JMenuItem MeItReg_LisEmpleados;
    private javax.swing.JMenuItem MeItReg_LisProdcuto;
    private javax.swing.JMenuItem MeItReg_LisProvedor;
    private javax.swing.JMenuItem MeItReg_Producto;
    private javax.swing.JMenuItem MeItReg_Provedor;
    private javax.swing.JMenuItem MeIventario;
    private javax.swing.JMenu MeListado;
    private javax.swing.JMenu MeReg_Buscador;
    private javax.swing.JMenu MeSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JDesktopPane panEscritorio;
    // End of variables declaration//GEN-END:variables

    @Override
   public Image getIconImage() {
   Image Icono = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("Iconos/cel.png"));
   return Icono;
}
}
