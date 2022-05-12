package com.santarelle.movie.repositories;

import com.santarelle.movie.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
