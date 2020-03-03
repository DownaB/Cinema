package com.ocr.downa2;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title;
    int releaseYear;
    int duration;
    Kind genre;
    int director_id;
    List<Integer> actor;


    public Movie(String title,int director_id, int releaseYear, List<Integer> actor, int duration, Kind genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.director_id = director_id;
        this.genre = genre;
        this.actor= actor;


    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public Kind getGenre() {
        return genre;
    }
    public int getDirector_id () {
        return director_id;
    }

    public List<Integer> getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return " Titre " + getTitle() + " sortie en " + getReleaseYear() + " qui dure " +  getDuration() + " min de type " + getGenre() + " , acteurs principaux " + getActor() + " réalisé par " + getDirector_id() ;
    }
}

