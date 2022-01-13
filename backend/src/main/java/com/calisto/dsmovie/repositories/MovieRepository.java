package com.calisto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calisto.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
