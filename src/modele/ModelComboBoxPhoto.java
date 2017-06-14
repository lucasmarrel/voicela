/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOPhoto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author p1522867
 */
public class ModelComboBoxPhoto extends DefaultComboBoxModel<String> {

    List<String> nomListe;
    DAOPhoto leDaoPhoto;

    public ModelComboBoxPhoto() throws Exception {
        leDaoPhoto = new DAOPhoto();
        nomListe = new ArrayList<>();
        leDaoPhoto.chargerNomPhoto(nomListe);
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
