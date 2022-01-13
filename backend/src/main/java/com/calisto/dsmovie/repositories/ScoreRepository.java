package com.calisto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calisto.dsmovie.entities.Score;
import com.calisto.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
}
