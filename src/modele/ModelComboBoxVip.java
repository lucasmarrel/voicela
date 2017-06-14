/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOVip;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author lucas
 */
public class ModelComboBoxVip extends DefaultComboBoxModel<String> {

    List<String> nomListe;
    DAOVip leDaoVip;

    public ModelComboBoxVip() throws Exception {
        leDaoVip = new DAOVip();
        nomListe = new ArrayList<>();
        leDaoVip.chargerNomVip(nomListe);
    }

    @Override
    public int getSize() {
        return nomListe.size();
    }

    @Override
    public String getElementAt(int i) {
        return nomListe.get(i);
    }
}
