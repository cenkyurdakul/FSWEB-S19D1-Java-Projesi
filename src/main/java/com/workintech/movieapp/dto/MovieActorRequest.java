package com.workintech.movieapp.dto;

import com.workintech.movieapp.entity.Actor;
import com.workintech.movieapp.entity.Movie;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MovieActorRequest {
    private Movie movie;
    private List<Actor> actorList;
}
