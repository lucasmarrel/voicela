/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applivoicela;

import accesAuxDonnees.DAOPays;
import java.util.ArrayList;
import java.util.List;
import vue.FenetreLogin;
import javax.swing.UIManager;
import metier.Pays;

/**
 *
 * @author lucas
 */
public class Appli {

    /**
     * @param args the command line arguments
     */
    private static DAOPays leDaoPays = new DAOPays();
    private static List<Pays> laListe = new ArrayList<>();
    private static String pathFile = "Photos\\";

    public static void main(String args[]) {

        try {
            leDaoPays.chargerPays(laListe);
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new FenetreLogin().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());;
        }
        //</editor-fold>
    }

    public static List<Pays> getListPays() {
        return laListe;
    }

    public static String getPathFile() {
        return pathFile;
    }
}
