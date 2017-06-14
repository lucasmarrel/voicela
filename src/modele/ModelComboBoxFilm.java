/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOFilm;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author lucas
 */
public class ModelComboBoxFilm extends DefaultComboBoxModel<String> {

    List<String> laListe;
    DAOFilm leDaoFilm;

    public ModelComboBoxFilm() throws Exception {
        laListe = new ArrayList<>();
        leDaoFilm = new DAOFilm();
        leDaoFilm.chargerNomFilm(laListe);
    }

    @Override
    public int getSize() {
        return laListe.size();
    }

    @Override
    public String getElementAt(int i) {
        return laListe.get(i);
    }

}
