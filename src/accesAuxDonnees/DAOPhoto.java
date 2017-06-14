/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import metier.Photo;

/**
 *
 * @author lucas
 */
public class DAOPhoto {

    Connection cnx;

    public DAOPhoto() {

    }

    public void chargerPhoto(List<Photo> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT * FROM PHOTO";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            String idPhoto = rst.getString(1);
            String lieuPhoto = rst.getString(2);
            int anneePhoto = rst.getInt(3);
            Photo laPhoto = new Photo(idPhoto, lieuPhoto, anneePhoto);
            laListe.add(laPhoto);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void ajouterPhoto(Photo laPhoto) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "INSERT INTO PHOTO VALUES (?,?,?)";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setString(1, laPhoto.getIdPhoto());
        pstmt.setString(2, laPhoto.getLieuPhoto());
        pstmt.setInt(3, laPhoto.getAnneePhoto());
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void modifierPhoto(Photo laPhoto, String oldIdPhoto) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "UPDATE PHOTO SET idPhoto = ?, lieuPhoto=?, anneePhoto = ? WHERE idPhoto=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setString(1, laPhoto.getIdPhoto());
        pstmt.setString(2, laPhoto.getLieuPhoto());
        pstmt.setInt(3, laPhoto.getAnneePhoto());
        pstmt.setString(4, oldIdPhoto);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void chargerNomPhoto(List<String> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT idPhoto FROM PHOTO";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            String idPhoto = rst.getString(1);
            laListe.add(idPhoto);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void supprimerPhoto(String idPhoto) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "DELETE FROM PHOTO WHERE idPhoto = ?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setString(1, idPhoto);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

}
