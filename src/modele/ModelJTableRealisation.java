/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOCasting;
import accesAuxDonnees.DAORealisation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Casting;
import metier.Realisation;

/**
 *
 * @author lucas
 */
public class ModelJTableRealisation extends AbstractTableModel {

    private String[] titre;
    private DAORealisation leDaoRealisation;
    private List<Realisation> laListe;

    public ModelJTableRealisation() throws Exception {
        leDaoRealisation = new DAORealisation();
        laListe = new ArrayList<>();
        titre = new String[]{"Numero Visa", "Titre Film", "Numero VIP", "Nom VIP"};

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
        Realisation laRealisation = laListe.get(row);
        switch (column) {
            case 0:
                return laRealisation.getNumVisa();
            case 1:
                return laRealisation.getTitreFilm();
            case 2:
                return laRealisation.getNumVip();
            case 3:
                return laRealisation.getNomVip();

        }
        return null;
    }

    @Override
    public String getColumnName(int row) {
        return titre[row];
    }

    public void chargerRealisation() throws Exception {
        laListe.clear();
        leDaoRealisation.chargerRealisation(laListe);
        this.fireTableDataChanged();
    }

    public void ajouterRealisation(Realisation leCasting) throws Exception {
        leDaoRealisation.ajoutRealisation(leCasting);
        chargerRealisation();
    }

    public void supprimerRealisation(int numVisa, int numVip) throws Exception {
        leDaoRealisation.supprimerRealisation(numVisa, numVip);
        chargerRealisation();
    }

}
