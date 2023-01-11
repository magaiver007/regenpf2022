package com.movies.acmeflix.repository;


import com.movies.acmeflix.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EpisodeRepository extends JpaRepository<Episode, Long> {
    List<Episode> findAllBySeasonOrderByIdDesc();
}
