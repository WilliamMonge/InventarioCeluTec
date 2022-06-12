/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariocelutec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class InventarioCeluTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con =null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/BDD_CeluTec","william","1234");
            Statement sl=con.createStatement();
            //sl.execute("Insert into EMPLEADOS values('1726245995','William','Soltero','Masculino','Quito','098131142','2324423',12,20,23)");
            System.out.println("Coencion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(InventarioCeluTec.class.getName()).log(Level.SEVERE, null, ex);
        }
        FmContraeña_Usuario fm =new FmContraeña_Usuario();
        fm.show();
    }
    
}
