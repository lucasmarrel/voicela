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
import metier.Apparait;

/**
 *
 * @author p1522867
 */
public class DAOApparait {

    Connection cnx;

    public DAOApparait() {

    }

    public void chargerApparait(List<Apparait> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        String requete = "Select m.numVip, concat(c1.prenomVip, ' ', c1.nomVip) AS vip, idPhoto FROM APPARAIT AS m JOIN VIP AS c1 ON m.numVip=c1.numVip";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            int numVip = rst.getInt(1);
            String nom = rst.getString(2);
            String idPhoto = rst.getString(3);

            Apparait apparait = new Apparait(numVip, nom, idPhoto);
            laListe.add(apparait);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void ajoutApparait(Apparait apparait) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "INSERT INTO APPARAIT VALUES (?,?)";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, apparait.getNumVip());
        pstmt.setString(2, apparait.getIdPhoto());
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void supprimerApparait(int numVip, String idPhoto) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "DELETE FROM APPARAIT WHERE numVip=? AND idPhoto=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, numVip);
        pstmt.setString(2, idPhoto);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

}
