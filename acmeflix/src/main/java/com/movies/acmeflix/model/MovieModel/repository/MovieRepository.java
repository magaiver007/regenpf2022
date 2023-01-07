package com.movies.acmeflix.model.MovieModel.repository;

import com.movies.acmeflix.model.MovieModel.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findTop10ByTotalViews(int totalViews);

    List<Movie> findTop10ByAvgRating(double avgRating);
}
