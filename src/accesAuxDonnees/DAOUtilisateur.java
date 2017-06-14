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

/**
 *
 * @author lucas
 */
public class DAOUtilisateur {

    Connection cnx;

    public DAOUtilisateur() {

    }

    public int checkLogin(String username, String password) throws SQLException, Exception {
        int etatLogin = -1;
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT id FROM USER where username = ? and password=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rst = pstmt.executeQuery();

        if (rst.next()) {
            etatLogin = rst.getInt(1);
        }

        rst.close();
        pstmt.close();
        cnx.close();

        return etatLogin;

    }

    public String getName(int id) throws SQLException, Exception {
        String nom = "";
        cnx = SourceMariaDB.seConnecter();

        String requete = "SELECT name FROM USER where id=?";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setInt(1, id);
        ResultSet rst = pstmt.executeQuery();

        if (rst.next()) {
            nom = rst.getString(1);
        }

        rst.close();
        pstmt.close();
        cnx.close();

        return nom;

    }

}
