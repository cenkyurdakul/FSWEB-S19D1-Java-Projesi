package com.workintech.movieapp.service;

import com.workintech.movieapp.entity.Movie;
import com.workintech.movieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(int id) {
        Optional<Movie> movieOptional = movieRepository.findById(id);
        if(movieOptional.isPresent()){
            return movieOptional.get();
        }
        throw new RuntimeException("ıd  is not exist: " + id);
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie delete(int id) {
        Movie movie = findById(id);
        movieRepository.delete(movie);
        return movie;
    }
}
