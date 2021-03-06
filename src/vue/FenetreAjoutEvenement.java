/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import metier.Evenement;
import modele.ModelComboBoxVip;
import modele.ModelJTable;

/**
 *
 * @author lucas
 */
public class FenetreAjoutEvenement extends javax.swing.JDialog {

    /**
     * Creates new form FenetreMariage
     */
    private boolean modal;
    private Evenement unEvenement;
    private ModelComboBoxVip leModelComboBoxVip;
    private ModelComboBoxVip leModelComboBoxConjoint;
    private ModelJTable leModelJTableVip;

    public FenetreAjoutEvenement(java.awt.Frame parent, Evenement unEvenement, ModelJTable leModelJTableVip) throws Exception {
        super(parent, true);
        this.unEvenement = unEvenement;
        this.leModelJTableVip = leModelJTableVip;
        leModelComboBoxVip = new ModelComboBoxVip();
        leModelComboBoxConjoint = new ModelComboBoxVip();
        initComponents();
        cbVipEvenement.setSelectedIndex(0);
        cbConjointEvenement.setSelectedIndex(0);
        modal = false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitreEvenement = new javax.swing.JLabel();
        lbNomVipEvenement = new javax.swing.JLabel();
        lbConjointEvenement = new javax.swing.JLabel();
        cbConjointEvenement = new javax.swing.JComboBox<>();
        lbDateMariage = new javax.swing.JLabel();
        lbJourtMariage = new javax.swing.JLabel();
        txtJourMariage = new javax.swing.JTextField();
        lbMoisMariage = new javax.swing.JLabel();
        txtMoisMariage = new javax.swing.JTextField();
        txtAnneeMariage = new javax.swing.JTextField();
        lbAnnéeMariage = new javax.swing.JLabel();
        lbDateDivorce = new javax.swing.JLabel();
        lbJourDivorce = new javax.swing.JLabel();
        txtJourDivorce = new javax.swing.JTextField();
        lbMoisDivorce = new javax.swing.JLabel();
        txtMoisDivorce = new javax.swing.JTextField();
        lbAnnéeDivorce = new javax.swing.JLabel();
        txtAnneeDivorce = new javax.swing.JTextField();
        btValiderEvenement = new javax.swing.JButton();
        btAnnulerEvenement = new javax.swing.JButton();
        cbVipEvenement = new javax.swing.JComboBox<>();
        lbLieuMariage = new javax.swing.JLabel();
        txtLieuMariage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitreEvenement.setText("EVENEMENT VIP");

        lbNomVipEvenement.setText("Vip :");

        lbConjointEvenement.setText("Conjoint");

        cbConjointEvenement.setModel(leModelComboBoxConjoint);

        lbDateMariage.setText("Date Mariage :");

        lbJourtMariage.setText("Jour");

        lbMoisMariage.setText("Mois");

        lbAnnéeMariage.setText("Année");

        lbDateDivorce.setText("Date Divorce :");

        lbJourDivorce.setText("Jour");

        lbMoisDivorce.setText("Mois");

        lbAnnéeDivorce.setText("Année");

        btValiderEvenement.setText("Valider");
        btValiderEvenement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValiderEvenementActionPerformed(evt);
            }
        });

        btAnnulerEvenement.setText("Annuler");
        btAnnulerEvenement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnulerEvenementActionPerformed(evt);
            }
        });

        cbVipEvenement.setModel(leModelComboBoxVip);

        lbLieuMariage.setText("Lieu :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lbTitreEvenement))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbNomVipEvenement)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                    .addComponent(cbVipEvenement, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbConjointEvenement)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbLieuMariage)
                                            .addGap(32, 32, 32)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbConjointEvenement, 0, 163, Short.MAX_VALUE)
                                        .addComponent(txtLieuMariage))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDateMariage)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbJourtMariage)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtJourMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbMoisMariage)
                                            .addGap(6, 6, 6)
                                            .addComponent(txtMoisMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbAnnéeMariage)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAnneeMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbDateDivorce, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lbJourDivorce)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtJourDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lbMoisDivorce)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(txtMoisDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lbAnnéeDivorce)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtAnneeDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btValiderEvenement)
                                                    .addGap(32, 32, 32)
                                                    .addComponent(btAnnulerEvenement))))))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitreEvenement)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomVipEvenement)
                    .addComponent(cbVipEvenement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConjointEvenement)
                    .addComponent(cbConjointEvenement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLieuMariage)
                    .addComponent(txtLieuMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(lbDateMariage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJourtMariage)
                    .addComponent(txtJourMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMoisMariage)
                    .addComponent(txtMoisMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnnéeMariage)
                    .addComponent(txtAnneeMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbDateDivorce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJourDivorce)
                    .addComponent(txtJourDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMoisDivorce)
                    .addComponent(txtMoisDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnnéeDivorce)
                    .addComponent(txtAnneeDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btValiderEvenement)
                    .addComponent(btAnnulerEvenement))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAnnulerEvenementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnnulerEvenementActionPerformed
        this.dispose();
    }//GEN-LAST:event_btAnnulerEvenementActionPerformed

    private void btValiderEvenementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValiderEvenementActionPerformed
        try {
            int numVip1 = (int) leModelJTableVip.getValueAt(cbVipEvenement.getSelectedIndex(), 0);
            int numVip2 = (int) leModelJTableVip.getValueAt(cbConjointEvenement.getSelectedIndex(), 0);
            unEvenement.setVip1(numVip1);
            unEvenement.setVip2(numVip2);

            String jourMariage = txtJourMariage.getText();
            if (jourMariage.isEmpty()) {
                throw new Exception("Champ jour vide");
            }

            String moisMariage = txtMoisMariage.getText();
            if (moisMariage.isEmpty()) {
                throw new Exception("Champ mois vide");
            }

            String anneeMariage = txtAnneeMariage.getText();
            if (anneeMariage.isEmpty()) {
                throw new Exception("Champ annee vide");
            }

            String lieuMariage = txtLieuMariage.getText();
            if (lieuMariage.isEmpty()) {
                throw new Exception("Champ lieu vide");
            }
            unEvenement.setLieuMariage(lieuMariage);

            String jourDivorce = txtJourDivorce.getText();
            String moisDivorce = txtMoisDivorce.getText();
            String anneeDivorce = txtAnneeDivorce.getText();

            LocalDate dateMariage = LocalDate.of(
                    Integer.parseInt(anneeMariage),
                    Integer.parseInt(moisMariage),
                    Integer.parseInt(jourMariage)
            );
            unEvenement.setDateMariage(dateMariage);

            if (!jourDivorce.isEmpty() && !moisDivorce.isEmpty() && !anneeDivorce.isEmpty()) {
                LocalDate dateDivorce = LocalDate.of(
                        Integer.parseInt(anneeDivorce),
                        Integer.parseInt(moisDivorce),
                        Integer.parseInt(jourDivorce)
                );
                unEvenement.setDateDivorce(dateDivorce);
            }
            modal = true;
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btValiderEvenementActionPerformed

    /**
     * @param args the command line arguments
     */
    public boolean doModal() {
        return modal;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnnulerEvenement;
    private javax.swing.JButton btValiderEvenement;
    private javax.swing.JComboBox<String> cbConjointEvenement;
    private javax.swing.JComboBox<String> cbVipEvenement;
    private javax.swing.JLabel lbAnnéeDivorce;
    private javax.swing.JLabel lbAnnéeMariage;
    private javax.swing.JLabel lbConjointEvenement;
    private javax.swing.JLabel lbDateDivorce;
    private javax.swing.JLabel lbDateMariage;
    private javax.swing.JLabel lbJourDivorce;
    private javax.swing.JLabel lbJourtMariage;
    private javax.swing.JLabel lbLieuMariage;
    private javax.swing.JLabel lbMoisDivorce;
    private javax.swing.JLabel lbMoisMariage;
    private javax.swing.JLabel lbNomVipEvenement;
    private javax.swing.JLabel lbTitreEvenement;
    private javax.swing.JTextField txtAnneeDivorce;
    private javax.swing.JTextField txtAnneeMariage;
    private javax.swing.JTextField txtJourDivorce;
    private javax.swing.JTextField txtJourMariage;
    private javax.swing.JTextField txtLieuMariage;
    private javax.swing.JTextField txtMoisDivorce;
    private javax.swing.JTextField txtMoisMariage;
    // End of variables declaration//GEN-END:variables
}
