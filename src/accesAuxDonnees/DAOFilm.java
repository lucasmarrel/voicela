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
import metier.Film;

/**
 *
 * @author lucas
 */
public class DAOFilm {

    Connection cnx;

    public DAOFilm() {

    }

    public void chargerFilm(List<Film> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT * FROM FILM";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            int numVisa = rst.getInt(1);
            String titreFilm = rst.getString(2);
            int anneeSortie = rst.getInt(3);
            String genreFilm = rst.getString(4);

            Film leFilm = new Film(numVisa, titreFilm, anneeSortie, genreFilm);
            laListe.add(leFilm);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void ajouterFilm(Film leFilm) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "INSERT INTO FILM VALUES (?,?,?,?)";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, leFilm.getNumVisa());
        pstmt.setString(2, leFilm.getTitreFilm());
        pstmt.setInt(3, leFilm.getAnneeSortie());
        pstmt.setString(4, leFilm.getGenreFilm());
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void supprimerFilm(int numVisa) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "DELETE FROM FILM WHERE numVisa=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, numVisa);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void modifierFilm(Film leFilm, int oldNumVisa) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "UPDATE FILM SET numVisa=?, titreFilm=?, anneeSortie=?, nomGenre=? WHERE numVisa=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, leFilm.getNumVisa());
        pstmt.setString(2, leFilm.getTitreFilm());
        pstmt.setInt(3, leFilm.getAnneeSortie());
        pstmt.setString(4, leFilm.getGenreFilm());
        pstmt.setInt(5, oldNumVisa);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void chargerNomFilm(List<String> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT titreFilm FROM FILM";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            String titreFilm = rst.getString(1);

            laListe.add(titreFilm);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }
}
