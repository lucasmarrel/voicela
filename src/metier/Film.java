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
public class Film {

    private int numVisa;
    private String titreFilm;
    private int anneeSortie;
    private String genreFilm;

    public Film() {
    }

    public Film(int numVisa, String titreFilm, int anneeSortie, String genreFilm) {
        this.numVisa = numVisa;
        this.titreFilm = titreFilm;
        this.anneeSortie = anneeSortie;
        this.genreFilm = genreFilm;
    }

    public int getNumVisa() {
        return numVisa;
    }

    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }

    public String getTitreFilm() {
        return titreFilm;
    }

    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    @Override
    public String toString() {
        return "Film{" + "numVisa=" + numVisa + ", titreFilm=" + titreFilm + ", anneeSortie=" + anneeSortie + ", genreFilm=" + genreFilm + '}';
    }

}
