/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class Vip {

    private int numVip;
    private String nomVip;
    private String prenomVip;
    private String sexeVip;
    private LocalDate dateNaissanceVip;
    private String lieuNaissanceVip;
    private String statutVip;
    private String roleVip;

    public Vip() {
    }

    public Vip(int numVip, String prenomVip , String nomVip, String sexeVip, LocalDate dateNaissanceVip, String lieuNaissanceVip, String statutVip, String roleVip) {
        this.numVip = numVip;
        this.nomVip = nomVip;
        this.prenomVip = prenomVip;
        this.sexeVip = sexeVip;
        this.dateNaissanceVip = dateNaissanceVip;
        this.lieuNaissanceVip = lieuNaissanceVip;
        this.statutVip = statutVip;
        this.roleVip = roleVip;
    }

    

    public int getNumVip() {
        return numVip;
    }

    public void setNumVip(int numVip) {
        this.numVip = numVip;
    }

    public String getNomVip() {
        return nomVip;
    }

    public void setNomVip(String nomVip) {
        this.nomVip = nomVip;
    }

    public String getPrenomVip() {
        return prenomVip;
    }

    public void setPrenomVip(String prenomVip) {
        this.prenomVip = prenomVip;
    }

    public String getSexeVip() {
        return sexeVip;
    }

    public void setSexeVip(String sexeVip) {
        this.sexeVip = sexeVip;
    }

    public LocalDate getDateNaissanceVip() {
        return dateNaissanceVip;
    }

    public void setDateNaissanceVip(LocalDate dateNaissanceVip) {
        this.dateNaissanceVip = dateNaissanceVip;
    }

    public String getLieuNaissanceVip() {
        return lieuNaissanceVip;
    }

    public void setLieuNaissanceVip(String lieuNaissanceVip) {
        this.lieuNaissanceVip = lieuNaissanceVip;
    }

    public String getStatutVip() {
        return statutVip;
    }

    public void setStatutVip(String statutVip) {
        this.statutVip = statutVip;
    }

    public String getRoleVip() {
        return roleVip;
    }

    public void setRoleVip(String roleVip) {
        this.roleVip = roleVip;
    }

    @Override
    public String toString() {
        return "Vip{" + "numVip=" + numVip + ", nomVip=" + nomVip + ", prenomVip=" + prenomVip + ", sexeVip=" + sexeVip + ", dateNaissanceVip=" + dateNaissanceVip + ", lieuNaissanceVip=" + lieuNaissanceVip + ", statutVip=" + statutVip + ", roleVip=" + roleVip + '}';
    }

}
