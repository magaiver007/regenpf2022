package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeriesRepository extends JpaRepository<Series, Long> {

    //List<Series> findTopByTotalViews(int totalViews);

    //List<Series> findTopByAvgRating(double avgRating);
}
