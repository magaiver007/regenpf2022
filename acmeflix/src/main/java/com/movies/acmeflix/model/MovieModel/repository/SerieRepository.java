package com.movies.acmeflix.model.MovieModel.repository;

import com.movies.acmeflix.model.MovieModel.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    List<Serie> findTopByTotalViews(int totalViews);

    List<Serie> findTopByAvgRating(double avgRating);
}
