package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    //List<Movie> findTop10ByTotalViews(int totalViews);

    //List<Movie> findTop10ByAvgRating(double avgRating);
}
