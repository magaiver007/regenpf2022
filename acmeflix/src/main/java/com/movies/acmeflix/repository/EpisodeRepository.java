package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EpisodeRepository extends JpaRepository<Episode, Long> {
    Episode findAllByTitle(String title);
}
