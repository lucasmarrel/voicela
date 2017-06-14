/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOGenreFilm;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import metier.Genre;

/**
 *
 * @author lucas
 */
public class ModelComboBoxGenre extends DefaultComboBoxModel<String> {

    List<Genre> laListe;
    DAOGenreFilm leDaoGenreFilm;

    public ModelComboBoxGenre() throws Exception {
        laListe = new ArrayList<>();
        leDaoGenreFilm = new DAOGenreFilm();
        leDaoGenreFilm.chargerGenreFilm(laListe);
    }

    @Override
    public int getSize() {
        return laListe.size();
    }

    @Override
    public String getElementAt(int i) {
        return laListe.get(i).getGenreFilm();
    }
}
