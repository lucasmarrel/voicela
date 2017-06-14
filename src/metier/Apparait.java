/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author p1522867
 */
public class Apparait {

    private int numVip;
    private String idPhoto;

    public Apparait() {
    }

    public Apparait(int numVip, String idPhoto) {
        this.numVip = numVip;
        this.idPhoto = idPhoto;
    }

    public int getNumVip() {
        return numVip;
    }

    public void setNumVip(int numVip) {
        this.numVip = numVip;
    }

    public String getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }

    @Override
    public String toString() {
        return "Apparait{" + "numVip=" + numVip + ", idPhoto=" + idPhoto + '}';
    }

}
