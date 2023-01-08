package com.movies.acmeflix.model.MovieModel.repository;

import com.movies.acmeflix.model.MovieModel.Series;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SerieRepository extends JpaRepository<Series, Long> {

    List<Series> findTopByTotalViews(int totalViews);

    List<Series> findTopByAvgRating(double avgRating);
}
