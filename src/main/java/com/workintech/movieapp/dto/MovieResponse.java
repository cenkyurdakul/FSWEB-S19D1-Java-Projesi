package com.workintech.movieapp.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class MovieResponse {
    private int id;
    private String name;
    private String director_name;
    private int rating;
    private LocalDate releaseDate;
    private List<ActorResponse> actors = new ArrayList<>();

    public MovieResponse(int id, String name, String director_name, int rating, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.director_name = director_name;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    public MovieResponse(int id, String name, String director_name, int rating, LocalDate releaseDate, List<ActorResponse> actors) {
        this.id = id;
        this.name = name;
        this.director_name = director_name;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.actors = actors;
    }
}
