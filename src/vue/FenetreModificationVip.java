/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import modele.ModelComboBox;
import metier.Vip;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import modele.ModelComboBoxPays;

/**
 *
 * @author lucas
 */
public class FenetreModificationVip extends javax.swing.JDialog {

    /**
     * Creates new form FenetreModification
     */
    private Vip leVip;
    private boolean modal;
    private ModelComboBoxPays leModel;
    private String[] listeSexe = ModelComboBox.listeSexe();
    private String[] listeRole = ModelComboBox.listeRole();
    private String[] listeStatut = ModelComboBox.listeStatut();

    public FenetreModificationVip(java.awt.Frame parent, Vip leVip) {
        super(parent, true);
        try {
            modal = false;
            this.leVip = leVip;
            leModel = new ModelComboBoxPays();
            initComponents();
            txtNum.setText(String.valueOf(leVip.getNumVip()));
            txtPrenom.setText(leVip.getPrenomVip());
            txtNom.setText(leVip.getNomVip());
            cbPays.setSelectedItem(leVip.getLieuNaissanceVip());

            switch (leVip.getSexeVip()) {
                case "M":
                    cbSexe.setSelectedIndex(0);
                    break;
                case "F":
                    cbSexe.setSelectedIndex(1);
                    break;
            }

            switch (leVip.getRoleVip()) {
                case "A":
                    cbRole.setSelectedIndex(0);
                    break;
                case "R":
                    cbRole.setSelectedIndex(1);
                    break;
                case "AR":
                    cbRole.setSelectedIndex(2);
                    break;
            }

            switch (leVip.getStatutVip()) {
                case "C":
                    cbStatut.setSelectedIndex(0);
                    break;
                case "M":
                    cbStatut.setSelectedIndex(1);
                    break;
                case "D":
                    cbStatut.setSelectedIndex(2);
                    break;
            }

            txtJour.setText(String.valueOf(leVip.getDateNaissanceVip().getDayOfMonth()));
            txtMois.setText(String.valueOf(leVip.getDateNaissanceVip().getMonthValue()));
            txtAnnee.setText(String.valueOf(leVip.getDateNaissanceVip().getYear()));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }

    public boolean doModal() {
        return modal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbPrenom = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();
        lbSexe = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        lbTitre = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        cbSexe = new javax.swing.JComboBox<>();
        cbRole = new javax.swing.JComboBox<>();
        txtJour = new javax.swing.JTextField();
        txtMois = new javax.swing.JTextField();
        txtAnnee = new javax.swing.JTextField();
        lbIdentifiant9 = new javax.swing.JLabel();
        lbIdentifiant10 = new javax.swing.JLabel();
        lbIdentifiant11 = new javax.swing.JLabel();
        cbStatut = new javax.swing.JComboBox<>();
        lbStatut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btModifier = new javax.swing.JButton();
        btAnnuler = new javax.swing.JButton();
        lbLieu = new javax.swing.JLabel();
        cbPays = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbPrenom.setText("Prénom :");

        lbNum.setText("Numéro :");

        lbSexe.setText("Sexe :");

        lbDate.setText("Date de naissance :");

        lbRole.setText("Rôle :");

        lbNom.setText("Nom :");

        lbTitre.setText("MODIFIER UN VIP");

        cbSexe.setModel(new javax.swing.DefaultComboBoxModel<>(listeSexe));

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(listeRole));

        lbIdentifiant9.setText("Jour");

        lbIdentifiant10.setText("Mois");

        lbIdentifiant11.setText("Année");

        cbStatut.setModel(new javax.swing.DefaultComboBoxModel<>(listeStatut));

        lbStatut.setText("Statut :");

        btModifier.setText("Modifier");
        btModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifierActionPerformed(evt);
            }
        });

        btAnnuler.setText("Annuler");
        btAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btModifier)
                .addGap(32, 32, 32)
                .addComponent(btAnnuler)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btModifier)
                    .addComponent(btAnnuler))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbLieu.setText("Lieu Naissance:");

        cbPays.setModel(leModel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbTitre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbIdentifiant9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbIdentifiant10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbIdentifiant11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPrenom)
                                    .addComponent(lbDate)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNum)
                                            .addComponent(lbNom)
                                            .addComponent(lbSexe))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(txtNum)
                                            .addComponent(txtNom)
                                            .addComponent(cbSexe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbStatut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbStatut, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbRole)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbLieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPays, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTitre)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNum)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrenom)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNom))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexe)
                    .addComponent(cbSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdentifiant9)
                    .addComponent(lbIdentifiant10)
                    .addComponent(lbIdentifiant11)
                    .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPays, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatut))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRole)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifierActionPerformed
        try {
            int reponse = JOptionPane.showConfirmDialog(this, "Valider la modification ?", "Validation", JOptionPane.YES_NO_OPTION);
            if (reponse == JOptionPane.YES_OPTION) {

                int id = Integer.parseInt(txtNum.getText());
                if (txtNum.getText().isEmpty()) {
                    throw new Exception("Champ numéro vide");
                }
                if (Integer.parseInt(txtNum.getText()) < 0) {
                    throw new Exception("Numéro doit etre positif");
                }
                leVip.setNumVip(id);

                String prenom = txtPrenom.getText();
                if (prenom.isEmpty()) {
                    throw new Exception("Champ prenom vide");
                }
                leVip.setPrenomVip(prenom);

                String nom = txtNom.getText();
                if (nom.isEmpty()) {
                    throw new Exception("Champ nom vide");
                }
                leVip.setNomVip(nom);

                String jour = txtJour.getText();
                if (jour.isEmpty()) {
                    throw new Exception("Champ jour vide");
                }

                String mois = txtMois.getText();
                if (mois.isEmpty()) {
                    throw new Exception("Champ mois vide");
                }

                String annee = txtAnnee.getText();
                if (annee.isEmpty()) {
                    throw new Exception("Champ annee vide");
                }

                String lieu = (String) cbPays.getSelectedItem();
                if (lieu.isEmpty()) {
                    throw new Exception("Champ lieu vide");
                }
                leVip.setLieuNaissanceVip(lieu);

                LocalDate date = LocalDate.of(
                        Integer.parseInt(annee),
                        Integer.parseInt(mois),
                        Integer.parseInt(jour)
                );

                LocalDate dateAuj = LocalDate.now();

                if (date.isAfter(dateAuj)) {
                    throw new Exception("Date postérieure à aujourd'hui");
                }

                leVip.setDateNaissanceVip(date);

                String sexe = "";
                switch (cbSexe.getSelectedIndex()) {
                    case 0:
                        leVip.setSexeVip("M");
                        break;
                    case 1:
                        leVip.setSexeVip("F");
                        break;
                }

                String role = "";
                switch (cbRole.getSelectedIndex()) {
                    case 0:
                        leVip.setRoleVip("A");
                        break;
                    case 1:
                        leVip.setRoleVip("R");
                        break;
                    case 2:
                        leVip.setRoleVip("AR");
                        break;
                }

                String statut = "";
                switch (cbStatut.getSelectedIndex()) {
                    case 0:
                        leVip.setStatutVip("C");
                        break;
                    case 1:
                        leVip.setStatutVip("M");
                        break;
                    case 2:
                        leVip.setStatutVip("D");
                        break;
                }

                modal = true;
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btModifierActionPerformed

    private void btAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btAnnulerActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnnuler;
    private javax.swing.JButton btModifier;
    private javax.swing.JComboBox<String> cbPays;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JComboBox<String> cbSexe;
    private javax.swing.JComboBox<String> cbStatut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbIdentifiant10;
    private javax.swing.JLabel lbIdentifiant11;
    private javax.swing.JLabel lbIdentifiant9;
    private javax.swing.JLabel lbLieu;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbSexe;
    private javax.swing.JLabel lbStatut;
    private javax.swing.JLabel lbTitre;
    private javax.swing.JTextField txtAnnee;
    private javax.swing.JTextField txtJour;
    private javax.swing.JTextField txtMois;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
}
