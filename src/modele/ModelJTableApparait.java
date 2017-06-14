/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOApparait;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Apparait;
import metier.Evenement;

/**
 *
 * @author p1522867
 */
public class ModelJTableApparait extends AbstractTableModel {

    private String[] titre;
    private DAOApparait leDaoApparait;
    private List<Apparait> laListe;

    public ModelJTableApparait() throws Exception {
        leDaoApparait = new DAOApparait();
        laListe = new ArrayList<>();
        titre = new String[]{"Num Vip", "ID Photo"};

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
        Apparait apparait = laListe.get(row);
        switch (column) {
            case 0:
                return apparait.getNumVip();
            case 1:
                return apparait.getIdPhoto();

        }
        return null;
    }

    @Override
    public String getColumnName(int row) {
        return titre[row];
    }

    public void chargerApparait() throws Exception {
        laListe.clear();
        leDaoApparait.chargerApparait(laListe);
        this.fireTableDataChanged();
    }

    public void ajouterApparait(Apparait apparait) throws Exception {
        leDaoApparait.ajoutApparait(apparait);
        chargerApparait();
    }

    public void supprimerApparait(int numVip, String idPhoto) throws Exception {
        leDaoApparait.supprimerApparait(numVip, idPhoto);
        chargerApparait();
    }
}
