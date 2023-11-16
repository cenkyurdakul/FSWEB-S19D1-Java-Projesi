package com.workintech.movieapp.service;

import com.workintech.movieapp.entity.Actor;

import com.workintech.movieapp.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService{

    private ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findById(int id) {
        Optional<Actor> actorOptional = actorRepository.findById(id);
        if(actorOptional.isPresent()){
            return actorOptional.get();
        }
        throw new RuntimeException("ıd  is not exist: " + id);
    }

    @Override
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor delete(int id) {
        Actor actor = findById(id);
        actorRepository.delete(actor);
        return actor;
    }
}
