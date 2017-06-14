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
import metier.Genre;

/**
 *
 * @author lucas
 */
public class DAOGenreFilm {

    Connection cnx;

    public DAOGenreFilm() {

    }

    public void chargerGenreFilm(List<Genre> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT * FROM GENRE";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            String genreFilm = rst.getString(1);
            Genre leGenre = new Genre(genreFilm);
            laListe.add(leGenre);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

}
