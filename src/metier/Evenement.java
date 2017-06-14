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
public class Evenement {

    private int vip1;
    private String nomVip1;
    private int vip2;
    private String nomVip2;
    private LocalDate dateMariage;
    private String lieuMariage;
    private LocalDate dateDivorce;

    public Evenement() {
    }

    public Evenement(int vip1, String nomVip1, int vip2, String nomVip2, LocalDate dateMariage, String lieuMariage, LocalDate dateDivorce) {
        this.vip1 = vip1;
        this.nomVip1 = nomVip1;
        this.vip2 = vip2;
        this.nomVip2 = nomVip2;
        this.dateMariage = dateMariage;
        this.lieuMariage = lieuMariage;
        this.dateDivorce = dateDivorce;
    }

    

    public int getVip1() {
        return vip1;
    }

    public void setVip1(int Vip1) {
        this.vip1 = Vip1;
    }

    public LocalDate getDateMariage() {
        return dateMariage;
    }

    public void setDateMariage(LocalDate dateMariage) {
        this.dateMariage = dateMariage;
    }

    public int getVip2() {
        return vip2;
    }

    public void setVip2(int Vip2) {
        this.vip2 = Vip2;
    }

    public String getLieuMariage() {
        return lieuMariage;
    }

    public void setLieuMariage(String lieuMariage) {
        this.lieuMariage = lieuMariage;
    }

    public LocalDate getDateDivorce() {
        return dateDivorce;
    }

    public void setDateDivorce(LocalDate dateDivorce) {
        this.dateDivorce = dateDivorce;
    }

    @Override
    public String toString() {
        return "Evenement{" + "Vip1=" + vip1 + ", dateMariage=" + dateMariage + ", Vip2=" + vip2 + ", lieuMariage=" + lieuMariage + ", dateDivorce=" + dateDivorce + '}';
    }

    public String getNomVip1() {
        return nomVip1;
    }

    public void setNomVip1(String nomVip1) {
        this.nomVip1 = nomVip1;
    }

    public String getNomVip2() {
        return nomVip2;
    }

    public void setNomVip2(String nomVip2) {
        this.nomVip2 = nomVip2;
    }
    
    

}
