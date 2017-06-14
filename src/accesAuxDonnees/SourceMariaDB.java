/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lucas
 */
public class SourceMariaDB {

    public static Connection seConnecter() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Driver ok!");
            String url = "jdbc:mysql://134.214.115.116/p1522867";
            String username = "p1522867";
            String password = "260410";

            Connection cnx = DriverManager.getConnection(url, username, password);

            //System.out.println("Connexion bien établie !");
            return cnx;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
