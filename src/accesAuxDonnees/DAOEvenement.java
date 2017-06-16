/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.util.List;
import metier.Evenement;

/**
 *
 * @author lucas
 */
public class DAOEvenement {

    Connection cnx;

    public DAOEvenement() {

    }

    public void chargerEvenement(List<Evenement> laListe) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        LocalDate dateDivorce = null;
        String requete = "Select m.numVip1, concat(c1.prenomVip, ' ', c1.nomVip) AS vip1, m.numVip2, concat(c2.prenomVip,' ', c2.nomVip) AS vip2, m.dateMariage, m.lieuMariage, m.dateDivorce\n" +
                            "FROM EVENEMENT AS m \n" +
                            "JOIN VIP AS c1 ON m.numVip1=c1.numVip \n" +
                            "JOIN VIP AS c2 ON m.numVip2 = c2.numVip ";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            int vip1 = rst.getInt(1);
            String nomVip1 =rst.getString(2);
            int vip2 = rst.getInt(3);
            String nomVip2 = rst.getString(4);
            LocalDate dateMariage = rst.getDate(5).toLocalDate();
            String lieuMariage = rst.getString(6);
            if (rst.getDate(7) != null) {
                dateDivorce = rst.getDate(7).toLocalDate();
            }else{
                dateDivorce=null;
            }

            Evenement unEvenement = new Evenement(vip1, nomVip1, vip2, nomVip2, dateMariage, lieuMariage, dateDivorce);
            laListe.add(unEvenement);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void ajoutEvenement(Evenement unEvenement) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "INSERT INTO EVENEMENT VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, unEvenement.getVip1());
        pstmt.setDate(2, Date.valueOf(unEvenement.getDateMariage()));
        pstmt.setInt(3, unEvenement.getVip2());
        pstmt.setString(4, unEvenement.getLieuMariage());
        if (unEvenement.getDateDivorce() == null) {
            pstmt.setNull(5, Types.DATE);
        } else {
            pstmt.setDate(5, Date.valueOf(unEvenement.getDateDivorce()));
        }
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void supprimerEvenement(int numVip, LocalDate date) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "DELETE FROM EVENEMENT WHERE numVip1=? AND dateMariage=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, numVip);
        pstmt.setDate(2, Date.valueOf(date));
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void modifierEvenement(Evenement unEvenement, LocalDate oldDateMariage) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();

        String requete = "UPDATE EVENEMENT SET dateMariage =?,lieuMariage=?, dateDivorce=? WHERE numVip1=? AND dateMariage=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
//        pstmt.setInt(1, unEvenement.getVip1());
        pstmt.setDate(1, Date.valueOf(unEvenement.getDateMariage()));
//        pstmt.setInt(3,unEvenement.getVip2());
        pstmt.setString(2, unEvenement.getLieuMariage());
        if (unEvenement.getDateDivorce() == null) {
            pstmt.setNull(3, Types.DATE);
        } else {
            pstmt.setDate(3, Date.valueOf(unEvenement.getDateDivorce()));
        }
        pstmt.setInt(4, unEvenement.getVip1());
        pstmt.setDate(5, Date.valueOf(oldDateMariage));
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

}
