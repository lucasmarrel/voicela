/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DAOPhoto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Photo;

/**
 *
 * @author lucas
 */
public class ModelJTablePhoto extends AbstractTableModel {

    private DAOPhoto leDaoPhoto;
    private List<Photo> laListe;
    private String[] titre;

    public ModelJTablePhoto() {
        laListe = new ArrayList<>();
        leDaoPhoto = new DAOPhoto();
        titre = new String[]{"Nom", "Lieu", "Année"};
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
        Photo laPhoto = laListe.get(row);
        switch (column) {
            case 0:
                return laPhoto.getIdPhoto();
            case 1:
                return laPhoto.getLieuPhoto();
            case 2:
                return laPhoto.getAnneePhoto();
        }
        return null;
    }

    @Override
    public String getColumnName(int row) {
        return titre[row];
    }

    public void chargerPhoto() throws Exception {
        laListe.clear();
        leDaoPhoto.chargerPhoto(laListe);
        this.fireTableDataChanged();
    }

    public void ajouterFilm(Photo laPhoto) throws Exception {
        leDaoPhoto.ajouterPhoto(laPhoto);
        chargerPhoto();
    }

    public void supprimerPhoto(String idPhoto, int row) throws Exception {
        leDaoPhoto.supprimerPhoto(idPhoto);
        chargerPhoto();
    }

    public Photo selectionnerPhoto(int row) {
        return laListe.get(row);
    }

    public void modifierPhoto(Photo laPhoto, String oldidPhoto) throws Exception {
        leDaoPhoto.modifierPhoto(laPhoto, oldidPhoto);
        chargerPhoto();
    }
}
