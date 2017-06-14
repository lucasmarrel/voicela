/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOCasting;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Casting;

/**
 *
 * @author lucas
 */
public class ModelJTableCasting extends AbstractTableModel {

    private String[] titre;
    private DAOCasting leDaoCasting;
    private List<Casting> laListe;

    public ModelJTableCasting() throws Exception {
        leDaoCasting = new DAOCasting();
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
        Casting leCasting = laListe.get(row);
        switch (column) {
            case 0:
                return leCasting.getNumVisa();
            case 1:
                return leCasting.getTitreFilm();
            case 2:
                return leCasting.getNumVip();
            case 3:
                return leCasting.getNomVip();

        }
        return null;
    }

    @Override
    public String getColumnName(int row) {
        return titre[row];
    }

    public void chargerCasting() throws Exception {
        laListe.clear();
        leDaoCasting.chargerCasting(laListe);
        this.fireTableDataChanged();
    }

    public void ajouterCasting(Casting leCasting) throws Exception {
        leDaoCasting.ajoutCasting(leCasting);
        chargerCasting();
    }

    public void supprimerCasting(int numVisa, int numVip) throws Exception {
        leDaoCasting.supprimerCasting(numVisa, numVip);
        chargerCasting();
    }

}
