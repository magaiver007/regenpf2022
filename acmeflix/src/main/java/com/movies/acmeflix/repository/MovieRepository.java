package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    //findTop10ByTotalViews(int totalViews);

    //List<Movie> findTop10ByAvgRating(double avgRating);
}
