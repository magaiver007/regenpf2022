package com.movies.acmeflix.repository;

import com.movies.acmeflix.model.Movie;
import com.movies.acmeflix.model.enumeration.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findAllByTitle(String title);

    @Query(value = "SELECT ROUND(SUM(VIEWS.DURATION)/60,2) AS HOURS_VIEWED, TITLE FROM MOVIES,VIEWS " +
            "WHERE MOVIES.ID = VIEWS.MOVIE_ID " +
            "GROUP BY TITLE " +
            "ORDER BY HOURS_VIEWED " +
            "DESC LIMIT 10", nativeQuery = true)
    List<Movie>findTop10ByTotalViews();

    @Query(value="SELECT AVG(RATING) AS AVG_RATING, TITLE FROM RATINGS,MOVIES WHERE MOVIE_ID= MOVIES.ID\n" +
            "GROUP BY TITLE ORDER BY AVG_RATING DESC LIMIT 10;", nativeQuery = true)
    List<Movie>findTop10ByAvgRate();

    @Query(value = "SELECT COUNT(VIEWS.MOVIE_ID) AS MOST_VIEWED, CATEGORY FROM MOVIES,VIEWS WHERE MOVIES.ID = VIEWS.MOVIE_ID\n" +
            "GROUP BY CATEGORY ORDER BY MOST_VIEWED DESC LIMIT 5;", nativeQuery = true)
    List<Movie>findTop5Popular();
}
