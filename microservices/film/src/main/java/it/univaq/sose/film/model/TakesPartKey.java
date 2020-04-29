package it.univaq.sose.film.model;

import java.io.Serializable;
import java.util.Objects;

public class TakesPartKey implements Serializable {
    private String filmId;
    private int personId;

    public TakesPartKey() {}

    public TakesPartKey(String filmId, int personId) {
        this.filmId = filmId;
        this.personId = personId;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakesPartKey that = (TakesPartKey) o;
        return personId == that.personId &&
                filmId.equals(that.filmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, personId);
    }
}