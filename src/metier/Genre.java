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
public class Genre {

    private String genreFilm;

    public Genre() {
    }

    public Genre(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    @Override
    public String toString() {
        return "Genre{" + "genreFilm=" + genreFilm + '}';
    }

}
