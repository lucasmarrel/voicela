/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOVip;
import metier.Vip;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class ModelJTable extends AbstractTableModel {

    private final DAOVip monDaoVip;
    private final List<Vip> listeVip;
    private final String[] titre;

    public ModelJTable() {
        monDaoVip = new DAOVip();
        listeVip = new ArrayList<>();
        titre = new String[]{"Numéro", "Prénom", "Nom", "Sexe", "Date de Naissance", "Lieu de Naissance", "Statut", "Rôle"};
    }

    @Override
    public int getRowCount() {
        return listeVip.size();
    }

    @Override
    public int getColumnCount() {
        return titre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Vip leVip = listeVip.get(row);
        switch (column) {
            case 0:
                return leVip.getNumVip();
            case 1:
                return leVip.getPrenomVip();
            case 2:
                return leVip.getNomVip();
            case 3:
                return leVip.getSexeVip();
            case 4:
                return leVip.getDateNaissanceVip();
            case 5:
                return leVip.getLieuNaissanceVip();
            case 6:
                return leVip.getStatutVip();
            case 7:
                return leVip.getRoleVip();
        }
        return null;

    }

    @Override
    public String getColumnName(int row) {
        return titre[row];
    }

    public void chargerVip() throws Exception {
        listeVip.clear();
        monDaoVip.chargerVip(listeVip);
        this.fireTableDataChanged();
    }

    public void supprimerVip(int id, int row) throws Exception {
        monDaoVip.supprimerVip(id);
        chargerVip();
    }

    public void ajouterVip(Vip leVip) throws Exception {
        monDaoVip.ajouterVip(leVip);
        chargerVip();
    }

    public Vip selectionVip(int row) {
        return listeVip.get(row);
    }

    public void modifierVip(Vip leVip, int oldNum) throws Exception {
        monDaoVip.modifierVip(leVip, oldNum);
        chargerVip();
    }

    public List<Vip> getVipList() {
        return listeVip;
    }
}
