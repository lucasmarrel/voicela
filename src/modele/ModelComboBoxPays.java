/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import applivoicela.Appli;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import metier.Pays;

/**
 *
 * @author lucas
 */
public class ModelComboBoxPays extends DefaultComboBoxModel<String> {

    List<Pays> laListe;

    public ModelComboBoxPays() throws Exception {
        laListe = Appli.getListPays();
    }

    @Override
    public int getSize() {
        return laListe.size();
    }

    @Override
    public String getElementAt(int i) {
        return laListe.get(i).getNomPays();
    }

}
