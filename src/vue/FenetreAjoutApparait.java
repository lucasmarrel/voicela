/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import modele.ModelComboBoxPhoto;
import modele.ModelComboBoxVip;
import modele.ModelJTable;
import metier.Apparait;

/**
 *
 * @author p1522867
 */
public class FenetreAjoutApparait extends javax.swing.JDialog {

    /**
     * Creates new form FenetreAjoutApparait
     */
    private ModelComboBoxVip leModelComboBoxVip;
    private ModelComboBoxPhoto leModelComboBoxPhoto;
    private ModelJTable modelTableVip;
    private boolean modal;
    private Apparait apparait;

    public FenetreAjoutApparait(java.awt.Frame parent, Apparait apparait, ModelJTable modelTableVip) throws Exception {
        super(parent, true);
        modal = false;
        leModelComboBoxVip = new ModelComboBoxVip();
        leModelComboBoxPhoto = new ModelComboBoxPhoto();
        this.modelTableVip = modelTableVip;
        this.apparait = apparait;

        initComponents();
        cbVip.setSelectedIndex(0);
        cbPhoto.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitre = new javax.swing.JLabel();
        lbVip = new javax.swing.JLabel();
        cbVip = new javax.swing.JComboBox<>();
        lbPhoto = new javax.swing.JLabel();
        cbPhoto = new javax.swing.JComboBox<>();
        btAjouter = new javax.swing.JButton();
        btAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitre.setText("AJOUT APPARITION VIP PHOTO");

        lbVip.setText("Nom VIP :");

        cbVip.setModel(leModelComboBoxVip);

        lbPhoto.setText("Nom Photo :");

        cbPhoto.setModel(leModelComboBoxPhoto);

        btAjouter.setText("Valider");
        btAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjouterActionPerformed(evt);
            }
        });

        btAnnuler.setText("Annuler");
        btAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbTitre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbPhoto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbVip)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbVip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbPhoto, 0, 125, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btAjouter)
                                .addGap(28, 28, 28)
                                .addComponent(btAnnuler)
                                .addGap(10, 10, 10)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitre)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVip)
                    .addComponent(cbVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhoto)
                    .addComponent(cbPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAjouter)
                    .addComponent(btAnnuler))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjouterActionPerformed
        int numVip = (int) modelTableVip.getValueAt(cbVip.getSelectedIndex(), 0);
        String nomPhoto = (String) cbPhoto.getSelectedItem();
        apparait.setIdPhoto(nomPhoto);
        apparait.setNumVip(numVip);

        modal = true;
        this.dispose();

    }//GEN-LAST:event_btAjouterActionPerformed

    private void btAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btAnnulerActionPerformed

    /**
     * @param args the command line arguments
     */
    public boolean doModal() {
        return modal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjouter;
    private javax.swing.JButton btAnnuler;
    private javax.swing.JComboBox<String> cbPhoto;
    private javax.swing.JComboBox<String> cbVip;
    private javax.swing.JLabel lbPhoto;
    private javax.swing.JLabel lbTitre;
    private javax.swing.JLabel lbVip;
    // End of variables declaration//GEN-END:variables
}