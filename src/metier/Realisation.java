/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author lucas
 */
public class Realisation {

    private int numVisa;
    private String titreFilm;
    private int numVip;
    private String nomVip;

    public Realisation() {
    }

    public Realisation(int numVisa, String titreFilm, int numVip, String nomVip) {
        this.numVisa = numVisa;
        this.titreFilm = titreFilm;
        this.numVip = numVip;
        this.nomVip = nomVip;
    }
        

    public String getTitreFilm() {
        return titreFilm;
    }

    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public String getNomVip() {
        return nomVip;
    }

    public void setNomVip(String nomVip) {
        this.nomVip = nomVip;
    }

    
    public int getNumVisa() {
        return numVisa;
    }

    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }

    public int getNumVip() {
        return numVip;
    }

    public void setNumVip(int numVip) {
        this.numVip = numVip;
    }

    @Override
    public String toString() {
        return "Casting{" + "numVisa=" + numVisa + ", titreFilm=" + titreFilm + ", numVip=" + numVip + ", nomVip=" + nomVip + '}';
    }

}
