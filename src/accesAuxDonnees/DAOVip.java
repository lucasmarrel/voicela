/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import metier.Vip;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author lucas
 */
public class DAOVip {

    private Connection cnx;

    public DAOVip() {
    }

    public void chargerVip(List<Vip> listVip) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        String requete = "SELECT * FROM VIP";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {
            int num = rst.getInt(1);
            String prenom = rst.getString(2);
            String nom = rst.getString(3);
            String sexe = rst.getString(4);
            LocalDate dateNaissance = rst.getDate(5).toLocalDate();
            String lieuNaissance = rst.getString(6);
            String statut = rst.getString(7);
            String role = rst.getString(8);
            Vip leVip = new Vip(num, prenom, nom, sexe, dateNaissance, lieuNaissance, statut, role);
            listVip.add(leVip);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void chargerNomVip(List<String> listNomVip) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        String requete = "SELECT prenomVip, nomVip FROM VIP";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rst = pstmt.executeQuery();
        while (rst.next()) {

            String nom = rst.getString(1) + " " + rst.getString(2);;
            listNomVip.add(nom);
        }

        rst.close();
        pstmt.close();
        cnx.close();

    }

    public void supprimerVip(int id) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        String requete = "DELETE FROM VIP WHERE numVip = ?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void ajouterVip(Vip leVip) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        String requete = "INSERT INTO VIP VALUES (?,?,?,?,?,?,'C',?)";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, leVip.getNumVip());
        pstmt.setString(2, leVip.getPrenomVip());
        pstmt.setString(3, leVip.getNomVip());
        pstmt.setString(4, leVip.getSexeVip());
        pstmt.setDate(5, Date.valueOf(leVip.getDateNaissanceVip()));
        pstmt.setString(6, leVip.getLieuNaissanceVip());
        pstmt.setString(7, leVip.getRoleVip());
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

    public void modifierVip(Vip leVip, int oldNum) throws SQLException, Exception {
        cnx = SourceMariaDB.seConnecter();
        String requete = "UPDATE VIP SET numVip=?, prenomVip=?, nomVIP=?, sexeVip=?, dateNaissanceVip=?,"
                + "lieuNaissanceVip=?, statutVip=?, roleVip=? WHERE numVip=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, leVip.getNumVip());
        pstmt.setString(2, leVip.getPrenomVip());
        pstmt.setString(3, leVip.getNomVip());
        pstmt.setString(4, leVip.getSexeVip());
        pstmt.setDate(5, Date.valueOf(leVip.getDateNaissanceVip()));
        pstmt.setString(6, leVip.getLieuNaissanceVip());
        pstmt.setString(7, leVip.getStatutVip());
        pstmt.setString(8, leVip.getRoleVip());
        pstmt.setInt(9, oldNum);
        pstmt.executeUpdate();

        pstmt.close();
        cnx.close();

    }

}
