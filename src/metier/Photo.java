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
public class Photo {

    private String idPhoto;
    private String lieuPhoto;
    private int anneePhoto;

    public Photo(String idPhoto, String lieuPhoto, int anneePhoto) {
        this.idPhoto = idPhoto;
        this.lieuPhoto = lieuPhoto;
        this.anneePhoto = anneePhoto;
    }

    public Photo() {
    }

    public String getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getLieuPhoto() {
        return lieuPhoto;
    }

    public void setLieuPhoto(String lieuPhoto) {
        this.lieuPhoto = lieuPhoto;
    }

    public int getAnneePhoto() {
        return anneePhoto;
    }

    public void setAnneePhoto(int anneePhoto) {
        this.anneePhoto = anneePhoto;
    }

    @Override
    public String toString() {
        return "Photo{" + "idPhoto=" + idPhoto + ", lieuPhoto=" + lieuPhoto + ", anneePhoto=" + anneePhoto + '}';
    }

}
