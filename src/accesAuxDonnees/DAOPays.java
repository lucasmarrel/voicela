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
import metier.Pays;

/**
 *
 * @author lucas
 */
public class DAOPays {

    Connection cnx;

    public DAOPays() {

    }

    public void chargerPays(List<Pays> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT * FROM PAYS";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();

        while (rst.next()) {
            String nomPays = rst.getString(1);
            Pays lePays = new Pays(nomPays);
            laListe.add(lePays);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

}
