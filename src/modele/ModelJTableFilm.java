/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOFilm;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Film;

/**
 *
 * @author lucas
 */
public class ModelJTableFilm extends AbstractTableModel {

    private DAOFilm leDaoFilm;
    private List<Film> laListe;
    private String[] titre;

    public ModelJTableFilm() {
        laListe = new ArrayList<>();
        leDaoFilm = new DAOFilm();
        titre = new String[]{"Visa", "Titre", "Sortie", "Genre"};
    }

    @Override
    public int getRowCount() {
        return laListe.size();
    }

    @Override
    public int getColumnCount() {
        return titre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Film leFilm = laListe.get(row);
        switch (column) {
            case 0:
                return leFilm.getNumVisa();
            case 1:
                return leFilm.getTitreFilm();
            case 2:
                return leFilm.getAnneeSortie();
            case 3:
                return leFilm.getGenreFilm();

        }
        return null;
    }

    @Override
    public String getColumnName(int row) {
        return titre[row];
    }

    public void chargerFilm() throws Exception {
        laListe.clear();
        leDaoFilm.chargerFilm(laListe);
        this.fireTableDataChanged();
    }

    public void ajouterFilm(Film leFilm) throws Exception {
        leDaoFilm.ajouterFilm(leFilm);
        chargerFilm();
    }

    public void supprimerFilm(int numVisa, int row) throws Exception {
        leDaoFilm.supprimerFilm(numVisa);
        chargerFilm();
    }

    public Film selectionnerFilm(int row) {
        return laListe.get(row);
    }

    public void modifierFilm(Film leFilm, int oldNumVisa) throws Exception {
        leDaoFilm.modifierFilm(leFilm, oldNumVisa);
        chargerFilm();
    }
}
