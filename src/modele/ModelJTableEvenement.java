/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOEvenement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Evenement;

/**
 *
 * @author lucas
 */
public class ModelJTableEvenement extends AbstractTableModel {

    private String[] titre;
    private DAOEvenement leDaoEvenement;
    private List<Evenement> laListe;

    public ModelJTableEvenement() throws Exception {
        leDaoEvenement = new DAOEvenement();
        laListe = new ArrayList<>();
        titre = new String[]{"Num Vip1", "Nom Vip1", "Num Vip2", "Nom Vip2", "Date Mariage", "Lieu Mariage", "Date Divorce"};

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
        Evenement unEvenement = laListe.get(row);
        switch (column) {
            case 0:
                return unEvenement.getVip1();
            case 1:
                return unEvenement.getNomVip1();
            case 2:
                return unEvenement.getVip2();
            case 3:
                return unEvenement.getNomVip2();
            case 4:
                return unEvenement.getDateMariage();
            case 5:
                return unEvenement.getLieuMariage();
            case 6:
                return unEvenement.getDateDivorce();

        }
        return null;
    }

    @Override
    public String getColumnName(int row) {
        return titre[row];
    }

    public void chargerEvenement() throws Exception {
        laListe.clear();
        leDaoEvenement.chargerEvenement(laListe);
        this.fireTableDataChanged();
    }

    public void ajouterEvenement(Evenement unEvenement) throws Exception {
        leDaoEvenement.ajoutEvenement(unEvenement);
        chargerEvenement();
    }

    public void supprimerEvenement(int numEvenement, int row, LocalDate date) throws Exception {
        leDaoEvenement.supprimerEvenement(numEvenement, date);
        chargerEvenement();
    }

    public Evenement selectionnerEvenement(int row) {
        return laListe.get(row);
    }

    public void modifierEvenement(Evenement unEvenement, LocalDate oldDateMariage) throws Exception {
        leDaoEvenement.modifierEvenement(unEvenement, oldDateMariage);
        chargerEvenement();
    }
}
