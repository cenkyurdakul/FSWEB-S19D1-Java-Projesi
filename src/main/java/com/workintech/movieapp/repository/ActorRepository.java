package com.workintech.movieapp.repository;

import com.workintech.movieapp.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
