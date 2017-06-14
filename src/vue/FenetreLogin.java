/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import accesAuxDonnees.DAOUtilisateur;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class FenetreLogin extends javax.swing.JFrame {

    private DAOUtilisateur monDaoUtilisateur;

    /**
     * Creates new form FenetreLogin
     */
    public FenetreLogin() {
        monDaoUtilisateur = new DAOUtilisateur();
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIdentifiant = new javax.swing.JLabel();
        lbMdp = new javax.swing.JLabel();
        txtIdentifiant = new javax.swing.JTextField();
        btConnecter = new javax.swing.JButton();
        btQuitter = new javax.swing.JButton();
        lbReinitialiser = new javax.swing.JButton();
        txtMdp = new javax.swing.JPasswordField();
        chbmdp = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbIdentifiant.setText("Identifiant :");

        lbMdp.setText("Mot de passe :");

        btConnecter.setText("Se connecter");
        btConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConnecterActionPerformed(evt);
            }
        });

        btQuitter.setText("Quitter");
        btQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuitterActionPerformed(evt);
            }
        });

        lbReinitialiser.setText("Réinitialiser");
        lbReinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbReinitialiserActionPerformed(evt);
            }
        });

        chbmdp.setText("Afficher mot de passe");
        chbmdp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbmdpItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdentifiant)
                    .addComponent(lbMdp)
                    .addComponent(btQuitter))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbReinitialiser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btConnecter)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbmdp)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdentifiant)
                                .addComponent(txtMdp, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdentifiant)
                    .addComponent(txtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMdp)
                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbmdp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQuitter)
                    .addComponent(lbReinitialiser)
                    .addComponent(btConnecter))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btQuitterActionPerformed

    private void btConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConnecterActionPerformed
        try {
            //Récupération de l'identifiant et du mot de passe
            String username = txtIdentifiant.getText();
            String mdp = String.valueOf(txtMdp.getPassword());
            if (username.isEmpty() || mdp.isEmpty()) {
                //Message erreur si champs ID et MDP vides
                JOptionPane.showMessageDialog(this, "Vous devez entrer un identifiant et un mot de passe valident !", "Erreur Identification", JOptionPane.WARNING_MESSAGE);
            } else {
                int id = monDaoUtilisateur.checkLogin(username, mdp);
                //Vérification de l'identifiant et du mot de passe
                if (id == -1) {
                    //Message erreur si ID et MDP incorrects
                    JOptionPane.showMessageDialog(this, "Identifiant ou mot de passe incorrect. Réessayez", "Identifiant Invalide", JOptionPane.WARNING_MESSAGE);
                } else {
                    //Ouverture fenetre principale si ID et MDP corrects
                    this.dispose();
                    new FenetrePrincipale(monDaoUtilisateur, id).setVisible(true);
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btConnecterActionPerformed

    private void chbmdpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbmdpItemStateChanged
        if (chbmdp.isSelected() == true) {
            txtMdp.setEchoChar((char) 0); //Si la case est cochée le mdp est affiché
        } else {
            txtMdp.setEchoChar('●'); //Si la case est décochée le mdp est caché 
        }
    }//GEN-LAST:event_chbmdpItemStateChanged

    private void lbReinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbReinitialiserActionPerformed
        //Remise à zéro de tous les champs
        txtIdentifiant.setText("");
        txtMdp.setText("");
        chbmdp.setSelected(false);
    }//GEN-LAST:event_lbReinitialiserActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConnecter;
    private javax.swing.JButton btQuitter;
    private javax.swing.JCheckBox chbmdp;
    private javax.swing.JLabel lbIdentifiant;
    private javax.swing.JLabel lbMdp;
    private javax.swing.JButton lbReinitialiser;
    private javax.swing.JTextField txtIdentifiant;
    private javax.swing.JPasswordField txtMdp;
    // End of variables declaration//GEN-END:variables
}