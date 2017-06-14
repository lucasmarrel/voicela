/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author lucas
 */
public class ModelComboBox {

    private static final String[] listeSexe = {"M", "F"};
    private static final String[] listeRole = {"Acteur", "Réalisateur", "Acteur-Réalisateur"};
    private static final String[] listeStatut = {"Célibataire", "Marié", "Divorcé"};

    public static String[] listeSexe() {
        return listeSexe;
    }

    public static String[] listeStatut() {
        return listeStatut;
    }

    public static String[] listeRole() {
        return listeRole;
    }

}
