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
import metier.Realisation;

/**
 *
 * @author lucas
 */
public class DAORealisation {

    Connection cnx;

    public DAORealisation() {

    }

    public void chargerRealisation(List<Realisation> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        String requete = "Select m.numVisa,c2.titreFilm, m.numVip, concat(c1.prenomVip, ' ', c1.nomVip) AS vip1 FROM REALISATION AS m JOIN VIP AS c1 ON m.numVip=c1.numVip JOIN FILM AS c2 ON m.numVisa = c2.numVisa ORDER BY titreFilm";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            int numVisa = rst.getInt(1);
            String titreFilm = rst.getString(2);
            int numVip = rst.getInt(3);
            String nomVip = rst.getString(4);

            Realisation laRealisation = new Realisation(numVisa,titreFilm, numVip, nomVip);
            laListe.add(laRealisation);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void ajoutRealisation(Realisation laRealisation) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "INSERT INTO REALISATION VALUES (?,?)";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, laRealisation.getNumVisa());
        pstmt.setInt(2, laRealisation.getNumVip());
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void supprimerRealisation(int numVisa, int numVip) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "DELETE FROM REALISATION WHERE numVisa=? AND numVip=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, numVisa);
        pstmt.setInt(2, numVip);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }
}
